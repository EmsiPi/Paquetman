import java.util.ArrayList;
import java.util.List;

public class Case {
    List<ContenuCase> contenuCase = new ArrayList<>();
    List<Special> listeSpecial = new ArrayList<>();

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

    public void addListeSpecial(Special special){
        this.listeSpecial.add(special);
    }

    public void removeListeSpecial(){
        this.listeSpecial.removeFirst();
    }

    public String toString() {
        if(!contenuCase.isEmpty()) {
            return "[" + contenuCase.getLast().getMarque().getValue() + "]";
        }
        if(!listeSpecial.isEmpty()) {
            return "[" + listeSpecial.getLast().getMarque().getValue() + "]";
        }
        return "[ ]";
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
        Case caz = new Case();
        Coo coo = caz.getCoo();

        coo.setI(grille.getRandom().nextInt(grille.getSize()));
        coo.setJ(grille.getRandom().nextInt(grille.getSize()));

        caz.setCoo(coo);

        return caz;
    }

    public static boolean checkEmptyCase(Case caz){
        return (caz.contenuCase.isEmpty());
    }

}
