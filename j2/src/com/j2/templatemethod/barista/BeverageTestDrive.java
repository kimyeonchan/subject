package com.j2.templatemethod.barista;

public class BeverageTestDrive {
    public static void main(String[] args) {
 
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        CaramelMacchiato caramelMacchiato = new CaramelMacchiato();
        
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
 
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        System.out.println("\nMaking coffee...");
        caramelMacchiato.prepareRecipe();

        
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        CaramelMacchiatoWithHook caramelMacchiatoWithHook = new CaramelMacchiatoWithHook();
        
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();
 
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
        
        System.out.println("\nMaking coffee...");
        caramelMacchiatoWithHook.prepareRecipe();
        

    }   
}
