import java.util.Scanner;

import Logic.MediaManagement;

// there will be different dialogs

public class Main {

	public static void main(String[] args) {
		MediaManagement mediaManagement = new MediaManagement();
		while (true) {
			System.out.print("Media Management-App>");
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
