package mediaManagementJava.presentation;

import mediaManagementJava.logic.MediaManagement;
import mediaManagementJava.logic.MediaType;

import java.util.Scanner;

public class REPL {

    public final String greeting =
            "====================\n"
                    + "        JAVA        \n"
                    + "  Media Management  \n"
                    + "====================";
    public final String options = "Input Options: [S]how all media | S[a]ve medium |";
    private MediaManagement mediaManagement;

    public void Start() {
        mediaManagement = new MediaManagement();
        System.out.println(greeting);
        System.out.println(options);
        while (true) {
            System.out.print("Media Management-App>");
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine().toLowerCase()) {
                case "s":
                    System.out.println("All the Media: ");
                    System.out.println(mediaManagement.showAllMedia());
                    break;
                case "a":
                    System.out.println("Choose Medium to save: [S]ong, [F]ilm, or [B]ook?");
                    Scanner subScanner = new Scanner(System.in);
                    mediaSaveSequence(subScanner.nextLine());
                    break;
                default:
                    break;
            }
        }
    }

    private void mediaSaveSequence(String mediumToSafe) {
        String m = mediumToSafe.toLowerCase();

        System.out.println("Enter name of the artist: ");
        Scanner scanner = new Scanner(System.in);
        String artist = scanner.nextLine();

        System.out.println("Enter title of the medium: ");
        scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        if (m.equals("s")) {
            System.out.println("Enter song length in seconds: ");
            scanner = new Scanner(System.in);
            int length = scanner.nextInt();
            mediaManagement.createNewMedium(length, title, artist, MediaType.Song);
        } else if (m.equals("f")) {
            System.out.println("Enter film length in minutes: ");
            scanner = new Scanner(System.in);
            int length = scanner.nextInt();
            mediaManagement.createNewMedium(length, title, artist, MediaType.Film);
        } else if (m.equals("b")) {
            System.out.println("Enter book length in number of pages: ");
            scanner = new Scanner(System.in);
            int length = scanner.nextInt();
            mediaManagement.createNewMedium(length, title, artist, MediaType.Book);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
