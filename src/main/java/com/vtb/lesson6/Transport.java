package com.vtb.lesson6;

public interface Transport {
    default void go(){
        System.out.println("Я еду на своём транспорте!!!");
    }
}
