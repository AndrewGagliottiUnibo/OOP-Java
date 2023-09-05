package it.unibo.oop.lab05.ex3;

public final class UseWarehouse {

    private UseWarehouse() {
    }

    public static void main(final String[] args) {

        //non sapevo che prodotti mettere, scusate
        final Product p1 = new ProductImpl("Pizza", 10);
        final Product p2 = new ProductImpl("Gatorade", 30);
        final Product p3 = new ProductImpl("Dentifricio", 100);
        final Product p4 = new ProductImpl("Rigatoni", 40);
        final Product p5 = new ProductImpl("Saponetta", 1);
        final Product p6 = new ProductImpl("Insalata", 24);
        
        final Warehouse w = new WarehouseImpl();;
        w.addProduct(p3);
        w.addProduct(p1);
        w.addProduct(p2);
        w.addProduct(p4);
        w.addProduct(p6);
        w.addProduct(p5);

        System.out.println(w.allNames());
        System.out.println(w.allProducts());
        
        //aggiungo io per provare
        System.out.println(w.getQuantity("Dentifricio"));
    }
}
