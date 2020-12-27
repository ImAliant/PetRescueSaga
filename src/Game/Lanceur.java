public class Lanceur {
		public static void main(String[] args) {
				Plateau p = new Plateau(10, 10);
				Plateau.InterfaceG g = p.new InterfaceG();
				g.setVisible(true);
		}
}

