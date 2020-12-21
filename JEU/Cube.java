public class Cube{
        
    private int couleur; // de 1 à 5 (Rouge, Vert, Bleu, Jaune, Violet)

    public Cube(int couleur){
        this.couleur = couleur;
    }
    public Cube(){
        this((int)(Math.random()*5)+1);
    }
    public int getCouleur(){
        return couleur;
    }
}
