public class Partie {
    private Cube[][] jeu;
    private int points;

    public void decalerCube(Alignement a){
        if(a.getDebut().y == a.getFin().y) { // Alignement horizontal
            for(int i = a.getDebut().x; i <= a.getFin().x; i++) {
                for(int j = a.getDebut().y; j >= 1; j--) {
                    this.jeu[i][j] = this.jeu[i][j-1];
                }
            }
        }
        if(a.getDebut().x == a.getFin().x) { // Alignement vertical
            for(int j = 0 ; a.getFin().y - j >= 0; j++) {
                if(a.getDebut().y - 1 - j >= 0) {
                    this.jeu[a.getDebut().x][a.getFin().y - j] = this.jeu[a.getDebut().x][a.getDebut().y - 1 - j];
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



