package com.javacore9.chapter6.proxies;

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
        // print implicit argument
        System.out.print(target);
        // print method name
        System.out.print("." + m.getName() + "(");
        // print explicit arguments
        if (args != null)
        {
            for (int i = 0; i < args.length; i++)
            {
                System.out.print(args[i]);
                if (i < args.length - 1) System.out.print(", ");
            }
        }
        System.out.println(")");
        // invoke actual method
        return m.invoke(target, args);
    }
}
