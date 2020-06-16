package com.wanchao.ext.proxy.Impl;

import com.wanchao.ext.proxy.MyExtJdkInvocationHandler;

import java.lang.reflect.Method;

public class MyJdkInvocationHandler implements MyExtJdkInvocationHandler {
    //目标对象
    private Object target;
    public MyJdkInvocationHandler(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("纯手写jdk动态代理开始。。。");
        Object result = method.invoke(target, args);//使用java反射技术执行
        System.out.println("纯手写jdk动态代理结束。。。");
        return result;
    }
}
