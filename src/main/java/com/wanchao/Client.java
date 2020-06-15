package com.wanchao;

import com.wanchao.service.OrderService;
import com.wanchao.service.impl.OrderServiceImpl;
import com.wanchao.service.proxy.OrderServiceProxy;

public class Client {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceProxy(new OrderServiceImpl());
        orderService.order();
    }
}
