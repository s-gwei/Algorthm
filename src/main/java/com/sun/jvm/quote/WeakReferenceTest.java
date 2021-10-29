package com.sun.jvm.quote;


import java.lang.ref.WeakReference;

/**
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  16:06
 */
public class WeakReferenceTest {
    public static class User {
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int id;
        public String name;

        @Override
        public String toString() {
            return "[id=" + id + ", name=" + name + "] ";
        }
    }

    public static void main(String[] args) {
        //构造了弱引用,发现即回收
        User u1 = new User(1,"songhk");
//        WeakReference<User> userWeakRef = new WeakReference<User>(new User(1, "songhk"));

        WeakReference<User> userWeakRef = new WeakReference<User>(u1);
//        u1 = null;
        //从弱引用中重新获取对象
        System.out.println(userWeakRef.get());

        System.gc();
        // 不管当前内存空间足够与否，都会回收它的内存
        System.out.println("After GC:");
        //重新尝试从弱引用中获取对象
        System.out.println(userWeakRef.get());
    }
}