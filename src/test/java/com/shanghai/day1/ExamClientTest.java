package com.shanghai.day1;

import com.shanghai.day1.entity.Order;
import com.shanghai.day1.entity.OrderEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExamClientTest {


    /**
     * 注册->承认->考试->完成
     */
    @Test
    public void case1() {

        Order order = new Order();
        order.value = OrderEnum.INIT;

        // 注册
        ExamClient.register(order);
        assertEquals(OrderEnum.REGISTED, order.value);

        // 承认
        ExamClient.approve(order);
        assertEquals(OrderEnum.APPROVED, order.value);

        // 考试
        ExamClient.exam(order);
        assertEquals(OrderEnum.EXAMED, order.value);

        // 完成
        ExamClient.finish(order);
        assertEquals(OrderEnum.FINISH, order.value);

    }


    /**
     * 注册->拒绝->承认->考试->完成
     */
    @Test
    public void case2() {

        Order order = new Order();
        order.value = OrderEnum.INIT;

        // 注册
        ExamClient.register(order);
        assertEquals(OrderEnum.REGISTED, order.value);

        // 拒绝
        ExamClient.reject(order);
        assertEquals(OrderEnum.REJECTED, order.value);

        // 承认
        ExamClient.approve(order);
        assertEquals(OrderEnum.APPROVED, order.value);

        // 考试
        ExamClient.exam(order);
        assertEquals(OrderEnum.EXAMED, order.value);

        // 完成
        ExamClient.finish(order);
        assertEquals(OrderEnum.FINISH, order.value);

    }

    /**
     * 注册->考试
     */
    @Test(expected = RuntimeException.class)
    public void case3() {

        Order order = new Order();
        order.value = OrderEnum.INIT;

        // 注册
        ExamClient.register(order);
        assertEquals(OrderEnum.REGISTED, order.value);

        // 考试
        ExamClient.exam(order);
        assertEquals(OrderEnum.EXAMED, order.value);
    }
}