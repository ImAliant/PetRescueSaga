import java.awt.Point; 

public class Alignement{
    private Point debut, fin;

    public Alignement alignement(Partie p){ // Fonction qui detecte les alignements en cours de partie
        int k = 0;
        for(int i=0; i<p.getJeu().length; i++){
            for(int j=0; j<p.getJeu()[i].length; j++){
                k=1;
                while(i+k<p.getJeu().length && p.getJeu()[i][j].getCouleur() == p.getJeu()[i+k][j].getCouleur()){ // Tant que la case qui suit i est du meme type on continue (alignement horizontale)
                    k++;
                }
                if(k>2){ // Si k est superieur à 2 alors il y a un alignement
                    Alignement a = new Alignement();
                    a.debut = new Point();
                    a.debut.x = i;
                    a.debut.y = j;
                    a.fin = new Point();
                    a.fin.x = i+k-1;
                    a.fin.y = j;
                    return a;  
                }
                k=1;
                while(j+k<p.getJeu()[i].length && p.getJeu()[i][j].getCouleur() == p.getJeu()[i][j+k].getCouleur()){
                    k++;
                }
                if(k>2){
                    Alignement a = new Alignement();
                    a.debut = new Point();
                    a.debut.x = i;
                    a.debut.y = j;
                    a.fin = new Point();
                    a.fin.x = i;
                    a.fin.y = j+k-1;
                    return a;
                }
            }
        }
        return null;
    }

    public Point getDebut() {
        return debut;
    }

    public void setDebut(Point debut) {
        this.debut = debut;
    }

    public Point getFin() {
        return fin;
    }

    public void setFin(Point fin) {
        this.fin = fin;
    }
    
}

