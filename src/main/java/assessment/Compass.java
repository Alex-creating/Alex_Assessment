package assessment;

import java.util.Scanner;

public class Compass {
	
	public String chooseDirection(Scanner scan) {
		
		System.out.println("Which way do you choose to go?");
		String userChoice = scan.nextLine().toLowerCase();
	
		
		if (userChoice.equals("n") || userChoice.contentEquals("north")) {
			return "north";
		}
		else if (userChoice.equals("e")|| userChoice.contentEquals("east")) {
			return "east";
		}
		else if (userChoice.equals("s")|| userChoice.contentEquals("south")) {
			return "south";
		}
		else if (userChoice.equals("w")|| userChoice.contentEquals("west")) {
			return "west";
		}
		else {
			return "wrong";
		}
		
		
		
	}

}
