package Enumeration;

import java.util.*;

public class EI {
    public static void main (String args[]) {
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        Enumeration IteratorEnumeration = new Iteratoradaptor(array.iterator());
        while (IteratorEnumeration.hasMoreElements()) {
            System.out.println(IteratorEnumeration.nextElement());
        }
        
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        Iterator EnumerationIterator = new Enumberationadaptor(vector.elements());
        while(EnumerationIterator.hasNext()){
        	System.out.println(EnumerationIterator.next());
        }


   }
}
