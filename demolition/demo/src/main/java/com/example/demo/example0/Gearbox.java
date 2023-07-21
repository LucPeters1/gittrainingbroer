package com.example.demo.example0;

public abstract class Gearbox {

    protected int gears;
    protected int currentGear;

    public  void changeGear(int gear){
        if (gear <= gears){
            currentGear = gear;
        } else{
            System.out.println("It is not possible to put a " + currentGear + " in " + gears + "gearbox.");
        }
    }

    protected abstract void setGear(int gear);

    @Override
    public String toString() {
        return "Basic gearbox";
    }

}
