package Game;

<<<<<<< HEAD
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Animal extends Cube { // Modele
	private BufferedImage image;
	private String chemin;

	public Animal(String chemin) {
		super("Marron");
		this.chemin = chemin;
		File f = new File(chemin);
		try {
			if (!f.exists()) {
				throw new IOException("Le chemin n'existe pas.");
			} else {
				this.image = ImageIO.read(f);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getChemin() {
		return this.chemin;
	}
=======
public class Animal {

    public Animal(String couleur) {
        
    }
    
>>>>>>> 63edfc7a6e0a365d9ac18e60d09f1e37b6a915f4
}
    

