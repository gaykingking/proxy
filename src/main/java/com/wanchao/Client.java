package com.wanchao;

import com.wanchao.service.OrderService;
import com.wanchao.service.cglib.proxy.CglibMethodInterceptor;
import com.wanchao.service.impl.OrderServiceImpl;
import com.wanchao.service.proxy.JdkInvocationHandler;
import com.wanchao.service.proxy.OrderServiceProxy;
import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        /*OrderService orderService = new OrderServiceProxy(new OrderServiceImpl());
        orderService.order();*/
        //1.使用jdk动态代理
        /*System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles",true);
        OrderService proxy=new JdkInvocationHandler(new OrderServiceImpl()).getProxy();
        proxy.order();*/
        //2.使用cglib动态代理
        CglibMethodInterceptor cglibMethodInterceptor=new CglibMethodInterceptor();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(OrderServiceImpl.class);
        enhancer.setCallback(cglibMethodInterceptor);
        OrderServiceImpl orderServiceImpl= (OrderServiceImpl) enhancer.create();
        orderServiceImpl.order();
    }
}
