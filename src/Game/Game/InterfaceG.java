package Game;

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
    
    private String[] args;

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
                System.exit(0);
            }
        });

        /*Objets liés a panel_BOUTON*/
        panel_BOUTON.add(button);
        panel_BOUTON.add(new JLabel("Score : " + Point.points));
        
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
            casesAdjRec(x, y, "Bleu");
            new Point(Lanceur.p.countBlanc());
            //gravity(x, y);                                                                       
        }
        
        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
        
        public void mousePressed(MouseEvent e) {}
        
        public void mouseReleased(MouseEvent e) {}
        
        public void mouseDragged(MouseEvent e) {}
        
        public void mouseMoved(MouseEvent e) {}             
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
               
        public void mouseClicked(MouseEvent e) {
            casesAdjRec(x, y, "Rouge");
            new Point(Lanceur.p.countBlanc());
            //gravity(x, y);      
        }
        
        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
        
        public void mousePressed(MouseEvent e) {}
        
        public void mouseReleased(MouseEvent e) {}
        
        public void mouseDragged(MouseEvent e) {}
        
        public void mouseMoved(MouseEvent e) {}       
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
            casesAdjRec(x, y, "Vert"); 
            new Point(Lanceur.p.countBlanc());
            //gravity(x, y); 
        }                                            
                            
        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
        
        public void mousePressed(MouseEvent e) {}
        
        public void mouseReleased(MouseEvent e) {}
        
        public void mouseDragged(MouseEvent e) {}
        
        public void mouseMoved(MouseEvent e) {}           
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
            casesAdjRec(x, y, "Violet");            
        }
        
        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
        
        public void mousePressed(MouseEvent e) {}
        
        public void mouseReleased(MouseEvent e) {}
        
        public void mouseDragged(MouseEvent e) {}
       
        public void mouseMoved(MouseEvent e) {}
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
            casesAdjRec(x, y, "Jaune"); 
            new Point(Lanceur.p.countBlanc());
            //gravity(x, y); 
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
        
        public void mouseClicked(MouseEvent e) {}
        
        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
        
        public void mousePressed(MouseEvent e) {}
        
        public void mouseReleased(MouseEvent e) {}
        
        public void mouseDragged(MouseEvent e) {}
        
        public void mouseMoved(MouseEvent e) {}
    }

    public void casesAdj(int x, int y, String c) {
        for(int i=x-1; i<=x+1; i++) {
            for(int j=y-1; j<=y+1; j++) {
                if(i >= 0 && i < Lanceur.p.getLongueur() && j >= 0 && j < Lanceur.p.getLargeur()) {
                    if(Lanceur.p.getCases()[i][j].getCube().getCouleur().equals(c)) {                      
                        getContentPane().remove(Lanceur.p.getCases()[i][j].getCube());
                        panel_CUBES.add(new CubeBlanc(i, j, 10, 10));
                        Lanceur.p.getCases()[x][y].getCube().setCouleur("Blanc");
                        Lanceur.p.getCases()[i][j].getCube().setCouleur("Blanc");
                        gravity(i, j);
                    }
                }
            }
        } 
        dispose();
        getContentPane().add(panel_CUBES, BorderLayout.CENTER);
        Lanceur.main(args);
    }

    public void maj(int i, int j) {
    	getContentPane().remove(Lanceur.p.getCases()[i][j].getCube());
    	panel_CUBES.add(new CubeBlanc(i, j, 10, 10));                   	
    	Lanceur.p.getCases()[i][j].getCube().setCouleur("Blanc"); 
    }

    public void casesAdjRec(int x, int y, String c){
        String anc="";
    	if(x-1 >= 0 && x-1 < Lanceur.p.getLongueur() && y >= 0 && y < Lanceur.p.getLargeur()) {
            if(Lanceur.p.getCases()[x-1][y].getCube().getCouleur().equals(c)) {
            	anc=c;
            	maj(x-1,y);
                casesAdjRec(x-1, y, anc);
            }
        }
    	if(x >= 0 && x < Lanceur.p.getLongueur() && y-1 >= 0 && y-1 < Lanceur.p.getLargeur()) {
            if(Lanceur.p.getCases()[x][y-1].getCube().getCouleur().equals(c)) { 
            	anc=c;
            	maj(x, y-1);
                casesAdjRec(x, y-1, anc);
            }
        }
    	if(x >= 0 && x < Lanceur.p.getLongueur() && y+1 >= 0 && y+1 < Lanceur.p.getLargeur()) {
            if(Lanceur.p.getCases()[x][y+1].getCube().getCouleur().equals(c)) {
            	anc=c;
                maj(x, y+1);
                casesAdjRec(x, y+1, anc);
            }
        }
    	if(x+1 >= 0 && x+1 < Lanceur.p.getLongueur() && y >= 0 && y < Lanceur.p.getLargeur()) {
            if(Lanceur.p.getCases()[x+1][y].getCube().getCouleur().equals(c)) {                      
            	anc=c;
            	maj(x+1, y);
                casesAdjRec(x+1, y, anc);
            }
        }
        getContentPane().add(panel_CUBES, BorderLayout.CENTER);
        Lanceur.main(args);
    }

    public void gravity(int x, int y){
        Cube positionCube = Lanceur.p.getCases()[x][y].getCube();
        while(positionCube.isWhite()){
            if(!Lanceur.p.getCases()[x][y-1].getCube().isWhite()){
                getContentPane().remove(Lanceur.p.getCases()[x][y].getCube());
                panel_CUBES.add(new Cube(Lanceur.p.getCases()[x][y-1].getCube().getCouleur()));
                Lanceur.p.getCases()[x][y].getCube().setCouleur(Lanceur.p.getCases()[x][y-1].getCube().getCouleur());
                Lanceur.p.getCases()[x][y-1].getCube().setCouleur("Blanc");
            }
            positionCube = Lanceur.p.getCases()[x][y-1].getCube();
        }
        getContentPane().add(panel_CUBES, BorderLayout.CENTER);
        Lanceur.main(args);
    }
}
