package com.sun.concurrent.aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AQSTest {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean f1 = flag1 && say("1");
        boolean f2 = flag2 && say("1");
    }
    private static boolean say(String s) {
        System.out.println("hello"+s);
        return false;
    }
}
