package com.shanghai.day1;

import com.shanghai.day1.entity.Order;
import com.shanghai.day1.service.OrderServiceFactory;

public class ExamClient {

    public static void register(Order order){
        OrderServiceFactory.getOrderService(order.value).register(order);
    }


    public static void approve(Order order){
        OrderServiceFactory.getOrderService(order.value).approve(order);
    }


    public static void reject(Order order){
        OrderServiceFactory.getOrderService(order.value).reject(order);
    }


    public static void exam(Order order){
        OrderServiceFactory.getOrderService(order.value).exam(order);
    }


    public static void finish(Order order){
        OrderServiceFactory.getOrderService(order.value).finish(order);
    }

}
