package com.example.designpattern.sample.singleton;

public class DCLazySingleton {

//    volitile关键字很关键
    private static volatile DCLazySingleton instance;

    private DCLazySingleton() {

    }

    public static DCLazySingleton getInstance() {
        if (instance == null) {
            synchronized (DCLazySingleton.class) {
                if (instance == null) {
                    instance = new DCLazySingleton();
                }
            }
        }
        return instance;
    }

}
