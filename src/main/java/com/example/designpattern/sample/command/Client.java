package com.example.designpattern.sample.command;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        waitress();
//        waiter();
    }

    private static void waitress() {
        Waitress waitress = new Waitress();
        waitress.register("原味奶茶",new TasteMilk());
        waitress.register("木瓜奶茶",new PawpawMilk());
        waitress.showMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择：");
//        发送内容
        String cmd = scanner.nextLine();
        waitress.receiver(cmd);
        scanner.close();
    }

    private static void waiter() {
        Waiter waiter = new Waiter();
        waiter.showMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择：");
//        发送内容
        String command = scanner.nextLine();
        waiter.receiver(command);
        scanner.close();
    }

}
