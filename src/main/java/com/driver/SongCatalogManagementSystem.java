package com.driver;

import java.util.List;
import java.util.Scanner;

public class SongCatalogManagementSystem {
    public static void main(String[] args) {
        // Initialize the MVC components
        SongController controller = new SongController();
        SongView view = new SongView();

        // Simple console-based user interface
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Song");
            System.out.println("2. View Songs");
            System.out.println("3. View Artists");
            System.out.println("4. Delete Song");
            System.out.println("5. View Song Details");
            System.out.println("6. Calculate Average Albums");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter release year: ");
                    int year = scanner.nextInt();
                    controller.addSong(title, artist, year);
                    break;

                case 2:
                    List<Song> allSongs = controller.getAllSongs();
                    view.printSongDetails(allSongs);
                    break;

                case 3:
                    List<Artist> allArtists = controller.getAllArtists();
                    view.printArtistDetails(allArtists);
                    break;

                case 4:
                    System.out.print("Enter song title to delete: ");
                    String titleToDelete = scanner.nextLine();
                    controller.deleteSong(titleToDelete);
                    break;

                case 5:
                    System.out.print("Enter song title to view details: ");
                    String titleToView = scanner.nextLine();
                    Song songDetails = controller.getSongDetails(titleToView);
                    if (songDetails != null) {
                        System.out.println("Song Details: " + songDetails);
                    } else {
                        System.out.println("Song not found.");
                    }
                    break;

                case 6:
                    double averageAlbums = controller.calculateAverageAlbums();
                    view.printAverageAlbums(averageAlbums);
                    break;

                case 7:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 7);

        scanner.close();
    }
}

