package com.yangxiao.test03;

import com.yangxiao.test02.Student;

import java.lang.reflect.Constructor;

public class Test01 {
    public static void main(String[] args) throws Exception{
        Class cls = Student.class;
        Constructor[] constructors = cls.getConstructors();
//        这个只能是public的构造器
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();

//        获取指定的构造器
//        默认是空构造器
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);

        Constructor constructo1 = cls.getConstructor(double.class, double.class);
        System.out.println(constructo1);

//        得到private的构造器
        Constructor constructo2 = cls.getDeclaredConstructor(int.class);
        System.out.println(constructo2);

        Object o = constructor.newInstance();
        System.out.println(o);

        Object o1 = constructo1.newInstance(10.1, 11.2);
        System.out.println(o1);

    }
}
