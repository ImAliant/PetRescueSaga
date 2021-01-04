package Game;

import java.io.Serializable;
import java.util.Random;

import javax.swing.*;

public class Plateau extends JFrame implements Serializable{
	
	private Case[][] cases;
	private int largeur;
	private int longueur;

	protected String[] couleurs = {"Rouge", "Vert", "Bleu", "Jaune", "Violet"};
	
	public Plateau(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
		cases = new Case[largeur][longueur];
		Random r =new Random();
        for(int i = 0; i < longueur; i++){
            for(int j = 0; j < largeur; j++){
                cases[i][j] =new Case(new Cube(couleurs[r.nextInt(5)]));
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
}
