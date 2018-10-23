package com.joshuaevans;

public class Car {
    /*
    * Use of the private keyword is part of the OOP principle "Encapsulation".
    *
    * This is the "state" of the car defined as a set of "fields"
    */
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    /*
    * Why Getters and Setters?
    *
    *  Using setters and getters allows the developer to put in place data validation rules that protect the state of the
    *  object from unwanted changes.  This allows us to define and control exactly how the fields of the class will interact
    *  with the rest of our program.  This is consistent with the principle of Encapsulation, a principle of OOP.
    *
    * */

    // Model Setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    // Model Getter
    public String getModel(){
        return this.model;
    }

    // Doors Setter
    public void setDoors(int doors){
        this.doors = doors;
    }

    // Doors Getter
    public int getDoors(){
        return this.doors;
    }

    // Wheels Setter
    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    // Wheels Getter
    public int getWheels(){
        return this.wheels;
    }

    // Engine Setter
    public void setEngine(String engine){
        this.engine = engine;
    }

    // Engine Getter
    public String getEngine(){
        return this.engine;
    }

    // Color Setter
    public void setColor(String color){
        this.color = color;
    }

    // Color Getter
    public String getColor(){
        return this.color;
    }

}
