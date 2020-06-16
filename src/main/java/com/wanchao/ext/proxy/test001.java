package com.wanchao.ext.proxy;

import com.wanchao.ext.proxy.Impl.MyJdkInvocationHandler;
import com.wanchao.service.OrderService;
import com.wanchao.service.impl.OrderServiceImpl;

public class test001 {
    public static void main(String[] args) throws Throwable {
        OrderService orderService=new Proxy1(new MyJdkInvocationHandler(new OrderServiceImpl()));
        orderService.order();
    }
}
