package com.j2.iterator.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
        addItem("K&B's Pancake Breakfast", 
                "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", 
                "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries", true, 3.49);
        addItem("레몬베리 파운드케이크",
                "레몬베리와 비건버터를 아낌없이 넣은 케이크", true, 3.29);
        addItem("크랜베리 호두쿠키",
                "밀가루가 들어가지않고 크랜베리로와 호두로 만든 쿠키", true, 3.99);
        addItem("Cheese Pancakes",
                "치즈로 만든 치즈 케이크", false, 3.69);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
    // other menu methods here
}