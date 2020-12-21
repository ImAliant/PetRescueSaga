import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import static javax.swing.SwingConstants.*;

public class InterfaceG extends JFrame implements MouseListener{
    
    private interface GraphicEntity{
        public void paint(Graphics2D g, Point p, int cell, int border);
    }
    
    private class CarreRouge implements GraphicEntity{
        Color c = Color.RED;
        public CarreRouge(){}
        public void paint(Graphics2D g, Point p, int cell, int border){
            g.setColor(this.c);
            float coeff = 8.0f;
            GeneralPath tour = new GeneralPath();
            tour.moveTo((p.x+1)*cell-border,p.y*cell+border);
            tour.curveTo((p.x+1)*cell-border,p.y*cell+border,(p.x+1)*cell-border-cell/coeff,p.y*cell+cell/2.0f,(p.x+1)*cell-border,(p.y+1)*cell-border);
            tour.lineTo(p.x*cell+border,(p.y+1)*cell-border);
            tour.curveTo(p.x*cell+border,(p.y+1)*cell-border,p.x*cell+border+cell/coeff,p.y*cell+cell/2.0f,p.x*cell+border,p.y*cell+border);
            tour.closePath();
            g.fill(tour);
        }
    }
    private class CarreVert implements GraphicEntity{
        Color c = Color.GREEN;
        public CarreVert(){}
        public void paint(Graphics2D g, Point p, int cell, int border){
            g.setColor(this.c);
            float coeff = 8.0f;
            GeneralPath tour = new GeneralPath();
            tour.moveTo((p.x+1)*cell-border,p.y*cell+border);
            tour.curveTo((p.x+1)*cell-border,p.y*cell+border,(p.x+1)*cell-border-cell/coeff,p.y*cell+cell/2.0f,(p.x+1)*cell-border,(p.y+1)*cell-border);
            tour.lineTo(p.x*cell+border,(p.y+1)*cell-border);
            tour.curveTo(p.x*cell+border,(p.y+1)*cell-border,p.x*cell+border+cell/coeff,p.y*cell+cell/2.0f,p.x*cell+border,p.y*cell+border);
            tour.closePath();
            g.fill(tour);
        }
    }
    private class CarreBleu implements GraphicEntity{
        Color c = Color.BLUE;
        public CarreBleu(){}
        public void paint(Graphics2D g, Point p, int cell, int border){
            g.setColor(this.c);
            float coeff = 8.0f;
            GeneralPath tour = new GeneralPath();
            tour.moveTo((p.x+1)*cell-border,p.y*cell+border);
            tour.curveTo((p.x+1)*cell-border,p.y*cell+border,(p.x+1)*cell-border-cell/coeff,p.y*cell+cell/2.0f,(p.x+1)*cell-border,(p.y+1)*cell-border);
            tour.lineTo(p.x*cell+border,(p.y+1)*cell-border);
            tour.curveTo(p.x*cell+border,(p.y+1)*cell-border,p.x*cell+border+cell/coeff,p.y*cell+cell/2.0f,p.x*cell+border,p.y*cell+border);
            tour.closePath();
            g.fill(tour);
        }
    }
    private class CarreJaune implements GraphicEntity{
        Color c = Color.YELLOW;
        public CarreJaune(){}
        public void paint(Graphics2D g, Point p, int cell, int border){
            g.setColor(this.c);
            float coeff = 8.0f;
            GeneralPath tour = new GeneralPath();
            tour.moveTo((p.x+1)*cell-border,p.y*cell+border);
            tour.curveTo((p.x+1)*cell-border,p.y*cell+border,(p.x+1)*cell-border-cell/coeff,p.y*cell+cell/2.0f,(p.x+1)*cell-border,(p.y+1)*cell-border);
            tour.lineTo(p.x*cell+border,(p.y+1)*cell-border);
            tour.curveTo(p.x*cell+border,(p.y+1)*cell-border,p.x*cell+border+cell/coeff,p.y*cell+cell/2.0f,p.x*cell+border,p.y*cell+border);
            tour.closePath();
            g.fill(tour);
        }
    }
    private class CarreViolet implements GraphicEntity{
        public CarreViolet(){}
        public void paint(Graphics2D g, Point p, int cell, int border){
            g.setColor(new Color(148,0,211));
            float coeff = 8.0f;
            GeneralPath tour = new GeneralPath();
            tour.moveTo((p.x+1)*cell-border,p.y*cell+border);
            tour.curveTo((p.x+1)*cell-border,p.y*cell+border,(p.x+1)*cell-border-cell/coeff,p.y*cell+cell/2.0f,(p.x+1)*cell-border,(p.y+1)*cell-border);
            tour.lineTo(p.x*cell+border,(p.y+1)*cell-border);
            tour.curveTo(p.x*cell+border,(p.y+1)*cell-border,p.x*cell+border+cell/coeff,p.y*cell+cell/2.0f,p.x*cell+border,p.y*cell+border);
            tour.closePath();
            g.fill(tour);
        }
    }

