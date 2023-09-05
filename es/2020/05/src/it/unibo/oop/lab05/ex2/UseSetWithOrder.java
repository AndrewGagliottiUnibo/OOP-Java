package it.unibo.oop.lab05.ex2;

import java.util.Set;
import java.util.TreeSet;

public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }
    
        public static void main(final String[] args) {
         
            //creo il TreeSet
            final Set<String> set = new TreeSet<>(new StringComparator());
                        
            //inserisco elementi
            for(int i = 0; i< 10; i++) {
                set.add(Double.toString(Math.random() + 1));
            }
            
            //stampa normale
            for(final String element : set) {
                System.out.println(element);                
            }            
        }
}
