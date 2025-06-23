package org.example;

public class Album extends LibraryItem {
    private int trackCount;

    public Album(String title, String artist, int year, int trackCount) {
        super(title, artist, year);
        this.trackCount = trackCount;
    }

    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Track Count: " + trackCount);
    }

    @Override
    public String toString() {
        return "Album: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ") - " + trackCount + " tracks";
    }

}
