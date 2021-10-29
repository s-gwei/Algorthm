package com.sun.jvm.summary;

/**
 * @author shkstart  shkstart@126.com
 * @create 2020  14:57
 *
 * 打印堆内存情况 -XX:+PrintGCDetails
 */
public class LocalVarGC {
    public void localvarGC1() {
        byte[] buffer = new byte[10 * 1024 * 1024 * 1024];//10MB
//        System.gc();
    }

    public void localvarGC2() {
        byte[] buffer = new byte[10 * 1024 * 1024];
        buffer = null;
        System.gc();
    }

    //
    public void localvarGC3() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        System.gc();
    }

    public void localvarGC4() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        int value = 10;
        System.gc();
    }

    public void localvarGC5() {
        localvarGC1();
        System.gc();
    }

    public static void main(String[] args) {
//        LocalVarGC local = new LocalVarGC();
        byte[] buffer = new byte[1024 * 1024 * 1024 * 1024* 1024];//10MB
        System.out.println(buffer.length);
    }
}
