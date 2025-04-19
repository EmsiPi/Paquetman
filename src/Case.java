import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Case {
    List<ContenuCase> contenuCase = new ArrayList<>();

    Coo coo = new Coo();

    public void setCoo(Coo coo) {
        this.coo = coo;
    }

    public Coo getCoo() {
        return coo;
    }

    public void addContenuCase(ContenuCase content){
        this.contenuCase.add(content);
    }

    public void removeContenuCase(ContenuCase content){
        this.contenuCase.remove(content);
    }

    public String toString() {
        if(contenuCase == null) {
            return "[ ]";
        }

        return "[" + contenuCase.getFirst().getMarque() + "]";
    }

    public static Case randomEmptyCase(Grille grille){
        Case caz;

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
