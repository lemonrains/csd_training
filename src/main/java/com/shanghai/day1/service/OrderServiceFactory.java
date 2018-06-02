package com.shanghai.day1.service;

import com.shanghai.day1.entity.OrderEnum;
import com.shanghai.day1.service.abs.OrderService;

public class OrderServiceFactory {

    public static OrderService getOrderService(OrderEnum orderEnum) {

        switch (orderEnum) {
            case INIT: return new OrderInitService();
            case REGISTED: return new OrderRegisterService();
            case APPROVED: return new OrderApproveService();
            case REJECTED:return new OrderRejectService();
            case EXAMED:return new OrderExamService();
            case FINISH:return new OrderFinishService();
            default: throw new RuntimeException("Unsupport order");
        }

    }
}
