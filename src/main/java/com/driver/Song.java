package com.driver;

public class Song {
    private String title;
    private String artist;
    private int year;

    public Song(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
    	//your code goes here
        return title;
    }

    public void setTitle(String title) {
    	//your code goes here
        this.title = title;
    }

    public String getArtist() {
    	//your code goes here
        return artist;
    }

    public void setArtist(String artist) {
    	//your code goes here
        this.artist = artist;
    }

    public int getYear() {
    	//your code goes here
        return year;
    }

    public void setYear(int year) {
    	//your code goes here
        this.year = year;
    }

    @Override
    public String toString() {
    	//your code goes here
        return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
    }
}

