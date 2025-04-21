public class Cerises extends Special implements ContenuCase {

    @Override
    public Marque getMarque() {
        return Marque.CHERRY;
    }

    @Override
    public String getValue() {
        return this.getMarque().getValue();
    }

}