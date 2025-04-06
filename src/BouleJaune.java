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

    public void right(BouleJaune bouleJaune){
        bouleJaune.cooBoule.i++;
    }

    public void left(BouleJaune bouleJaune){
        bouleJaune.cooBoule.i = bouleJaune.cooBoule.i - 1;
    }

    public void up(BouleJaune bouleJaune){
        bouleJaune.cooBoule.j++;
    }

    public void down(BouleJaune bouleJaune){
        bouleJaune.cooBoule.j = bouleJaune.cooBoule.j - 1;
    }

}
