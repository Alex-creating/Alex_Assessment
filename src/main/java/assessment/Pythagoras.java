package assessment;

public class Pythagoras {
	
	public double howFarAway(int yourX, int yourY, int theirX, int theirY) {
		
		int xModulus = theirX - yourX;
		int yModulus = theirY - yourY;
		
		return Math.hypot(xModulus, yModulus);
	}

}
