package com.joshuaevans;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Chewing food...");
    }

    @Override
    public void eat(){
        chew();
        super.eat();
    }

    public void walk(){
        move(1);
    }

    public void run(){
        move(4);
    }

    private void moveLegs(int speed){
        System.out.println("The dog is moving it's " + legs + " legs at a rate of " + speed);
    }

    @Override
    public void move(int speed){
        moveLegs(speed);
        super.move(speed);
    }

}
