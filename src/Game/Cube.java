package Game;

import javax.swing.*;

public class Cube extends JPanel{
    
    private String couleur;
    protected int x, y;

    public Cube(String couleur){
        this.couleur = couleur;
    }
    
    public String getCouleur() {
    	return this.couleur;
    }
    
    public void setCouleur(String color) {
    	this.couleur = color;
    }
}
