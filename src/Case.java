public class Case {
    Marque marque;
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
