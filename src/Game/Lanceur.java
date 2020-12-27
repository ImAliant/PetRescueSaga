import javax.swing.SwingUtilities;
	
public class Lanceur {
		public static void main(String[] args) {
			SwingUtilities.invokeLater(
					new Runnable() {
						public void run() {   
							Plateau p = new Plateau(50, 50);
							Plateau.InterfaceG g = p.new InterfaceG();
							g.setVisible(true);
						}
					}
			);
		}
	}

