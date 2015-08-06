package com.twu.biblioteca.model;


import java.util.ArrayList;

public class Section {
    private ArrayList<Item> items;
    private ArrayList<Item> issuedItems;

    public Section(ArrayList<Item> items) {
        this.items = items;
        issuedItems = new ArrayList<Item>();
    }

    public String items() {
        String itemsDetails = "";
        for(Item item : items) {
            itemsDetails = itemsDetails + item.toString() + '\n';
        }
        return itemsDetails;
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
        for(Item item : issuedItems) {
            if(item.hasTitle(bookName)) {
                items.add(item);
                issuedItems.remove(item);
                return true;
            }
        }
        return false;
    }

    public String checkedOutItems() {
        String checkedOutItemsDetails = "";
        for(Item checkedOutItem : issuedItems) {
            checkedOutItemsDetails = checkedOutItemsDetails + checkedOutItem.toString() + '\n';
        }
        return checkedOutItemsDetails;
    }
}