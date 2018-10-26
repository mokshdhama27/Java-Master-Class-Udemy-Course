package com.joshuaevans;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog onyx = new Dog("Black Lab", 8, 20, 2, 4, 1, 20, "Black");
        onyx.eat();
        onyx.walk();
        onyx.run();
    }
}
