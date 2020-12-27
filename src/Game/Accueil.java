import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Accueil implements ItemListener {
    private JPanel panel;
    
    private String niveaux[] = {"Niveau 1","Niveau 2","Niveau 3"};

    private String[] args;

    public void addComponentToPane(Container pane) {
        /*Création des Panels*/
        JPanel panNiveau = new JPanel(); 
        JPanel panButton = new JPanel();
        
        /*Création des boutons*/
        JButton jouer =new JButton("Jouer");
        JButton quitter =new JButton("Quitter le jeu");

        /*Propriétés des boutons*/
        jouer.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                Lanceur.main(args);
            }
        }); 
        quitter.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });

        /*Création d'une liste avec différents niveaux*/
        JComboBox<String> niveau = new JComboBox<>(niveaux);
        niveau.setBackground(Color.WHITE);
        niveau.setEditable(false);
        niveau.addItemListener(this);

        /*Ajouts d'objets dans les panels*/
        panNiveau.add(niveau);

        panButton.add(jouer);
        panButton.add(quitter);

        panel = new JPanel(new CardLayout());
        panel.add(panButton);
        //

        pane.add(niveau, BorderLayout.PAGE_START);
        pane.add(panel, BorderLayout.CENTER);
    }

    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout) (panel.getLayout());
        cl.show(panel, (String) evt.getItem());
    }

    private static void GUIAccueil() {
        /*Creation de la fenetre*/
        JFrame frame = new JFrame("PetRescueSaga");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        /*Icone de la fenetre*/
        ImageIcon icon =  new ImageIcon("C:/Users/alexv/Desktop/POO/projet-pet-rescue-saga/src/Game/image/logo.png");
        frame.setIconImage(icon.getImage());

        /*Cration du content pane*/
        Accueil accueil = new Accueil();
        accueil.addComponentToPane(frame.getContentPane());
        
        /*Affichage de la fenêtre*/
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUIAccueil();
            }
        });
    }
}