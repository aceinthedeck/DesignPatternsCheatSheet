package com.aceinthedeck.creational.singleton;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe instance;

    private SingletonThreadSafe(){}

    public static SingletonThreadSafe getInstance(){

        if(instance==null){
            instance = new SingletonThreadSafe();
        }

        return instance;

    }

}
