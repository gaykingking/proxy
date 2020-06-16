package com.wanchao.ext.proxy;

import java.lang.reflect.Method;


public interface MyExtJdkInvocationHandler {
    /**
     * proxy 代理类
     * method 目标方法
     * args 参数
     */
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable;
}
