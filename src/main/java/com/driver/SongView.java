package com.driver;

import java.util.List;

public class SongView {
    public void printSongDetails(List<Song> songs) {
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public void printArtistDetails(List<Artist> artists) {
        for (Artist artist : artists) {
            System.out.println(artist);
        }
    }

    public void printAverageAlbums(double averageAlbums) {
        System.out.println("Average albums per artist: " + averageAlbums);
    }
}
