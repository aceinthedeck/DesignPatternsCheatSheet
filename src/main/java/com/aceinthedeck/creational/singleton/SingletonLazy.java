package com.aceinthedeck.creational.singleton;

public class SingletonLazy {

    private static SingletonLazy instance = null;

    private SingletonLazy(){

        if(instance!=null){
            throw new RuntimeException("Use getInstance() method to create");
        }

    }

    public static SingletonLazy getInstance(){

        if(instance==null){
            synchronized (SingletonLazy.class){
                if(instance==null){
                    instance = new SingletonLazy();
                }
            }
            instance = new SingletonLazy();
        }

        return instance;
    }

}
