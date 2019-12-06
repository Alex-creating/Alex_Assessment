package assessment;

import java.text.DecimalFormat;

public class DistanceMessage {
	
	public void locationMessage(int yourX, int yourY, int treasureX, int treasureY) {
		
		Pythagoras pythag = new Pythagoras();
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("The device says:");
		System.out.println("Your are " + df.format(pythag.howFarAway(yourX, yourY, treasureX, treasureY)) + "m away from what you seek");
		System.out.println("You stand at (" + yourX + ", " + yourY + ")");
	}

}
