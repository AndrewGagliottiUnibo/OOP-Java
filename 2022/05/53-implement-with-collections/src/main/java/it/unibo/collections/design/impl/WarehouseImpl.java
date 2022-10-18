package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Implementation of a warehouse.
 *
 */
public class WarehouseImpl implements Warehouse {

    private final Set<Product> set = new LinkedHashSet<>();

    @Override
    public final void addProduct(final Product p) {
        this.set.add(p);
    }

    @Override
    public Set<String> allNames() {
        final Set<String> copy = new LinkedHashSet<>();
        for (final Product p : this.set) {
            copy.add(p.getName());
        }
        return copy;
    }

    @Override
    public Set<Product> allProducts() {
        return new LinkedHashSet<>(this.set);
    }

    @Override
    public final boolean containsProduct(final Product p) {
        return set.contains(p);
    }

    @Override
    public final double getQuantity(final String name) {
        for (final var p : this.set) {
            if (p.getName().equals(name)) {
                return p.getQuantity();
            }
        }
        return 0;
    }
}
