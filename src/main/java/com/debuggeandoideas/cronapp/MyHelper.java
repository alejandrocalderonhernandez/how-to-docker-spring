package com.debuggeandoideas.cronapp;

public class MyHelper {

    public static Long times = 0L;

    public static Long times() {
        System.out.println("Execute task task every 2 seconds " + times++);
        return times;
    }
}
