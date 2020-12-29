package com.vtb.lesson4;


import java.util.ArrayList;
import java.util.Arrays;

//По идее, есть коробки с апельсинами и яблоками. Коробки сортируются по типу фруктов. В одну нельзя положить и яблоки и апельсины.


public class Main {
    public static void main(String[] args) {
        ArrayList<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(2));
        appleList.add(new Apple(4));
        ArrayList<Orange> orangeList = new ArrayList<>();
        orangeList.add(new Orange(3));
        orangeList.add(new Orange(6));

        Box<Apple> appleBox = new Box<>(10, appleList);
        Box<Orange> orangeBox = new Box<>(9, orangeList);
        Box<Apple> appleBox1 = new Box<>(11);
//        System.out.println(appleBox.compare(orangeBox));
//        System.out.println(appleBox.toString());
//        System.out.println(appleBox1.toString());
//        appleBox.sendFruitsTo(appleBox1);
//        System.out.println(appleBox.toString());
//        System.out.println(appleBox1.toString());
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

    }




    // метод, меняющий местами 2 элемента любого ссылочного массива (По сути, аналог Collections.swap())
    public static void switchElem(Object[] arr, int index1, int index2){
        Object temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // метод, преобразующий массив в ArrayList
    public static <T> ArrayList<T> arrayToArrayList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
