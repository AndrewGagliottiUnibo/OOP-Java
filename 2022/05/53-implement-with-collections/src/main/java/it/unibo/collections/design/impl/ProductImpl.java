package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product {

    private final String name;
    private final double quantity;

    /**
     * Constructor.
     * 
     * @param n
     * @param q
     */
    public ProductImpl(final String n, final double q) {
        super();
        this.name = n;
        this.quantity = q;
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final double getQuantity() {
        return quantity;
    }

    @Override
    public final int hashCode() {
        return name.hashCode();
    }

    @Override
    public final boolean equals(final Object obj) {
        return obj == this
                || obj instanceof ProductImpl p
                        && p.getClass().equals(this.getClass())
                        && p.name.equals(name);
    }

    @Override
    public String toString() {
        return "Product[name=" + name + ", quantity=" + quantity + "]";
    }
}
