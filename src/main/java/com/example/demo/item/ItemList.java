package com.example.demo.item;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    private List<Item> items;

    public ItemList() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }
    public void addItem(Item item ){
        items.add(item);
    }
}
