package com.j2.templatemethod.ducksort;

import java.util.*;
public class Duck implements Comparator<Object> {
    String name;
    int weight;
  
    public Duck(){
    	this.name = null;
    	this.weight =0;
    }
    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
 
    public String toString() {
        return name + " weighs " + weight;
    }
 
 
  
    public int compare(Object object1,Object object2) {
 
        Duck Duck1 = (Duck)object1;
        Duck Duck2 = (Duck)object2;
  
        if (Duck1.weight < Duck2.weight) {
            return -1;
        } else if (Duck1.weight == Duck2.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
