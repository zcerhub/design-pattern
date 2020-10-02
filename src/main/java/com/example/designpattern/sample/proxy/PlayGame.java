package com.example.designpattern.sample.proxy;

import com.example.designpattern.sample.proxy.staticproxy.TeacherCang;
import com.example.designpattern.sample.proxy.staticproxy.Tony;
import com.example.designpattern.sample.proxy.staticproxy.TuHao;

public class PlayGame {

    public static void main(String[] args) {
        TuHao tuHao = new TuHao(1.8F);
        Girl tc = new TeacherCang();
//        静态代理
        Tony tony = new Tony(tc);
        tuHao.dating(tony);

        System.out.println("------------------------------");
//          JDK动态代理
        Girl tony1 = (Girl) TonyCompany.proxy(tc);
        tuHao.dating(tony1);

        Boy tcc = new TeacherChen();
        Boy tony2 = (Boy) TonyCompany.proxy(tcc);
        tony2.dating('E');
        tony2.show();
        ProxyUtils.generateClassFile(Boy.class,tony2.getClass().getName());
    }

}
