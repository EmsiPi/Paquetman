public class Pieges extends Special implements ContenuCase {

    @Override
    public Marque getMarque() {
        return Marque.TRAP;
    }

    @Override
    public String getValue() {
        return this.getMarque().getValue();
    }

}
