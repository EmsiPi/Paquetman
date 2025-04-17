public class Case {
    Marque marque;
    BouleJaune bouleJaune;
    Coo coo = new Coo();

    public void setCoo(Coo coo) {
        this.coo = coo;
    }

    public Coo getCoo() {
        return coo;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public void setBouleJaune(BouleJaune bouleJaune){
        this.bouleJaune = bouleJaune;
        this.marque = bouleJaune.marque;
    }

    public void removeBouleJaune(){
        this.bouleJaune = null;
    }

    public Marque getMarque() {
        return marque;
    }

    public String toString() {
        if(marque == null) {
            return "[ ]";
        }

        return "[" + marque.getValue() + "]";
    }
}
