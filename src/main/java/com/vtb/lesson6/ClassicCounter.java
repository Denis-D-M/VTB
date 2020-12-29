package com.vtb.lesson6;

public class ClassicCounter {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    private volatile int c1;
    private volatile int c2;
    public void inc1(){
        synchronized (lock1) {
            c1++;
            System.out.println(Thread.currentThread().getName() + " прибавил 1 в c1");
        }
    }
    public void inc2(){

        synchronized (lock2) {
            c2++;
            System.out.println(Thread.currentThread().getName() + " прибавил 1 в с2");
        }
    }
    public void dec1(){
        synchronized (lock1) {
            c1--;
            System.out.println(Thread.currentThread().getName() + " отнял 1 от с1");
        }
    }
    public void dec2(){
        synchronized (lock2) {
            c2--;
            System.out.println(Thread.currentThread().getName() + " отнял 1 от с2");
        }
    }
    public int value1(){
        return c1;
    }
    public int value2(){ return c2;}
}
