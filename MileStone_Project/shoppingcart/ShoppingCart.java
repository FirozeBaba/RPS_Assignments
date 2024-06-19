package com.rps.milestone.shoppingcart;

import java.util.LinkedList;

class ShoppingCart {
    private LinkedList<String> cart;

    public ShoppingCart() {
        this.cart = new LinkedList<>();
    }

    public void addItem(String item) {
        cart.add(item);
    }

    public void removeItem(String item) {
        cart.remove(item);
    }

    public void viewCart() {
        System.out.println("Shopping Cart:");
        for (String item : cart) {
            System.out.println("- " + item);
        }
    }

    public LinkedList<String> getCartItems() {
        return cart; // Return the LinkedList directly
    }
}
