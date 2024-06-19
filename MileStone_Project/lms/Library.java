package com.rps.milestone.lms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        setBooks(new ArrayList<>());
    }

    public void addBook(Book book) {
        getBooks().add(book);
        Collections.sort(getBooks()); // Sort the list after adding a book
    }

    public void removeBook(Book book) {
        getBooks().remove(book);
    }

    public int linearSearch(String title) {
        for (int i = 0; i < getBooks().size(); i++) {
            if (getBooks().get(i).getTitle().equalsIgnoreCase(title)) {
                return i; // Return the index if the book is found
            }
        }
        return -1; // Return -1 if the book is not found
    }

    public int binarySearch(String title) {
        int left = 0;
        int right = getBooks().size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = getBooks().get(mid).getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return mid; // Return the index if the book is found
            } else if (comparison < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Return -1 if the book is not found
    }

    public void displayBooks() {
        for (Book book : getBooks()) {
            System.out.println(book);
        }
    }

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}