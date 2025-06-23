package org.example;

public class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public void readBook() {
        System.out.println("Reading book: " + getTitle());
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count: " + pageCount);
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ") - " + pageCount + " pages";
    }
}