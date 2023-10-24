package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product {

    private final String name;
    private final double quantity;

    // Constructor
    public ProductImpl(final String name, final double quantity) {
        super();
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public final String getName() {
        return this.name;
    }

    @Override
    public final double getQuantity() {
        return this.quantity;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public final boolean equals(final Object obj) {
        return obj == this
                    || obj instanceof ProductImpl product
                    && product.getClass().equals(this.getClass()) // Breaks the symmetry otherwise
                    && product.name.equals(this.name);
    }

    @Override
    public String toString() {
        return "Product[name = " + name + ", quantity = " + quantity + "]";
    }
}
