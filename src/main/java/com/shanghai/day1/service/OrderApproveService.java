package com.shanghai.day1.service;

import com.shanghai.day1.entity.Order;
import com.shanghai.day1.entity.OrderEnum;
import com.shanghai.day1.service.abs.OrderService;

public class OrderApproveService extends OrderService {
    @Override
    public void exam(Order order) {
        order.value = OrderEnum.EXAMED;
    }
}
