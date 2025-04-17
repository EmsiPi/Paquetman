public class Joueur {

    private int point;
    private int LIFE = 4;
    private String pseudo;

    public void setLIFE(int LIFE) {
        this.LIFE = LIFE;
    }

    public int getLIFE() {
        return LIFE;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void ouille (){
        var valueLife = this.LIFE - 1;
        this.setLIFE(valueLife);
    }

    //reconnaissance de la commande avec switch/case -> fonction de deplacement choisie

}
