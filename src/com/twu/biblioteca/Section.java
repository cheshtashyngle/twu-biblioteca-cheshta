package com.twu.biblioteca;

import java.util.ArrayList;

public class Section {
    private ArrayList<Item> items;
    private ArrayList<Item> issuedItems;

    public Section(ArrayList<Item> items) {
        this.items = items;
        issuedItems = new ArrayList<Item>();
    }

    public ArrayList<Item> items() {
        return items;
    }

    public boolean checkout(String name) {
        for(Item item : items) {
            if(item.hasTitle(name)) {
                items.remove(item);
                issuedItems.add(item);
                return true;
            }
        }
        return false;
    }

    public boolean checkin(String bookName) {
        boolean flag = false;
        for(Item item : issuedItems) {
            if(item.hasTitle(bookName)) {
                items.add(item);
                issuedItems.remove(item);
                flag = true;
                break;
            }
        }
        return flag;
    }

    public ArrayList<Item> checkedOutItems() {
        return issuedItems;
    }
}