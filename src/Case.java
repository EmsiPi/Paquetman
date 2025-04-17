import java.util.Random;

public class Case {
    Marque marque;
    Special special;
    BouleJaune bouleJaune;
    Coo coo = new Coo();

    public void setCoo(Coo coo) {
        this.coo = coo;
    }

    public Coo getCoo() {
        return coo;
    }

    public void setSpecial(Special special){
        this.special = special;
        this.marque = special.marque;
    }

    public void setBouleJaune(BouleJaune bouleJaune){
        this.bouleJaune = bouleJaune;
        this.marque = bouleJaune.marque;
    }

    public void removeBouleJaune(){
        this.bouleJaune = null;
    }

    public Marque getMarque() {
        return marque;
    }

    public String toString() {
        if(marque == null) {
            return "[ ]";
        }

        return "[" + marque.getValue() + "]";
    }

    public Case randomCase(Grille grille){
        Random random = new Random();
        int i = random.nextInt(grille.getSize());
        int j = random.nextInt(grille.getSize());

        Case[][] plateau = grille.getPlateau();
        return plateau[i][j];
    }
}
