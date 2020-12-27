package Game;

import java.util.Random;

import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.MouseInputListener;


public class Plateau extends JFrame {
	private Case[][] cases;
	private int largeur;
	private int longueur;
	private boolean click;
	
	public Plateau(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
		cases = new Case[largeur][longueur];
		
		String[] couleurs = {"Rouge", "Vert", "Bleu", "Jaune", "Violet"};
		Random r = new Random();
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				cases[i][j] = new Case(new Cube(couleurs[r.nextInt(5)]), null); // Gestion Animaux  revoir
			}
		}
	}
	
	public class InterfaceG extends JFrame {
		private JPanel jp;
		
		public InterfaceG() {
			this.setTitle("Pet Rescue Saga");
			this.setSize(largeur, longueur);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.jp = new JPanel();
			jp.setLayout(new GridLayout(largeur, longueur, 5, 5));
			
			for (int i = 0; i < longueur; i++) {
				for (int j = 0; j < largeur; j++) {
					if (cases[i][j].getCube().getCouleur().equals("Rouge")) {
						jp.add(new CubeRouge(i, j, 20, 20));
					}
					else if (cases[i][j].getCube().getCouleur().equals("Jaune")) {
						jp.add(new CubeJaune(i, j, 20, 20)); 
					}
					else if (cases[i][j].getCube().getCouleur().equals("Vert")) {
						jp.add(new CubeVert(i, j, 20, 20)); 
					}
					else if (cases[i][j].getCube().getCouleur().equals("Violet")) {
						jp.add(new CubeViolet(i, j, 20, 20)); 
					}
					else if (cases[i][j].getCube().getCouleur().equals("Bleu")) { 
						jp.add(new CubeBleu(i, j, 20, 20)); 
					}
				}
			}
			this.getContentPane().add(jp);
		}
		
		public class CubeBleu extends JPanel implements MouseInputListener {
			public CubeBleu(int i, int j, int l, int h) {
				this.setBounds(i, j, l, h);
				this.setBackground(Color.BLUE);
				this.addMouseListener(this);
				this.addMouseMotionListener(this);
			}
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("click!");
				if (click) {
					this.setBackground(Color.WHITE);
					click = false;
				} else {
					click = true;
				}
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}

			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mousePressed(MouseEvent e) {
			
			}
			
			public void mouseReleased(MouseEvent e) {
				
			}
			
			public void mouseDragged(MouseEvent e) {
				this.setLocation(e.getX(), e.getY());
			}
			
			public void mouseMoved(MouseEvent e) {
				
			}
		}
		
		public class CubeRouge extends JPanel implements MouseInputListener {
			public CubeRouge(int i, int j, int l, int h) {
				this.setBounds(i, j, l, h);
				this.setBackground(Color.RED);
				this.addMouseListener(this);
				this.addMouseMotionListener(this);
			}
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("click!");
				if (click) {
					this.setBackground(Color.WHITE);
					click = false;
				} else {
					click = true;
				}
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}

			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mousePressed(MouseEvent e) {
			
			}
			
			public void mouseReleased(MouseEvent e) {
				
			}
			
			public void mouseDragged(MouseEvent e) {
				this.setLocation(e.getX(), e.getY());
			}
			
			public void mouseMoved(MouseEvent e) {
				
			}
		}
		
		public class CubeVert extends JPanel implements MouseInputListener {
			public CubeVert(int i, int j, int l, int h) {
				this.setBounds(i, j, l, h);
				this.setBackground(Color.GREEN);
				this.addMouseListener(this);
				this.addMouseMotionListener(this);
			}
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("click!");
				if (click) {
					this.setBackground(Color.WHITE);
					click = false;
				} else {
					click = true;
				}
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}

			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mousePressed(MouseEvent e) {
			
			}
			
			public void mouseReleased(MouseEvent e) {
				
			}
			
			public void mouseDragged(MouseEvent e) {
				this.setLocation(e.getX(), e.getY());
			}
			
			public void mouseMoved(MouseEvent e) {
				
			}
		}
		
		public class CubeViolet extends JPanel implements MouseInputListener {
			public CubeViolet(int i, int j, int l, int h) {
				this.setBounds(i, j, l, h);
				this.setBackground(Color.MAGENTA);
				this.addMouseListener(this);
				this.addMouseMotionListener(this);
			}
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("click!");
				if (click) {
					this.setBackground(Color.WHITE);
					click = false;
				} else {
					click = true;
				}
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}

			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mousePressed(MouseEvent e) {
			
			}
			
			public void mouseReleased(MouseEvent e) {
				
			}
			
			public void mouseDragged(MouseEvent e) {
				this.setLocation(e.getX(), e.getY());
			}
			
			public void mouseMoved(MouseEvent e) {
				
			}
		}
		
		public class CubeJaune extends JPanel implements MouseInputListener {
			public CubeJaune(int i, int j, int l, int h) {
				this.setBounds(i, j, l, h); 
				this.setBackground(Color.YELLOW);
				this.addMouseListener(this);
				this.addMouseMotionListener(this);
			}

			public void mouseClicked(MouseEvent e) {
				System.out.println("click!");
				if (click) {
					this.setBackground(Color.WHITE);
					click = false;
				} else {
					click = true;
				}
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}

			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mousePressed(MouseEvent e) {
			
			}
			
			public void mouseReleased(MouseEvent e) {
				
			}
			
			public void mouseDragged(MouseEvent e) {
				this.setLocation(e.getX(), e.getY());
			}
			
			public void mouseMoved(MouseEvent e) {
				
			}
		}
	}
}
