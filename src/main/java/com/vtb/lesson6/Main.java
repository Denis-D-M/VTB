package com.vtb.lesson6;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassicCounter counter = new ClassicCounter();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.inc1();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.inc2();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.dec1();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.dec2();
            }
        }).start();
        new Thread(Main::m1).start();
        Thread.sleep(1000);
        System.out.println(counter.value1());
        System.out.println(counter.value2());
    }
    static void m1(){
        System.out.println(1);
    }

}