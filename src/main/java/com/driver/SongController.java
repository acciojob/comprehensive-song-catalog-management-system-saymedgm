package com.driver;

import java.util.ArrayList;
import java.util.List;

public class SongController {
    private List<Song> songs = new ArrayList<>();
    private List<Artist> artists = new ArrayList<>();

    public void addSong(String title, String artist, int year) {
    	//your code goes here
    }

    public List<Song> getAllSongs() {
    	//your code goes here
        return new ArrayList<>(songs);
    }

    public List<Artist> getAllArtists() {
    	//your code goes here
        return new ArrayList<>(artists);
    }

    public void deleteSong(String title) {
    	//your code goes here
    }

    public Song getSongDetails(String title) {
    	//your code goes here
    }

    public double calculateAverageAlbums() {
    	//your code goes here
    }

    private boolean artistExists(String artistName) {
    	//your code goes here
    }

    private void incrementAlbumCount(String artistName) {
    	//your code goes here
    }
}

