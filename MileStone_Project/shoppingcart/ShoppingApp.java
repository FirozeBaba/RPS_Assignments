package com.rps.milestone.shoppingcart;

public class ShoppingApp {
    public static void main(String[] args) {
        // Create instances of ShoppingCart, PurchaseHistory, and CustomerService
        ShoppingCart cart = new ShoppingCart();
        PurchaseHistory history = new PurchaseHistory();
        CustomerService service = new CustomerService();

        // Perform shopping cart operations
        cart.addItem("Charger");
        cart.addItem("Mobile");
        cart.viewCart();

        // Save current cart to purchase history
        history.saveCart(cart);

        // Perform more operations on shopping cart
        cart.removeItem("Charger");
        cart.addItem("EarBuds");
        cart.viewCart();

        // Save current cart to purchase history again
        history.saveCart(cart);

        // View purchase history
        history.viewPurchaseHistory();

        // Perform customer service operations
        service.addRequest("Charger");
        service.addRequest("Mobile");
        service.viewPendingRequests();

        // Process a service request
        String processedRequest = service.processNextRequest();
        String processedRequest1 = service.processNextRequest();
        System.out.println("Processed request: " + processedRequest);
        System.out.println("Processed request: " + processedRequest1);
        service.viewPendingRequests();
        
    }
}
