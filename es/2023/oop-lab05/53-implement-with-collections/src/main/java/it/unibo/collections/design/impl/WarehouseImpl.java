package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

    private final Set<Product> set = new LinkedHashSet<>();

    @Override
    public final void addProduct(final Product product) {
        this.set.add(product);
    }

    @Override
    public Set<String> allNames() {
        final Set<String> namesSet = new LinkedHashSet<>();
        
        for (final Product product : this.set) {
            namesSet.add(product.getName());
        }

        return namesSet;
    }

    @Override
    public Set<Product> allProducts() {
        return new LinkedHashSet<>(this.set);
    }

    @Override
    public final boolean containsProduct(final Product product) {
        return set.contains(product);
    }

    @Override
    public final double getQuantity(final String name) {
        
        for (final var product : this.set) {
            
            if (product.getName().equals(name)) {
                return product.getQuantity();
            }
        }

        return 0;
    }
}
