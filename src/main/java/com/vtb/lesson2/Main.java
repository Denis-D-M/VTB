package com.vtb.lesson2;

// Немного повторил интерфейсы
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Motorcycle motorcycle = new Motorcycle();
        person.setTransport(motorcycle);
        person.drive();


    }
}
