package assessment;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public Boolean startGame() {
		
		Scanner scan = new Scanner(System.in);
		Compass startCompass = new Compass();
		PlayAgain doYouWantToPlayAgain = new PlayAgain();
		Movement yourXChanges = new Movement();
		Movement yourYChanges = new Movement();
		Pythagoras pythag = new Pythagoras();
		DistanceMessage whereAmI = new DistanceMessage();
		EasterEggs event = new EasterEggs();
		Random rand = new Random();
		OutOfBounds tooFarX = new OutOfBounds();
		OutOfBounds tooFarY = new OutOfBounds();
		
		int yourX = 5;
		int yourY = 5;
		int treasureX = rand.nextInt(10);
		int treasureY = rand.nextInt(10);

		System.out.println("Grey foggy clouds float oppressively close to you,reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");
		System.out.println("You notice a small watch-like device in your left hand.");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time. You read it.");
		System.out.println();

		whereAmI.locationMessage(yourX, yourY, treasureX, treasureY);

		do {

			System.out.println();
			String yourChoice = "Wrong";
			
			do {
				yourChoice = startCompass.chooseDirection(scan);
				
				if (yourChoice == "wrong") {
					System.out.println("Keep going, you can't stay here!");
				}
			} while (yourChoice == "wrong");
			
			System.out.println();
			System.out.println("You choose to go " + yourChoice + ".");

			switch (yourChoice) {
				case ("north"):
					yourY = yourYChanges.youMoveY(yourChoice, yourY);
					break;
				case ("south"):
					yourY = yourYChanges.youMoveY(yourChoice, yourY);
					break;
				case ("east"):
					yourX = yourXChanges.youMoveX(yourChoice, yourX);
					break;
				case ("west"):
					yourX = yourXChanges.youMoveX(yourChoice, yourX);
					break;
			}

			
			
			if (yourX > 10 || yourX<0) {
				yourX = tooFarX.whereAreYouGoingX(yourX);
				whereAmI.locationMessage(yourX, yourY, treasureX, treasureY);
			}
			else if (yourY > 10 || yourY<0) {
				yourY = tooFarY.whereAreYouGoingY(yourY);
				whereAmI.locationMessage(yourX, yourY, treasureX, treasureY);
			}
			
			else {
				event.easterEggMessages(yourX, yourY, treasureX, treasureY);
				whereAmI.locationMessage(yourX, yourY, treasureX, treasureY);
			}

		} while (pythag.howFarAway(yourX, yourY, treasureX, treasureY) > 0);
		
		System.out.println();
		System.out.println();
		System.out.println("You have found the treasure! A golden chest sits before you, dulled by the years of decay.");
		System.out.println("You unhinge the locks and pry it open to find:");
		System.out.println("A book, Java for Dummies. What does it mean?");
		System.out.println();
		
		String playAgain = doYouWantToPlayAgain.playAgain(scan);
			
			if (playAgain.equals("Play")) {
				return true;
			}
			else {
				scan.close();
				return false;
			}
		
		
	

}
}
