package mediaManagementJava.presentation;

import mediaManagementJava.logic.MediaManagement;

import java.io.IOException;
import java.util.Scanner;

public class REPL {

    public final String greeting = "====================\n"
            + "        JAVA        \n"
            + "  Media Management  \n"
            + "====================";

    public void Start() throws IOException {
        MediaManagement mediaManagement = new MediaManagement();
        System.out.println(greeting);
        while (true) {
            System.out.print("Media Management-App>");
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "show":
                    System.out.println("All the Media: ");
                    mediaManagement.showAllMedia();
                    break;
                default:
                    break;
            }
        }
    }

}
