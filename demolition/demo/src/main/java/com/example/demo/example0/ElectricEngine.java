package com.example.demo.example0;

public class ElectricEngine extends Engine{
    public ElectricEngine(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("Zoom Zoom\n");
    }

    @Override
    public String toString() {
        return "electric engine";
    }
}
