public class Cerises implements Special {

    Marque marque;

    public Cerises() {
        this.marque = Marque.CHERRY;
    }

    public Marque getMarque() {
        return this.marque;
    }

    @Override
    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    @Override
    public void triggerSpecial(Joueur joueur) {
        pointCerise(joueur);
        System.out.println("Tutulu ! Miom la bonne cerise, ton score est de : "+ joueur.getPointCerise());
    }

    public void pointCerise(Joueur joueur) {
        Joueur.miom(joueur);
    }

}