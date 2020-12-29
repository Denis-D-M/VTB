package com.vtb.lesson4;


import java.util.ArrayList;

public class Box<T extends Fruit> {
    private int size;
    private ArrayList<T> fruits;

    public Box(int size, ArrayList<T> fruits) {
        this.size = size;
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }
    public float getWeight(){
        float sum = 0;
        for(T t : fruits){
            sum += t.weight;
        }
        return sum;
    }

    public Box(int size) {
        this.size = size;
        this.fruits = new ArrayList<>();
    }

    public  void addFruit(T fruit){
        this.fruits.add(fruit);
    }
    public void sendFruitsTo(Box<T> box){
        box.fruits.addAll(this.fruits);
        fruits.clear();
    }

    @Override
    public String toString() {
        if (this.fruits == null){
            return "Size - " + " " + this.size;
        }else{
            return "Size - " + " " + this.size + " " + this.fruits.toString();
        }
    }

    public boolean compare(Box<? extends Fruit> box){
        return this.size == box.size;
    }

}
