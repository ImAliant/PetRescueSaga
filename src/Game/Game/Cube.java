package Game;

import java.io.Serializable;

import javax.swing.*;

public class Cube extends JPanel implements Serializable{
    
    private String couleur;
    private Animal animal;
    protected int x, y;

    public Cube(String couleur){
        this.couleur = couleur;
    }
    
    public Cube(Animal animal){
        this.animal = animal;
    }
    
    public String getCouleur() {
    	return this.couleur;
    }
    
    public void setCouleur(String couleur) {
    	this.couleur = couleur;
    }
    
    public void setAnimal(Animal animal) {
    	this.animal = animal;
    }
    
    public Animal getAnimal() {
    	return this.animal;
    }

    public boolean isWhite(){
        if(this.getCouleur() != "Blanc")
            return false;
        return true;
    }
}
