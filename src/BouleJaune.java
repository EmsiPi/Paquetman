public class BouleJaune {

    Coo cooBoule = new Coo();
    Marque marque;

    public BouleJaune() {
        this.cooBoule.initCoo();
        this.marque = Marque.YELLOWBALL;
    }

    public void setCooBoule(Coo cooBoule) {
        this.cooBoule = cooBoule;
    }

    public Coo getCooBoule() {
        return cooBoule;
    }

}
