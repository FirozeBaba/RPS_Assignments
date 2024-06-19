package com.rps.milestone.lms;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("Book1", "Author1", "ISBN1"));
        library.addBook(new Book("Book2", "Author2", "ISBN2"));
        library.addBook(new Book("Book3", "Author3", "ISBN3"));
        library.addBook(new Book("Book4", "Author4", "ISBN4"));
        library.addBook(new Book("Book5", "Author5", "ISBN5"));

        // Display all books
        System.out.println("All books in the library:");
        library.displayBooks();
        System.out.println();

        // Linear Search
        String targetTitle = "Book3";
        long startTime = System.nanoTime();
        int linearSearchIndex = library.linearSearch(targetTitle);
        long endTime = System.nanoTime();
        long lsTime = endTime - startTime;
    
        if (linearSearchIndex != -1) {
            System.out.println("Book found using Linear Search: " + library.getBooks().get(linearSearchIndex));
        } else {
            System.out.println("Book not found using Linear Search.");
        }
        System.out.println(lsTime);

        // Binary Search
        startTime = System.nanoTime();
        int binarySearchIndex = library.binarySearch(targetTitle);
        endTime = System.nanoTime();
        long bsTime = endTime - startTime;
       
        if (binarySearchIndex != -1) {
            System.out.println("Book found using Binary Search: " + library.getBooks().get(binarySearchIndex));
        } else {
            System.out.println("Book not found using Binary Search.");
        }
        System.out.println(bsTime);
        
        
        //Compare Search
        if (lsTime == bsTime) {
        	System.out.println("Both are having same performance");
        }else if (lsTime < bsTime) {
        	System.out.println("Linear search is performing better than Binary search");
        }else {
        	System.out.println("Binary search is performing better than Linear search");
        }
    }
}