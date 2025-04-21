public class Pieges implements Special {

    public Marque getMarque() {
        return Marque.TRAP;
    }

    @Override
    public void setMarque() {

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
