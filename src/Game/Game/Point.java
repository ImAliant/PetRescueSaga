package Game;

public class Point {
	static int points;
	
	public Point(int nbrCase) {
		if(nbrCase > 2){
			for(int i = 2; i <= nbrCase; i++){
				int res = (40 * 2 + (10*i));
				Point.points = getPoints()+res;
			}
		}
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
