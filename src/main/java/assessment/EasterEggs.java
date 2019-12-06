package assessment;

import java.text.DecimalFormat;

public class EasterEggs {
	
	public void easterEggMessages(int x, int y, int theirX, int theirY) {
		
		OutOfBounds tooFarX = new OutOfBounds();
		OutOfBounds tooFarY = new OutOfBounds();
		Pythagoras pythag = new Pythagoras();
		DecimalFormat df = new DecimalFormat("#.##");
		
	if (x == 7 && y == 5) {
		System.out.println("You stumble over some branches and scrap your knee.");
	}
	if (x == 8 && y == 7) {
		System.out.println("You hear wolves howling in the distance, you'd better hurry.");
	}
	if (x == 9 && y == 8) {
		System.out.println("A strong wind blows through the tall grass, you feel like you are being watched.");
	}
	if (x == 4 && y == 4) {
		System.out.println("Bear prints extend off to the left, best to move quietly.");
	}
	if (x== 2 && y == 7) {
		System.out.println("An owl flies past, almost swiping you with its talons.");
	}
	if (x == 7 && y == 3) {
		System.out.println("You stumble over some branches and scrap your knee.");
	}
	if (x == 8 && y == 4) {
		System.out.println("You hear wolves howling in the distance, you'd better hurry.");
	}
	if (x == 4 && y == 6) {
		System.out.println("A strong wind blows through the tall grass, you feel like you are being watched.");
	}
	if (x == 3 && y == 4) {
		System.out.println("Bear prints extend off to the left, best to move quietly.");
	}
	if (x == 6 && y == 5) {
		System.out.println("An owl flies past, almost swiping you with its talons.");
	}
	if (x == 0 || y==0) {
		System.out.println("You feel danger around you, you are close to a border and you should turn back.");
	}
	if (x == 10 || y==10) {
		System.out.println("You feel danger around you, you are close to a border and you should turn back.");
	}
	
		System.out.println();	
	}


}

