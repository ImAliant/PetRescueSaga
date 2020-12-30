import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class InterfaceG extends JFrame {
    
    private JPanel panel_CUBES = new JPanel();
    private JPanel panel_BOUTON = new JPanel();
    private JButton button = new JButton();

    public InterfaceG(Plateau p) {

        /*Propriétés fenêtre*/
        setTitle("Pet Rescue Saga");
        setSize(600, 700);
        setLocationRelativeTo(null);
            /*Icone de la fenêtre*/
            try {
                setIconImage(ImageIO.read(new File("src/Game/image/logo.png")));
            } 
            catch (IOException e) {
                System.out.println("Image non trouvé");
            }
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        /*Propriétés des panels*/
        panel_CUBES.setBackground(Color.WHITE);
        panel_BOUTON.setBackground(Color.GRAY);
        
        /*Grille du panel_CUBES*/
        panel_CUBES.setLayout(new GridLayout(p.getLargeur(), p.getLongueur(), 5, 5));
        
        /*Création des cubes*/
        for (int i = 0; i < p.getLongueur(); i++) {
            for (int j = 0; j < p.getLargeur(); j++) {
                if (p.getCases()[i][j].getCube().getCouleur().equals("Rouge")) {
                    panel_CUBES.add(new CubeRouge(i, j, 10, 10));                   
                }
                else if (p.getCases()[i][j].getCube().getCouleur().equals("Jaune")) {
                    panel_CUBES.add(new CubeJaune(i, j, 10, 10));                    
                }
                else if (p.getCases()[i][j].getCube().getCouleur().equals("Vert")) {
                    panel_CUBES.add(new CubeVert(i, j, 10, 10));                   
                }
                else if (p.getCases()[i][j].getCube().getCouleur().equals("Violet")) {
                    panel_CUBES.add(new CubeViolet(i, j, 10, 10));                   
                }
                else if (p.getCases()[i][j].getCube().getCouleur().equals("Bleu")) { 
                    panel_CUBES.add(new CubeBleu(i, j, 10, 10));                    
                }
                else if (p.getCases()[i][j].getCube().getCouleur().equals("Blanc")) { 
                    panel_CUBES.add(new CubeBlanc(i, j, 10, 10)); 
                }
            }
        }
        
        /*Propriétés du JButton*/
        button = new JButton("Quitter");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });

        /*Objets liés a panel_BOUTON*/
        panel_BOUTON.add(button);
        
        getContentPane().add(panel_CUBES, BorderLayout.CENTER);
        getContentPane().add(panel_BOUTON, BorderLayout.PAGE_END);
    }
    
    public class CubeBleu extends Cube implements MouseInputListener {
        
        public CubeBleu(int i, int j, int l, int h) {
            super("Bleu");
            x=i;
            y=j;
            setBounds(i, j, l, h);
            setBackground(Color.BLUE);
            addMouseListener(this);
        }
        
        public void mouseClicked(MouseEvent e) {
            this.setBackground(Color.WHITE);
            //Lanceur.p.casesAdj(x, y);                
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

        }
        
        public void mouseMoved(MouseEvent e) {
        	
        }
    }
    
    public class CubeRouge extends Cube implements MouseInputListener {	
        public CubeRouge(int i, int j, int l, int h) {
            super("Rouge");
            x=i;
            y=j;
            setBounds(i, j, l, h);
            setBackground(Color.RED);
            addMouseListener(this);
        }
        
        public void setColor(int i, int j, int l, int h, Color c) {
        	setBounds(i, j, l, h);
            setBackground(c);
        }
        
        public void mouseClicked(MouseEvent e) {
            setBackground(Color.WHITE);
            //Lanceur.p.casesAdj(x, y);
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

        }
        
        public void mouseMoved(MouseEvent e) {
        	
        }
    }
    
    public class CubeVert extends Cube implements MouseInputListener {
        public CubeVert(int i, int j, int l, int h) {
            super("Vert");
            x=i;
            y=j;
            setBounds(i, j, l, h);
            setBackground(Color.GREEN);
            addMouseListener(this);
        }
        
        
        
        public void mouseClicked(MouseEvent e) {
            setBackground(Color.WHITE);
            //Lanceur.p.casesAdj(x, y);
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

        }
        
        public void mouseMoved(MouseEvent e) {
        	
        }
    }
    
    public class CubeViolet extends Cube implements MouseInputListener {
        public CubeViolet(int i, int j, int l, int h) {
            super("Violet");
            x=i;
            y=j;
            setBounds(i, j, l, h);
            setBackground(Color.MAGENTA);
            addMouseListener(this);
        }
        
        public void mouseClicked(MouseEvent e) {
            setBackground(Color.WHITE);
            //Lanceur.p.casesAdj(x, y);
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

        }
        
        public void mouseMoved(MouseEvent e) {
        	
        }
    }
    
    public class CubeJaune extends Cube implements MouseInputListener {
        public CubeJaune(int i, int j, int l, int h) {
            super("Jaune");
            x=i;
            y=j;
            setBounds(i, j, l, h); 
            setBackground(Color.YELLOW);
            addMouseListener(this);
        }

        public void mouseClicked(MouseEvent e) {
            this.setBackground(Color.WHITE);
            //Lanceur.p.casesAdj(x, y);
           }
        
        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
        
        public void mousePressed(MouseEvent e) {}
        
        public void mouseReleased(MouseEvent e) {}
        
        public void mouseDragged(MouseEvent e) {}
        
        public void mouseMoved(MouseEvent e) {}
    }
    
    public class CubeBlanc extends Cube implements MouseInputListener {
        public CubeBlanc(int i, int j, int l, int h) {
            super("Blanc");
            x=i;
            y=j;
        	setBounds(i, j, l, h);
            setBackground(Color.WHITE);
            addMouseListener(this);
            addMouseMotionListener(this);
        }
        
        public void mouseClicked(MouseEvent e) {
            setBackground(Color.WHITE);
        }
        
        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
        
        public void mousePressed(MouseEvent e) {}
        
        public void mouseReleased(MouseEvent e) {}
        
        public void mouseDragged(MouseEvent e) {}
        
        public void mouseMoved(MouseEvent e) {}
    }
}
