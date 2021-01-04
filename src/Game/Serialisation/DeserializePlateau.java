package Serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import Game.Plateau;

public class DeserializePlateau {

    DeserializePlateau(Plateau p, String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            p = (Plateau) ois.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("La classe n'a pas été trouvé.");
        } catch (IOException e) {
            System.out.println("Le fichier n'a pas été trouvé.");
        }
    }
}
