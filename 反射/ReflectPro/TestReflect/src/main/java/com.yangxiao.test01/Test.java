package com.yangxiao.test01;

public class Test {
    public static void main(String[] args) {
//        微信支付
        new WeChat().payOnline();
//        支付宝
        new AliPay().payOnline();
//        -> 分支 if else switch
//        定义一个字符串，模拟前台的支付方式
        String str = "微信";
//        这个写法 避免空指针异常
        if ("微信".equals(str)) {
            new WeChat().payOnline();
            pay(new WeChat());
        }
        if ("支付宝".equals(str)) {
            new AliPay().payOnline();
            pay(new AliPay());
        }

        if ("招商银行".equals(str)) {
            new YinHangKa().payOnline();
            pay(new YinHangKa());
        }
    }

/*
    public  static  void pay(WeChat weChat) {
        weChat.payOnline();
    }

    public  static  void pay(AliPay aliPay) {
        aliPay.payOnline();
    }
    public  static  void pay(YinHangKa yinHangKa) {
        yinHangKa.payOnline();
    }
*/
// 多态的扩展性 没有达到最好，
    public static void pay(Mtwm m) {
        m.payOnline();
    }
//    解决办法： 反射机制
}
