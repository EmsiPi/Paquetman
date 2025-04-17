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

    public static Case randomEmptyCase(Grille grille){
        Random random = new Random();
        Case caz = new Case();
        Coo coo = caz.getCoo();

        while(true){
            caz = randomCase(grille);
            if(checkEmptyCase(grille.getPlateau()[caz.getCoo().getI()][caz.getCoo().getJ()])){
                return caz;
            }
        }
    }

    public static Case randomCase(Grille grille){
        Random random = new Random();
        Case caz = new Case();
        Case[][] plateau = grille.getPlateau();
        Coo coo = caz.getCoo();

        coo.setI(random.nextInt(grille.getSize()));
        coo.setJ(random.nextInt(grille.getSize()));

        caz.setCoo(coo);

        return caz;
    }

    public static boolean checkEmptyCase(Case caz){
        return (caz.marque == null);
    }
}
