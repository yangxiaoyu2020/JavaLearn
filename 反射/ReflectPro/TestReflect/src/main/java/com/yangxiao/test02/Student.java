package com.yangxiao.test02;

public class Student extends Person {

    private int sno; // 学号

    double height;

    protected  double weight;

    public double score;

    public String showInfo() {
        System.out.println("我是三号学生");
        return "我是三号学生";
    }

    public void work() {
        System.out.println("我是 loser");
    }

    public Student() {
        System.out.println("空的构造器");
    }

    private Student(int sno) {
        this.sno = sno;
    }

    Student(int sno, double weight) {
        this.sno = sno;
        this.weight = weight;
    }




}
