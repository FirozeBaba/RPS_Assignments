package com.rps.milestone.shoppingcart;

import java.util.LinkedList;
import java.util.Stack;

class PurchaseHistory {
    private Stack<LinkedList<String>> history;

    public PurchaseHistory() {
        this.history = new Stack<>();
    }

    public void saveCart(ShoppingCart cart) {
        LinkedList<String> cartItems = new LinkedList<>(cart.getCartItems());
        history.push(cartItems);
    }

    public LinkedList<String> undoLastPurchase() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return new LinkedList<>(); // return an empty list if history is empty
    }

    public void viewPurchaseHistory() {
        System.out.println("Purchase History:");
        for (LinkedList<String> cart : history) {
            for (String item : cart) {
                System.out.println("- " + item);
            }
            System.out.println("----");
        }
    }
}
