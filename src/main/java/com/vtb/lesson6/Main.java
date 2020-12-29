package com.vtb;

public class lesson6 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("1" + "-" + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("2" + " " + i);
            }
        });
        thread1.start();
        thread2.start();
    }
}