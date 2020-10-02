package com.example.designpattern.sample.command;

import java.util.HashMap;
import java.util.Map;

/*
* 女服务生招待客人
* */
public class Waitress {
    private Map<String, Command> commandMap = new HashMap<>();

    public void register(String cmd, Command run) {
        commandMap.put(cmd, run);
    }

    /*
     * 客人点单
     * */
    public void receiver(String command) {
        System.out.println(String.format("你选择了%s",command));
        Command cmd = commandMap.get(command);
        if (cmd == null) {
            System.out.println("没有这样的品牌");
        }else {
            cmd.build();
        }
    }

    public void showMenu() {
        System.out.println("老板你好，本店有以下的奶茶");
        commandMap.keySet().forEach(cmd->{
            System.out.println("\t"+cmd);
        });
    }

}
