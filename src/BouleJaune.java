public class BouleJaune {

    Coo cooBoule = new Coo();
    String marqueBoule = "YellowBall :D";

    public BouleJaune() {
        this.cooBoule.initCoo();
    }

    public String getMarqueBoule() {
        return marqueBoule;
    }

    public void setCooBoule(Coo cooBoule) {
        this.cooBoule = cooBoule;
    }

    public Coo getCooBoule() {
        return cooBoule;
    }

}
