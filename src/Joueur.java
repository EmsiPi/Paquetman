public class Joueur {

    private int pointCerise;
    private final int VIEMAX = 2;
    private int life = VIEMAX;
    private int level = 1;

    private String pseudo;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void resetLife() {this.life = VIEMAX;}

    public int getLife() {
        return life;
    }

    public void setPointCerise(int pointCerise) {
        this.pointCerise = pointCerise;
    }

    public int getPointCerise() {
        return pointCerise;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public static void ouille(Joueur joueur){
        joueur.life--;
    }

    public static void miom (Joueur joueur){
        joueur.pointCerise++;
    }
    public  void nextLevel (){this.level++;}

public void resetPointCerise() {this.pointCerise = 0;}

}