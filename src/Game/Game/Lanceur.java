package Game;

//import Levels.*;

import javax.swing.SwingUtilities;

public class Lanceur {
	static Plateau p = new Plateau(10, 10);
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					//p.etat();
					InterfaceG g = new InterfaceG(p);
					g.setVisible(true);
				}
			}
		);
	}
}

