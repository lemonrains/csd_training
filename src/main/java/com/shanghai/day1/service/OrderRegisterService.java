package com.shanghai.day1.service;

import com.shanghai.day1.entity.Order;
import com.shanghai.day1.entity.OrderEnum;
import com.shanghai.day1.service.abs.OrderService;

public class OrderRegisterService extends OrderService {
    @Override
    public void approve(Order order) {
        order.value = OrderEnum.APPROVED;
    }

    @Override
    public void reject(Order order) {
        order.value = OrderEnum.REJECTED;
    }
}
