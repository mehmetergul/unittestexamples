package com.example.unittest.mockitoStarter;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<String> items = new ArrayList<>();

    public Order(List<String> items) {
        this.items.addAll(items);
    }
}
