package assessment;

import java.util.Scanner;

public class Compass {
	
	public String chooseDirection() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which way do you choose to go?");
		String userChoice = scan.nextLine().toLowerCase();
		
		
		if (userChoice.equals("n")) {
			return "north";
		}
		else if (userChoice.equals("e")) {
			return "east";
		}
		else if (userChoice.equals("s")) {
			return "south";
		}
		else if (userChoice.equals("w")) {
			return "west";
		}
		else {
			return userChoice;
		}
		
		
		
	}

}
