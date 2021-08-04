package mediaManagementJava.presentation;

import java.util.Scanner;
import mediaManagementJava.logic.MediaManagement;

public class REPL {

	public void Start() {
		System.out.println("***************************");
		System.out.println("         THIS IS MY        ");
		System.out.println("            JAVA           ");
		System.out.println("   MEDIA MANAGEMENT APP!   ");
		System.out.println("***************************");
		while (true) {
			System.out.print("Media Management-App>");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			switch (scanner.nextLine()) {
			case "show":
				System.out.println("All the Media: ...");
				break;
			default:
				break;
			}
		}
	}

}
