package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

    private final Set<Product> set;
    
    public WarehouseImpl() {
        this.set = new HashSet<>();
    }

    public void addProduct(final Product p) {
        this.set.add(p);
    }

    public Set<String> allNames() {
        //potevo anche fare un while con iteratore ma questa soluzione è più rapida
        final Set<String> setReader = new HashSet<>();
        for(final Product product: this.set) {
            setReader.add(product.getName());
        }
        return setReader;
    }

    public Set<Product> allProducts() {
        /* Modo 1
         * 
         *      final Set<Product> setReader2 = new HashSet<>();
         *      for(final Product product2: this.set) {
         *          setReader.add(product2);
         *      }
         *  return setReader2;
         */
        
        //Modo 2, va a richiamare la toString
        return new HashSet<>(this.set);
    }

    //sfrutto il metodo di interfaccia
    public boolean containsProduct(final Product p) {
        return this.set.contains(p);
    }

    public double getQuantity(final String name) {
        for(final Product product2 : this.set) {
            /*  oppure:
             * 
             *  if(product2.getName() == name){
             *      ...
             *  }
             */
            if(product2.getName().equals(name)) {
                return product2.getQuantity();          
            }
        }
        System.out.println("\nNot found: ");
        return -1;
    }

}
