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
        addItem("���󺣸� �Ŀ������ũ",
                "���󺣸��� ��ǹ��͸� �Ƴ����� ���� ����ũ", true, 3.29);
        addItem("ũ������ ȣ����Ű",
                "�а��簡 �����ʰ� ũ�������ο� ȣ�η� ���� ��Ű", true, 3.99);
        addItem("Cheese Pancakes",
                "ġ��� ���� ġ�� ����ũ", false, 3.69);
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