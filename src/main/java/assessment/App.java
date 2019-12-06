package assessment;

public class App {

	public static void main(String[] args) {

		while (true) {
			Main readyToStart = new Main();
			Boolean play = readyToStart.startGame();
			System.out.println();

			if (play == false) {
				break;
			}
		}
		System.out.println("Goodbye.");

	}
}
