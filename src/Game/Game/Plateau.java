package Game;

import java.io.Serializable;
import java.util.Random;

import javax.swing.*;

public class Plateau extends JFrame implements Serializable{
	
	private Case[][] cases;
	private int largeur;
	private int longueur;

	protected String[] couleurs = {"Rouge", "Vert", "Bleu", "Jaune", "Violet", "Marron"};
	protected String[] images = {"src/Game/image/Chat.jpg", "src/Game/image/Lapin.jpg", "src/Game/image/Panda.jpg"};
	
	/* Création du plateau */
	public Plateau(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
		cases = new Case[largeur][longueur];
		Random r = new Random();
        for(int i = 0; i < longueur; i++){
            for(int j = 0; j < largeur; j++){
				//int x = r.nextInt(2);
            	//if(x == 0) {
				cases[i][j] = new Case(new Cube(couleurs[r.nextInt(5)]));
				//} 
            	/*else if(x == 1) {
            		cases[i][j] = new Case(new Animal(animaux[r.nextInt(3)])); 
				}
				else if (r.nextInt(3) == 2) {
            		cases[i][j] = new Case(new Cube(obstacles[r.nextInt(3)])); 
            	}*/
                if(cases[i][j].getCube().getCouleur().equals("Marron")) {
                	cases[i][j].getCube().setAnimal(new Animal(images[r.nextInt(3)]));
                }
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

	/* Affiche la couleur du cube */
	public void affiche() {
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				System.out.print(cases[i][j].getCube().getCouleur()+" "); 
			}
			System.out.println();
		}
	}

	/* Compte les cubes blancs */ 
	public int countBlanc() {
		int k = 0;
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				if(cases[i][j].getCube().getCouleur().equals("Blanc")) {
					k++;
				}
			}
		}
		return k;
	}

	/* Cherche la case blanche la plus haute */ 
	public boolean estPlusGrand(int colonne,int i,int j) {
		if(!cases[i][colonne].getCube().isWhite() && cases[j][colonne].getCube().isWhite()) {
			return true;
		}
		return false;
	}
	
	/* Permet la gravité lorsque des cubes sont détruits */ 
	public void graviteCSelect(int colonne) {
		int n = largeur;
		for(int i=0;i<=n-2;i++) {
			int min = i;
			for(int j=i+1;j<=n-1;j++) {
				if(estPlusGrand(colonne,min,j)) {
					min = j;
				}
			}
			if(min != i) {
				Cube tmp = cases[min][colonne].getCube();
				cases[min][colonne].getCube().setCouleur(Lanceur.p.getCases()[i][colonne].getCube().getCouleur());
				cases[i][colonne].getCube().setCouleur("Blanc");
			}
		}
	}
	public void gravite() {
		for(int j=0; j<largeur; j++) {
			graviteCSelect(j);
		}
	}
}
