package com.example.designpattern.sample.adapter;
/*
* 插线板对象适配器
* 提供两孔、三孔插座
*
* */
public class PlugBoardAdapter implements TwoPlug{

    private ThreeHoleSocket powerSocket;
    private String ew = "PlugBoardAdapter's earthWire";

    public void linkSocket(ThreeHoleSocket socket) {
        powerSocket = socket;
    }

    @Override
    public void power(String positive, String negative) {
        powerSocket.link(positive,negative,ew);
    }

    @Override
    public void shutDown() {
        System.out.println("拔掉插线板插头");
    }

    public void power(String positive, String negative,String ew) {
        powerSocket.link(positive,negative,ew);
    }

}
