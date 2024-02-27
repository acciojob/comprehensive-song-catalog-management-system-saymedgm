package com.driver;

public class Artist {
    private String name;
    private int numOfAlbums;

    public Artist(String name, int numOfAlbums) {
        this.name = name;
        this.numOfAlbums = numOfAlbums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfAlbums() {
        return numOfAlbums;
    }

    public void setNumOfAlbums(int numOfAlbums) {
        this.numOfAlbums = numOfAlbums;
    }

    public void incrementAlbumCount() {
        this.numOfAlbums++;
    }

    @Override
    public String toString() {
        return "Artist [name=" + name + ", numOfAlbums=" + numOfAlbums + "]";
    }
}