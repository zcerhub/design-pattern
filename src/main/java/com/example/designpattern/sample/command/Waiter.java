package com.example.designpattern.sample.command;

/*
* 服务生找到客人
* */
public class Waiter {

    /*
     * 客人点单
     * */
    public void receiver(String command) {
        System.out.println("你选择了：" + command);
        switch (command) {
            case "烧仙草":
                new ShaoxiancaoMilk().build();
                break;
            case "草莓奶茶":
                new StrawberryMilk().build();
                break;
            case "丝袜奶茶":
                new SilkMilk().build();
                break;
            default:
                System.out.println("抱歉，没有这样的品牌");
        }
//        如果再扩展了奶茶品牌，就具有了不同的做法，需要修改这里的代码
    }

    public void showMenu() {
        System.out.println("老板你好，本店有以下的奶茶");
        System.out.println("\t 烧仙草");
        System.out.println("\t 草莓奶茶");
        System.out.println("\t 丝袜奶茶");
    }
}
