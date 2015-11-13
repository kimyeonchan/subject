package Enumeration;

import java.util.*;

public class Enumberationadaptor implements Iterator {
    Enumeration enumeration;
 
    public Enumberationadaptor(Enumeration enumeration) {
        this.enumeration = enumeration;
    }
 
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }
 
    public Object next() {
        return enumeration.nextElement();
    }
 
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
