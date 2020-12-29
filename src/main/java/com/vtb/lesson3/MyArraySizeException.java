package com.vtb.lesson3;

public class MyArraySizeException extends MyArrayException {
    public MyArraySizeException(){
        super("Неправильный размер массива. Размер массива должен быть 4х4.");
    }
}
