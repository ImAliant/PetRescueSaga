import java.awt.*;
import javax.swing.*;

public class Cube extends JPanel{
    private String couleur; 
    public Cube(String couleur){
        this.couleur = couleur;
    }
    
    public String getCouleur() {
    	return this.couleur;
    }
    
    public void setCouleur(Color color) {
    	this.setBackground(color);
    }
    
}
