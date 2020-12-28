package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//import Levels.Niveau_1;

public class Accueil implements ItemListener {
    
    private JPanel panel;
    private JList niveau;
    
    private String[] args;

    public void addComponentToPane(Container pane) {
        /*Création des Panels*/
        JPanel panNiveau = new JPanel(); 
        JPanel panButton = new JPanel();
        
        /*Création des boutons*/
        JButton jouer =new JButton("Jouer");
        JButton quitter =new JButton("Quitter le jeu");

        /*Propriétés du bouton quitter*/
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
        String[] niveaux = {"Niveau_1", "Niveau_2", "Niveau_3"};
        niveau =new JList<String>(niveaux);
        niveau.setBackground(Color.WHITE);

        

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
        frame.setSize(300, 130);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        // NIVEAUX
        /*Propriétés du bouton jouer*/
        /*if(niveau.getSelectedValue() == "Niveau_1"){
            jouer.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                    Niveau_1.main(args);
                }
            }); 
        }
        if(niveau.getSelectedValue() == "Niveau_2"){
            jouer.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                    Lanceur.main(args);
                }
            }); 
        }
        if(niveau.getSelectedValue() == "Niveau_3"){
            jouer.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                    Lanceur.main(args);
                }
            }); 
        }*/
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUIAccueil();
            }
        });
    }


    /*Getters*/
    public JPanel getPanel() {
        return panel;
    }

    public JList getNiveau() {
        return niveau;
    }
}