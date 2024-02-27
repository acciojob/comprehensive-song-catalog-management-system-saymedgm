package com.driver;

public class Artist {
    private String name;
    private int numOfAlbums;

    public Artist(String name, int numOfAlbums) {
        this.name = name;
        this.numOfAlbums = numOfAlbums;
    }

    public String getName() {
    	//your code goes here
        return name;
    }

    public void setName(String name) {
    	//your code goes here
        this.name = name;
    }

    public int getNumOfAlbums() {
    	//your code goes here
        return numOfAlbums;
    }

    public void setNumOfAlbums(int numOfAlbums) {
    	//your code goes here
        this.numOfAlbums = numOfAlbums;
    }

    public void incrementAlbumCount() {
    	//your code goes here
        this.numOfAlbums++;
    }

    @Override
    public String toString() {
    	//your code goes here
        return "Artist [name=" + name + ", numOfAlbums=" + numOfAlbums + "]";
    }
}
