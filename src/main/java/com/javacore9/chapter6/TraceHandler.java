package com.javacore9.chapter6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kabu_hu on 14-6-17.
 */
public class TraceHandler implements InvocationHandler {

    private Object target;
    public TraceHandler(Object t)
    {
        target = t;
    }
    public Object invoke(Object proxy, Method m, Object[] args)
            throws Throwable
    {
        // print method name and parameters
        // invoke actual method
        return m.invoke(target, args);
    }
}
