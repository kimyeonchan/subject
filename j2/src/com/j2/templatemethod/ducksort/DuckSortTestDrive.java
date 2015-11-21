package com.j2.templatemethod.ducksort;

import java.util.*;

public class DuckSortTestDrive {

    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<Duck>();

        ducks.add(new Duck("Daffy", 8));
        ducks.add(new Duck("Dewey", 2));
        ducks.add(new Duck("Howard", 7));
        ducks.add(new Duck("Louie", 2));
        ducks.add(new Duck("Donald", 10));
        ducks.add(new Duck("Huey", 2));
        System.out.println("Before sorting:");
        display(ducks);

        Collections.sort(ducks,new Duck());
 
        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    public static void display(ArrayList<Duck> ducks) {
            System.out.println(ducks);
    }
}
