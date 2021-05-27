package com.yangxiao.test02;

public class Test {
    // 获取字节码信息的四种方式
    public static void main(String[] args) throws Exception{
        //    1
        Person p = new Person();
        Class<?> c1 = p.getClass();
        System.out.println(c1);

//    2 通过内置class属性
        Class<?> c2  = Person.class;
        System.out.println(c2);
        System.out.println(c1 == c2);
//       方式一方式二不常用

//    3 调用class类提供的静态的方法 用的最多
        Class<?> c3 = Class.forName("com.yangxiao.test02.Person");

//    4 了解 利用类的加载器
        ClassLoader loader =  Test.class.getClassLoader();
//      系统的类加载器
        loader.loadClass("com.yangxiao.test02.Person");

    }

}
