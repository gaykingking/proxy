package com.wanchao.service.cglib.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(">>>cglib日志收集开始");
        Object result=methodProxy.invokeSuper(o,objects);
        System.out.println(">>>cglib日志收集结束");
        return result;
    }
}
