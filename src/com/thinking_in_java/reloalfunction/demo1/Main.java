package com.thinking_in_java.reloalfunction.demo1;

public class Main {
    static void test(short n){
        System.out.println("short");
    }
    static void test(int n){
        System.out.println("int");
    }
    static void test(long n){
        System.out.println("long");
    }
    static void test(float n){
        System.out.println("float");
    }

    public static void main(String[] args) {
        int a = 1;
        test(a);
        byte b = 1;
        test(b);
        double c = 1.0d;
        // text(c); 报错
        test((float)c); // 必须向下手动转换
    }
}


