import javax.swing.*;
import java.util.Random;

public class Plateau extends JFrame {
	private Case[][] cases;
	private int largeur;
	private int longueur;

	protected String[] couleurs = {"Rouge", "Vert", "Bleu", "Jaune", "Violet"};
	
	public Plateau(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
		cases = new Case[largeur][longueur];
		
		Random r = new Random();
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				cases[i][j] = new Case(new Cube(couleurs[r.nextInt(5)])); // Gestion Animaux � revoir
			}
		}
	}
	
	/*Getters et Setters*/
	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		this.cases = cases;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public String[] getCouleurs() {
		return couleurs;
	}

	public void setCouleurs(String[] couleurs) {
		this.couleurs = couleurs;
	}

	public void etat() {
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				System.out.print(cases[i][j].getCube().getCouleur()+" "); 
			}
		}
		System.out.println();
	}
	
	public void casesAdj(int x, int y) {
    	/*for(int i=x-1; i<=x+1; i++) {
            for(int j=y-1; j<=y+1; j++) {
                if(i!=x && j!=y && i >= 0 && i < getLongueur() && j >= 0 && j < getLargeur()) {
                    if(getCases()[i][j].getCube().getCouleur().equals(getCases()[x][y].getCube().getCouleur())) {
                        getCases()[i][j].getCube().setCouleur("Blanc");
                    }
                }
            }
		}*/
		casesAdj(x+1, y+1);
    }
	
}
