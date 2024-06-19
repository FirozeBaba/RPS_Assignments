package com.rps.milestone.shoppingcart;

import java.util.Queue;
import java.util.LinkedList;

class CustomerService {
    private Queue<String> serviceRequests;

    public CustomerService() {
        this.serviceRequests = new LinkedList<>();
    }

    public void addRequest(String request) {
        serviceRequests.offer(request);
    }

    public String processNextRequest() {
        return serviceRequests.poll();
    }

    public void viewPendingRequests() {
        System.out.println("Pending Service Requests:");
        int count =0;
        for (String request : serviceRequests) {
            System.out.println("- " + request);
            count++;
        }
        
        if(count==0) {
        	System.out.println("No Active Pending Requests");
        }
    }
}
