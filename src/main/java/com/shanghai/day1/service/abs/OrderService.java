package com.shanghai.day1.service.abs;

import com.shanghai.day1.entity.Order;

public abstract class OrderService {

    public void register(Order order){
        throw new RuntimeException("Unsupport order");
    }
    public void approve(Order order){
        throw new RuntimeException("Unsupport order");
    }
    public void reject(Order order){
        throw new RuntimeException("Unsupport order");
    }
    public void exam(Order order){
        throw new RuntimeException("Unsupport order");
    }
    public void finish(Order order){
        throw new RuntimeException("Unsupport order");
    }
}
