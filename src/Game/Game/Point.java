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
			case 7 :
				Point.points = 490;
				break;
			case 8 :
				Point.points = 640;
				break;
			case 9 :
				Point.points = 810;
				break;
			default:
				Point.points = 1000;
		}
	}
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
