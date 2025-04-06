public class Coo {
    int i;
    int j;
    private final int INIT = 0;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void initCoo(){
        this.setI(INIT);
        this.setJ(INIT);
    }
}
