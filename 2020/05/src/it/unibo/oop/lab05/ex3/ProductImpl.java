package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

    private final String productName;
    private double quantity;
    
    //costruttore
    public ProductImpl(final String name, final double quantity) {
        this.productName = name;
        this.quantity = quantity;
    }
    
    //getter
    public String getName() {
        return this.productName;
    }

    public double getQuantity() {
        return this.quantity;
    }
    
    //stampa
    public String toString() {
        return  "Product is: " + this.getName() +
                ", quantity stored: " + this.getQuantity();
    }
}
