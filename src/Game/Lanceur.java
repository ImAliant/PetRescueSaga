package Game;


import Levels.*;

import javax.swing.SwingUtilities;

public class Lanceur {
	static Plateau p =new Plateau(10, 10);
	
	public static void main(String[] args) {
		//Accueil a =new Accueil();
		//a.getNiveau().setSelectedIndex(0);
		/*if(a.getNiveau().getSelectedValue() == "Niveau_1"){
			Plateau n1 = new Niveau_1();
			InterfaceG g1 = new InterfaceG(n1);
			g1.setVisible(true);
		}*/
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() { 
					InterfaceG g = new InterfaceG(p);
					g.setVisible(true);
				}
			}
		);
	}
}

