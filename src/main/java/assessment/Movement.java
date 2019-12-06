package assessment;

public class Movement {

	public int youMoveX(String yourDirection, int yourX) {

		int a = 5;

		switch (yourDirection) {
			case ("east"):
				yourX++;
				return yourX;
			case ("west"):
				return (yourX - 1);
		}

		return a;

	}

	public int youMoveY(String yourDirection, int yourY) {

		int b = 5;

		switch (yourDirection) {
			case ("north"):
				yourY++;
				return yourY;
			case ("south"):
				return (yourY - 1);
		}

		return b;

	}

}
