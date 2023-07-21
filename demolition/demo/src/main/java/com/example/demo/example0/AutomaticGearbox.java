package com.example.demo.example0;

public class AutomaticGearbox extends Gearbox{

    public AutomaticGearbox(int gears){
        this.gears = gears;
    }

    @Override
    public void changeGear(int gear) {
        if (gear <= gears){
            currentGear = gear;
            System.out.println("Automatically changed gear to " + currentGear + ".");
        } else{
            System.out.println("It is not possible to put a " + currentGear + " in " + gears + "gearbox.");
        }
    }

    @Override
    protected void setGear(int gear) {

    }
}
