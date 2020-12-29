package com.vtb.lesson2;

public class Person {
    private Transport transport;

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
    public void drive(){
        this.transport.start();
    }
}
