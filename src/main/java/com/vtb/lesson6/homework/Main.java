package com.vtb.lesson6.homework;

import java.util.Arrays;

public class Main {
    static final int SIZE = 11;
    static final int HALF = SIZE / 2;
    public static void main(String[] args) {
        math1();
        multiThreadArr(new float[SIZE]);
    }

    static void math1() {
        float[] array = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            array[i] = (float) (array[i] * ( Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0)));
        }
        System.out.println("1 поток - " + (System.currentTimeMillis() - a));
        System.out.println(Arrays.toString(array));
    }
    static void multiThreadArr(float[] array){
        Arrays.fill(array, 1);
        float[] arr1 = new float[array.length / 2];
        float[] arr2 = new float[array.length / 2];
        System.arraycopy(array, 0, arr1, 0, HALF);
        System.arraycopy(array, HALF, arr2, 0, HALF);
        long a = System.currentTimeMillis();
        Thread leftT = new Thread(() -> {
            for (int i = 0; i < HALF; i++) {
                arr1[i] = (float) (array[i] * ( Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0)));
            }
            System.arraycopy(arr1,0, array,0, HALF);
        });
        Thread rightT = new Thread(() -> {
            for (int i = 0, j = HALF; i < HALF; i++, j++) {
                arr2[i] = (float) (array[j] * ( Math.sin(0.2f + j / 5.0) * Math.cos(0.2f + j / 5.0) * Math.cos(0.4f + j / 2.0)));
            }
            System.arraycopy(arr2, 0, array, HALF, HALF);
        });
        leftT.start();
        rightT.start();
        try {
            leftT.join();
            rightT.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2 поток - " + (System.currentTimeMillis() - a));
        System.out.println(Arrays.toString(array));

    }

}