    private GraphicEntity[][] grid; 
    private Graphic p;
    private int border = 8, cell = 75;
    private KeyEvent ke;
    private MouseEvent clic;
    private JTextField jtf;

    private class KEDispatcher implements KeyEventDispatcher {
        public boolean dispatchKeyEvent(KeyEvent e) {
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_PAUSE) ke = e;
              }
              return false;
         }
    }

    /** @deprecated */
    public void mouseClicked(MouseEvent e) {
        this.setClic(e);
        synchronized(this){
            this.notify();
        }
    }
    /** @deprecated */
    public void mousePressed(MouseEvent e) {}
    /** @deprecated */
    public void mouseReleased(MouseEvent e) {}
    /** @deprecated */
    public void mouseEntered(MouseEvent e) {}
    /** @deprecated */
    public void mouseExited(MouseEvent e) {}
    /** @deprecated */
    public void setClic(MouseEvent e){
        this.clic = e;
    }

    /** Retourne un Point lorsque l'utilisateur clique sur une case. */
    public synchronized Point clicCase(){
        try{
            this.wait();
        }
        catch(InterruptedException e){}
        ((JComponent) this.clic.getSource()).transferFocusUpCycle();
        return new Point(this.clic.getX()/this.cell,this.clic.getY()/this.cell);
    }
    
    public InterfaceG(int largeur, int hauteur){
        super("Pet Rescue Saga");
        this.grid = new GraphicEntity[largeur][hauteur];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                this.grid[i][j] = null;
            }        
        }
        this.p = new Graphic();
        this.p.setPreferredSize(new Dimension(largeur*this.cell, hauteur*this.cell));
        this.p.addMouseListener(this);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(this.p,BorderLayout.CENTER);
        //this.getContentPane().add(this.p);
        this.jtf = new JTextField(20);
        this.getContentPane().add(this.jtf,BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new KEDispatcher());
    }
    
    /* Renvoie un entier correspondant à la touche appuyee. CENTER:pause, EAST:fleche droite, WEST:fleche gauche, SOUTH:fleche bas, NORTH:fleche haut
    Renvoie -1 si la touche appuyee n'est ni une fleche ni pause. */
    public int toucheAppuyee(){
        if(this.ke == null) return -1;
        else{
            int result = -1;
            if(this.ke.getKeyCode() == KeyEvent.VK_RIGHT) result = EAST;
            if(this.ke.getKeyCode() == KeyEvent.VK_LEFT) result = WEST;
            if(this.ke.getKeyCode() == KeyEvent.VK_DOWN) result = SOUTH;
            if(this.ke.getKeyCode() == KeyEvent.VK_UP) result = NORTH;
            if(this.ke.getKeyCode() == KeyEvent.VK_PAUSE) result = CENTER;
            this.ke = null;
            return result;
        }
    }

    /* Efface la case d'abscisse x et d'ordonnee y */
    public void effaceCase(int x, int y){
        this.grid[x][y] = null;
        this.miseAJour();
    }
    public void miseAJour(){
        this.p.repaint();
    }
    public void dessinerCarreRouge(int x, int y){
        this.grid[x][y] = new CarreRouge();
        this.miseAJour();
    }
 
    public void dessinerCarreVert(int x, int y){
        this.grid[x][y] = new CarreVert();
        this.miseAJour();
    }
 
    public void dessinerCarreBleu(int x, int y){
        this.grid[x][y] = new CarreBleu();
        this.miseAJour();
    }
 
    public void dessinerCarreJaune(int x, int y){
        this.grid[x][y] = new CarreJaune();
        this.miseAJour();
    }
 
    public void dessinerCarreViolet(int x, int y){
        this.grid[x][y] = new CarreViolet();
        this.miseAJour();
    }

    private class Graphic extends JPanel{
        public void paint(Graphics gr){
            Graphics2D gr2D = (Graphics2D) gr;
            gr2D.setColor(Color.BLACK);
            gr2D.fillRect(0,0,this.getWidth(),this.getHeight());
            gr2D.setStroke(new BasicStroke(2.0f));
            //int offset = 2;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    if(grid[i][j] != null) grid[i][j].paint(gr2D, new Point(i,j), cell, border);
                }
            }
        }
    }
    public void afficheMessage(String m){
        JOptionPane.showMessageDialog(this,m);
    }
 
    public void afficheTexte(String t){
        this.jtf.setText(t);
    }
    public void affichage(Partie p, int h, int l){ // Affiche les differents types de bonbons dans une fonction
        for(int i=0; i<h; i++){
            for(int j=0; j<l; j++){
                if(p.getJeu()[i][j].getCouleur() == 1)
                    dessinerCarreRouge(i, j);
                if(p.getJeu()[i][j].getCouleur() == 2)
                    dessinerCarreVert(i, j);
                if(p.getJeu()[i][j].getCouleur() == 3)
                    dessinerCarreBleu(i, j);
                if(p.getJeu()[i][j].getCouleur() == 4)
                    dessinerCarreJaune(i, j);
                if(p.getJeu()[i][j].getCouleur() == 5)
                    dessinerCarreViolet(i, j);
            }
        }
    }
}
