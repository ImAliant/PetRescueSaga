package Game;

/*import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Levels.*;*/

import javax.swing.SwingUtilities;

public class Lanceur {

	//static Plateau p;
	static Plateau p =new Plateau(10, 10);

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				/*try {
					FileInputStream fis = new FileInputStream("src/Game/SerializeLevels/Niveau1_plateau.ser");
					ObjectInputStream ois = new ObjectInputStream(fis);

					p = (Plateau)ois.readObject();
					
					InterfaceG g =new InterfaceG(p);
					g.setVisible(true);

					ois.close();
				} catch (IOException e) {
					System.out.println("Le fichier n'a pas été trouvé");
				} catch (ClassNotFoundException e) {
					System.out.println("La classe n'a pas été trouvé");
				}*/	
				InterfaceG g =new InterfaceG(p);
				g.setVisible(true);
			}
		});
	}
}

