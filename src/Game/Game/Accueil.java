package Game;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

//import Levels.Niveau_1;

public class Accueil {

    private JPanel panel;
    private JList<?> niveau;

    private String[] args;

    public void addComponentToPane(Container pane) {

        /*Image du jeu dans la page Accueil*/
        Icon img = new ImageIcon("src/Game/image/logo.png");
        JLabel labImg =new JLabel();
        labImg.setIcon(img);

        /* Création des Panels */
        JPanel panNiveau = new JPanel();
        JPanel panButton = new JPanel();

        /* Création des boutons */
        JButton jouer = new JButton("Jouer");
        JButton quitter = new JButton("Quitter le jeu");
        
        /* Propriétés des boutons */
        jouer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Lanceur.main(args);
            }
        });
        quitter.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        /* Création d'une liste avec différents niveaux */
        String[] niveaux = { "Niveau_1", "Niveau_2", "Niveau_3" };
        niveau = new JList<String>(niveaux);
        niveau.setBackground(Color.WHITE);

        /* Ajouts d'objets dans les panels */
        panNiveau.add(niveau);

        panButton.add(jouer);
        panButton.add(quitter);

        panel = new JPanel(new CardLayout());
        panel.add(panButton);
        //
        pane.add(labImg, BorderLayout.PAGE_START);
        pane.add(niveau, BorderLayout.CENTER);
        pane.add(panel, BorderLayout.PAGE_END);
    }

    private static void GUIAccueil() throws IOException {
        /*Creation de la fenetre*/
        JFrame frame = new JFrame("PetRescueSaga");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        /*Icone de la fenetre*/
        try {
            frame.setIconImage(ImageIO.read(new File("src/Game/image/logo.png")));
        } 
        catch (IOException e) {
            System.out.println("L'image n'a pas ete trouve.");
        }
        

        /*Cration du content pane*/
        Accueil accueil = new Accueil();
        accueil.addComponentToPane(frame.getContentPane());
        
        /*Affichage de la fenêtre*/
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    try {
                        GUIAccueil();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        );
    }


    /*Getters*/
    public JPanel getPanel() {
        return panel;
    }

    public JList<?> getNiveau() {
        return niveau;
    }
}