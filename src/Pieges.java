public class Pieges implements Special {

    Marque marque;

    public Pieges() {
        this.marque = Marque.TRAPHIDE;
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
        activateTrap(joueur);
        System.out.println("It's a trap ! Il ne reste que " + joueur.getLife() + " vies !");
    }

    public void activateTrap(Joueur joueur) {
        Joueur.ouille(joueur);
    }

}
