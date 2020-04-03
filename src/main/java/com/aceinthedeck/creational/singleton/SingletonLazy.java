package com.aceinthedeck.creational.singleton;

public class SingletonLazy {

    private static SingletonLazy instance = null;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){

        if(instance==null){
            instance = new SingletonLazy();
            return instance;
        }

        return instance;
    }

}
