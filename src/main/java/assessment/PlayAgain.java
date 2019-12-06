package assessment;

import java.util.Scanner;

public class PlayAgain {

	public String playAgain(Scanner scan) {

		System.out.println("Do you want to play again?");
		String userChoice = scan.nextLine().toLowerCase();

		if (userChoice.equals("y") || userChoice.contentEquals("yes")) {
			return "Play";
		}
		else {
			return "NoPlay";
		}

	}
}

