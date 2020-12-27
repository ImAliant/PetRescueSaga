 public class Point {
	private int pts;
	
	public Point(int nbrCase) {
		switch(nbrCase) {
			case 2:
				this.pts = 40;
				break;
			case 3:
				this.pts = 90;
				break;
			case 4:
				this.pts = 160;
				break;
			case 5:
				this.pts = 250;
				break;
			case 6:
				this.pts = 360;
				break;
			default:
				this.pts = 1000;
		}
	}
	

}
