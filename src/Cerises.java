public class Cerises implements Special {

    public Marque getMarque() {
        return Marque.CHERRY;
    }

    @Override
    public void setMarque() {

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