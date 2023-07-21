package com.example.demo.example0;

public class Main {
    public static void main(String... args) {
        Engine engine = new Engine("v8");
        Engine engine1 = new Engine("v10");
        Engine engine2 = new Engine("v6");
        ElectricEngine electricEngine = new ElectricEngine("AAA-powered engine");

       Gearbox manual = new ManualGearBox(6);
       AutomaticGearbox autogearbox = new AutomaticGearbox(6);

        Car car = new Car("Ferrari 812", "Blue", engine, manual);
        Car car2 = new Car("BMW 5 series", "Yellow", engine1, manual);
        Car car3 = new Car("Polo", engine2);
        Car car4 = new Car("E-tron", "Midnight Blue", electricEngine, manual );
        Car car5 = new Car("Cayenne", "Grey ",electricEngine, autogearbox);

        car.start();
        car4.start();
        car5.start();


    }

}