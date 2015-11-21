package com.j2.templatemethod.barista;

public class CaramelMacchiato extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    public void addCondiments() {
        System.out.println("Adding Vaniila syrub and espresso and milk and caramel");
    }
}
