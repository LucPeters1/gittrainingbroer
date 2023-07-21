package com.example.demo.example0;

public class ManualGearBox extends Gearbox {

    public ManualGearBox(int gears){
        this.gears = gears;
    }


    @Override
    protected void setGear(int gear) {
        System.out.println("Manually changed gear to " + currentGear);
    }
}
