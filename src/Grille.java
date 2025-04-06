public class Grille {

    public static final int SIZE = 6;

    private final Case start = new Case();

    private final Case[][] plateau = new Case[SIZE][SIZE];

    private int numBoatAlive;

    public Grille() {
        initPlateau();
    }

    public void initPlateau() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                plateau[i][j] = new Case();
            }
        }
        BouleJaune bouleJaune = new BouleJaune();
        plateau[bouleJaune.cooBoule.getI()][bouleJaune.cooBoule.getJ()].setMarque(Marque.YELLOWBALL);
    }

    public Case[][] getPlateau(){
        return this.plateau;
    }

    public String toString() {
        var sb = new StringBuilder();
        for (Case[] colonne : plateau) {
            for (Case c : colonne) {
                sb.append(c);
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}