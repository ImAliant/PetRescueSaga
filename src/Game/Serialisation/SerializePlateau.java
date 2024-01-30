package Serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Game.Plateau;

public class SerializePlateau {

    SerializePlateau(Plateau p, String path){
        try {
            FileOutputStream fos =new FileOutputStream(path);
            ObjectOutputStream oos =new ObjectOutputStream(fos);

            oos.writeObject(p);

            oos.close();
        } catch (IOException e) {
            System.out.println("Le fichier n'a pas été trouvé.");
        }
    }
}
