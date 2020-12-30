public class Point {
	private int points;
	
	public Point(int nbrCase) {
		switch(nbrCase) {
			case 2:
				this.points = 40;
				break;
			case 3:
				this.points = 90;
				break;
			case 4:
				this.points = 160;
				break;
			case 5:
				this.points = 250;
				break;
			case 6:
				this.points = 360;
				break;
			default:
				this.points = 1000;
		}
	}
	

}
