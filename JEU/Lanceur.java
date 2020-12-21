import java.awt.Point;

public class Lanceur{
    public static Partie creerPartie(int l, int h){ // Creer une nouvelle partie
        Partie p =new Partie();
        p.setJeu(new Cube[h][l]);
        for(int i=0; i<h; i++){
            for(int j=0; j<l; j++){
                p.getJeu()[i][j] =new Cube();
            }
        }
        return p;
    }
    public static void main(String[] args){
        int temp;
        Point p1 =new Point();
        Point p2 =new Point();
        InterfaceG petrescue =new InterfaceG(8,8);
        Partie p = creerPartie(8,8);
        while (true) // On peut cliquer jusqu'a ce qu'il n'est plus de combinaison possible
        {
            petrescue.affichage(p,8,8);
            p1 = petrescue.clicCase();    //Nouveau point afin d'inverser 2 cubes
            System.out.println(p1.x + " " + p1.y); //Garde en memoire le p1
            p2 = petrescue.clicCase();
            System.out.println(p2.x + " " + p2.y);
            //inverse 2 points
            if((p1.x==p2.x && Math.abs(p1.y-p2.y)==1) || (p1.y==p2.y && Math.abs(p1.x-p2.x)==1)){ 
                temp = p.getJeu()[p1.x][p1.y].getCouleur(); 
                p.getJeu()[p1.x][p1.y].setCouleur(p.getJeu()[p2.x][p2.y].getCouleur());
                p.getJeu()[p2.x][p2.y].setCouleur(temp);
                petrescue.affichage(p,8,8);
                Alignement a =new Alignement();
                a.alignement(p);
                System.out.println(a.getDebut().x + "," + a.getDebut().y + "   ->    " + a.getFin().x + "," + a.getFin().y);
 
                p.decalerCube(a);
            }
        }
    }
}