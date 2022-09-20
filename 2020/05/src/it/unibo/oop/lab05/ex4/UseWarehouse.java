package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.Warehouse;

public final class UseWarehouse {

    private UseWarehouse() {
    }

    public static void main(final String[] args) {
        
        final Product p1 = new ProductComparable("Cavolo", 83);
        final Product p2 = new ProductComparable("Dentifricio", 83);
        final Product p3 = new ProductComparable("Piadina", 100);
        
        final Warehouse w = new OrderedWarehouse();
        
        w.addProduct(p3);
        w.addProduct(p1);
        w.addProduct(p2);
        
        System.out.println(w.allNames());
        System.out.println(w.allProducts());
    }
}
