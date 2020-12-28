package Game;

import javax.swing.*;

public class Cube extends JPanel{
    
    private String couleur;

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
