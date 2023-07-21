package com.example.demo.example0;

public class Car  {

    private Engine engine;
    private Gearbox gearbox;
    private String color = "default white";
    private String modelName;


    public Car (String model, Engine engine){

        this.modelName = modelName;

    }

    public Car(String modelName, String color, Engine engine, Gearbox gearBox){
        this.modelName = modelName;
        this.color = color;
        this.engine = engine;
        this.gearbox = gearBox;

    }




    public void start(){
        if (engine != null){
            gearbox.changeGear(0);
            gearbox.changeGear(1);
            gearbox.changeGear(2);
            engine.move();
        } else {
            System.out.println("Cannot move without an engine dummy");

        }

    }

    @Override
    public String toString() {
        return "Car model= " + modelName + ", the color is " + color;
    }
}
