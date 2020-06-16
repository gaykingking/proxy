package com.wanchao.ext.proxy;

import com.wanchao.service.OrderService;

import java.lang.reflect.Method;

public class Proxy1 implements OrderService {
    private MyExtJdkInvocationHandler h;
    public Proxy1(MyExtJdkInvocationHandler h){
        this.h=h;
    }
    public void order() throws Throwable {
        //获取真是目标方法
        Method orderMethod=OrderService.class.getMethod("order",new Class[]{});
        this.h.invoke(this,orderMethod,null);
    }
}
