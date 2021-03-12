package com.company;

public class SingletonConditionalLock {
    private static SingletonConditionalLock uniqueInstance;

    private SingletonConditionalLock() {}

    public static SingletonConditionalLock getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonConditionalLock.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonConditionalLock();
                }
            }
        }
        return uniqueInstance;
    }
}
