package com.example.unittest.mockitoStarter;

public class Customer {
    final Inventory inventory;

    public Customer(Inventory inventory) {
        this.inventory = inventory;
    }

    public boolean addOrder(Order order) {
        if (!inventory.isStockAvailable(order.items.toArray(new String[]{}))) {
            return false;
        }
        return true;
    }
}
