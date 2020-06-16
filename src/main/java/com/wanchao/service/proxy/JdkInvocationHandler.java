package com.wanchao.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkInvocationHandler implements InvocationHandler {
    //被代理类对象
    private Object target;
    public JdkInvocationHandler(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>jdk打印订单日志开始:proxy:"+proxy.getClass().toString());
        Object result=method.invoke(target,args);//java的反射机制执行方法 执行目标对象方法
        System.out.println(">>>jdk打印订单日志结束");
        return result;
    }
    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
