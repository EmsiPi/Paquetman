public class BouleJaune implements ContenuCase {

    Coo cooBoule = new Coo();

    public BouleJaune() {
        this.cooBoule.initCoo();
    }

    public void setCooBoule(Coo cooBoule) {
        this.cooBoule = cooBoule;
    }

    public Coo getCooBoule() {
        return cooBoule;
    }

    @Override
    public Marque getMarque() {
        return Marque.YELLOWBALL;
    }

    @Override
    public String getValue() {
        return this.getMarque().getValue();
    }
}
