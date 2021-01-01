package Levels;

import Game.*;

import java.util.Random;

public class LevelOne extends Plateau{

    private Case cases[][];

    public LevelOne(int largeur, int longueur) {
        super(largeur, longueur);
        cases = super.getCases();
        Random r =new Random();
        for(int i = 0; i < longueur; i++){
            for(int j = 0; j < largeur; j++){
                cases[i][j] =new Case(new Cube(couleurs[r.nextInt(5)]));
            }
        }
    }
    
}