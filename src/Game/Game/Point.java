package Game;

public class Point {
	static int points;
	
	public Point(int nbrCase) {
		switch(nbrCase) {
			case 2:
				Point.points = 40;
				break;
			case 3:
				Point.points = 90;
				break;
			case 4:
				Point.points = 160;
				break;
			case 5:
				Point.points = 250;
				break;
			case 6:
				Point.points = 360;
				break;
			default:
				Point.points = 1000;
		}
	}
	

}
