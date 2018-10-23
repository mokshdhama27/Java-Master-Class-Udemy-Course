package com.joshuaevans;


public class Main {

    public static void main(String[] args) {
        // Creates an object "porsche" based on the class "Car"
        Car porsche = new Car();
        Car holden = new Car();
        /*
        * Assuming the model field of the Car class is "public" and not private
        *
        * porsche.model = "Carrera";
        *
        * This violates the rule of encapsulation, so the field should remain private,
        * and set/get methods should be written instead
        */

        porsche.setModel("Carrera");
        System.out.println("The model of the Porsche is " + porsche.getModel());
    }
}
