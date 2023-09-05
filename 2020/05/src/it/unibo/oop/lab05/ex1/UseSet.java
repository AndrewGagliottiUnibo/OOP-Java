package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.TreeSet;

public final class UseSet {

    private static final int MAX_SPACE = 20;

    private UseSet() {
    }

    public static void main(final String[] args) {
        /* 
        * 1) Builds a TreeSet containing Strings
        */
        final TreeSet<String> set = new TreeSet<>();
        
        /* 2) Populates such Collection with all the Strings ranging from "1" to
        * "20"
        */
        for(int i = 0; i < MAX_SPACE; i++) {
            set.add(Integer.toString(i));
        }
        
        //3) Prints its content 
        System.out.println(set);
        
        //4) elimino elementi divisibili per 3
        //Iterator è una interfaccia necessaria a generare metodi che sono in grado di scorrere gli elementi di una Collection
        final Iterator<String> analyzer = set.iterator();
        while(analyzer.hasNext()) {
            if(Integer.parseInt(analyzer.next()) % 3 == 0) {
               analyzer.remove(); 
            }
        }
  
        // 5) Prints the content of the Set using a for-each costruct
        System.out.println(set);
        
        //6) Verifies if all the numbers left in the set are even
        final Iterator<String> analyzer2 = set.iterator();
        while(analyzer2.hasNext()) {
            if(!(Integer.parseInt(analyzer2.next()) % 2 == 0)) {
                System.out.println("false");
                break;
            }
            System.out.println("true");
        }
    }
}
