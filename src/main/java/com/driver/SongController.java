package com.driver;

import java.util.ArrayList;
import java.util.List;

public class SongController {
    private List<Song> songs = new ArrayList<>();
    private List<Artist> artists = new ArrayList<>();

    public void addSong(String title, String artist, int year) {
        Song song = new Song(title, artist, year);
        songs.add(song);

        // If the artist does not exist, add the artist
        if (!artistExists(artist)) {
            artists.add(new Artist(artist, 1));
        } else {
            incrementAlbumCount(artist);
        }
    }

    public List<Song> getAllSongs() {
        return new ArrayList<>(songs);
    }

    public List<Artist> getAllArtists() {
        return new ArrayList<>(artists);
    }

    public void deleteSong(String title) {
        songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    public Song getSongDetails(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }

    public double calculateAverageAlbums() {
        if (artists.isEmpty()) {
            return 0.0;
        }

        int totalAlbums = artists.stream().mapToInt(Artist::getNumOfAlbums).sum();
        return (double) totalAlbums / artists.size();
    }

    private boolean artistExists(String artistName) {
        return artists.stream().anyMatch(artist -> artist.getName().equalsIgnoreCase(artistName));
    }

    private void incrementAlbumCount(String artistName) {
        artists.stream()
                .filter(artist -> artist.getName().equalsIgnoreCase(artistName))
                .findFirst()
                .ifPresent(Artist::incrementAlbumCount);
    }
}
