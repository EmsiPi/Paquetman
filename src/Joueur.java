public class Joueur {

    private int life;
    private String pseudo;

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void ouille (){
        var valueLife = this.life - 1;
        this.setLife(valueLife);
    }

    //reconnaissance de la commande -> fonction de deplacement choisie

}
