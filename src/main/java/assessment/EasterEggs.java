package assessment;

import java.text.DecimalFormat;

public class EasterEggs {
	
	public void easterEggMessages(int X, int Y, int theirX, int theirY) {
		
		Pythagoras pythag = new Pythagoras();
		DecimalFormat df = new DecimalFormat("#.##");
		
	if (X == 7 && Y == 5) {
		System.out.println("You stumble over some branches and scrap your knee.");
	}
	if (X == 8 && Y == 7) {
		System.out.println("You hear wolves howling in the distance, you'd better hurry.");
	}
	if (X == 9 && Y == 8) {
		System.out.println("A strong wind blows through the tall grass, you feel like you are being watched.");
	}
	if (X == 4 && Y == 4) {
		System.out.println("Bear prints extend off to the left, best to move quietly.");
	}
	if (X == 2 && Y == 7) {
		System.out.println("An owl flies past, almost swiping you with its talons.");
	}
	if (X == 7 && Y == 3) {
		System.out.println("You stumble over some branches and scrap your knee.");
	}
	if (X == 8 && Y == 4) {
		System.out.println("You hear wolves howling in the distance, you'd better hurry.");
	}
	if (X == 4 && Y == 6) {
		System.out.println("A strong wind blows through the tall grass, you feel like you are being watched.");
	}
	if (X == 3 && Y == 4) {
		System.out.println("Bear prints extend off to the left, best to move quietly.");
	}
	if (X == 6 && Y == 5) {
		System.out.println("An owl flies past, almost swiping you with its talons.");
	}
	
	System.out.println();

}
}
