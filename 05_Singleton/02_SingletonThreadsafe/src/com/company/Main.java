package com.company;

public class Main {
    public static void main(String[] args) {
        SingletonSync singletonSync = SingletonSync.getInstance();
        SingletonConditionalLock singletonConditionalLock = SingletonConditionalLock.getInstance();
    }
}
