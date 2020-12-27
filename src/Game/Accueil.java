import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class Accueil extends JFrame implements MouseInputListener{
	private JPanel jp = new JPanel();
	private JButton jb = new JButton();
	private String[] args;
	
	public Accueil() {
		setTitle("Pet Rescue Saga");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb = new JButton("Jouer");
		jb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanceur.main(args);
		    }
		});
		jp.add(jb);
		this.getContentPane().add(jp);
	}
	
	public void mouseClicked(MouseEvent e) {}
	
	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}
	
	public void mousePressed(MouseEvent e) {}
	
	public void mouseReleased(MouseEvent e) {}
	
	public void mouseDragged(MouseEvent e) {}
	
	public void mouseMoved(MouseEvent e) {}

	public static void main(String[] args) {
		Accueil ac = new Accueil();
		ac.setVisible(true);
	}
}
