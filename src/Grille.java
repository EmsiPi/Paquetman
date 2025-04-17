public class Grille {

    public static final int SIZE = 6;

    private final Case[][] plateau = new Case[SIZE][SIZE];

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
        plateau[bouleJaune.cooBoule.getI()][bouleJaune.cooBoule.getJ()].setBouleJaune(bouleJaune);

        Special cerise1 = new Cerises();
        setRandomCaseSpecial(cerise1);
        Special trap1 = new Pieges();
        setRandomCaseSpecial(trap1);
    }
    public void setRandomCaseSpecial (Special special){
        Case caz = Case.randomEmptyCase(this);
        setSpecial(plateau[caz.getCoo().getI()][caz.getCoo().getJ()],special);
    }
    public void setSpecial(Case caz, Special special){
        caz.setSpecial(special);
    }

    public Case[][] getPlateau(){
        return this.plateau;
    }

    public int getSize(){
        return SIZE;
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