package com.yangxiao.test01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//利用反射实现功能
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        微信的全限定路劲 模拟前台的
        String str = "com.yangxiao.test01.WeChat";
//        反射代码 这里的代码不许要再 改了
        Class<?> cls = Class.forName(str);
        Object o = cls.newInstance();
        Method method = cls.getMethod("payOnline");
        method.invoke(o);
    }
}
