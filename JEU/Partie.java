import java.awt.Point;

public class Partie {
    private Cube[][] jeu;
    private int points;

    public void decalerCube(Alignement a){
        if(a.debut.y == a.fin.y){ // Alignement horizontal
            for(int i = a.debut.x; i<= a.fin.x; i++){
                for(int j = a.debut.y ; j>=1 ; j--){
                    this.jeu[i][j] = this.jeu[i][j-1];
                }
            }
        }
        if(a.debut.x == a.fin.x){ // Alignement vertical
            for(int j = 0 ; a.fin.y-j >= 0 ; j++){
                if(a.debut.y-1-j >= 0){
                    this.jeu[a.debut.x][a.fin.y-j] = this.jeu[a.debut.x][a.debut.y-1-j];
                }
            }
        }
    }

    public Cube[][] getJeu() {
        return jeu;
    }

    public void setJeu(Cube[][] jeu) {
        this.jeu = jeu;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}



