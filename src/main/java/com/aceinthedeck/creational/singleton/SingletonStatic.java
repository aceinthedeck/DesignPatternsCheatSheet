package com.aceinthedeck.creational.singleton;

public class SingletonStatic {

    private static SingletonStatic instance = new SingletonStatic();

    private SingletonStatic(){

    }

    public static SingletonStatic getInstance(){
        return instance;
    }


}
