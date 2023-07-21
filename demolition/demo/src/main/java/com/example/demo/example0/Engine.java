package com.example.demo.example0;

import java.util.StringJoiner;

public class Engine {
    protected String model;

    public Engine(String model){
        this.model = model;
    }

    public void move(){
        System.out.println("Car go: ");
        System.out.println("\nVroom Vroom");
    }



    @Override
    public String toString() {
        return "Basic Engine";
    }
}
