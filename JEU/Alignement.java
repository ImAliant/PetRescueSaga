import java.awt.Point; 

public class Alignement{
    Point debut, fin;

    public Alignement alignement(Partie p){ // Fonction qui detecte les alignements en cours de partie
        int k = 0;
        for(int i=0; i<p.jeu.length; i++){
            for(int j=0; j<p.jeu[i].length; j++){
                k=1;
                while(i+k<p.jeu.length && p.jeu[i][j].getCouleur() == p.jeu[i+k][j].getCouleur()){ // Tant que la case qui suit i est du meme type on continue (alignement horizontale)
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
                while(j+k<p.jeu[i].length && p.jeu[i][j].getCouleur() == p.jeu[i][j+k].getCouleur()){
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
}

