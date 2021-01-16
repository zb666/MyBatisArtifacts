package com.gupao.mybatis.jul;

import org.openjdk.jol.info.ClassLayout;

public class ClassLayoutDemo {
    public static void main(String[] args) {
        ClassLayoutDemo classLayoutDemo = new ClassLayoutDemo();
        synchronized (classLayoutDemo) {
            System.out.println("Locking");
            System.out.println(ClassLayout.parseInstance(classLayoutDemo).toPrintable());
        }
    }
}
