package com.wanchao.service.proxy;

import com.wanchao.service.OrderService;

public class OrderServiceProxy implements OrderService {
    /**
     * 被代理对象
     */
    private OrderService orderService;
    public OrderServiceProxy(OrderService orderService){
        this.orderService=orderService;
    }
    /**
     * 1.实现静态代理
     */
    @Override
    public void order() throws Throwable {
        System.out.println(">>>打印订单日志开始");
        orderService.order();//执行order业务逻辑
        System.out.println(">>>打印订单日志结束");
    }

}
