import java.util.Random;

public class Grille {

    BouleJaune bouleJaune = new BouleJaune();

    public static final int SIZE = 6;

    private Random random;

    private long seed;

    private final Case[][] plateau = new Case[SIZE][SIZE];

    public static int effectifCerises =2;

    public static int getEffectifCerises() {
        return effectifCerises;
    }

    public Grille(long seed, Joueur joueur) {
        initPlateau(seed, joueur);
    }

    public void initPlateau(long seed, Joueur joueur) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                plateau[i][j] = new Case();
            }
        }

        setSeed(seed);
        Random random = new Random(seed);
        setRandomSeed(random);

        plateau[this.bouleJaune.cooBoule.getI()][this.bouleJaune.cooBoule.getJ()].addContenuCase(bouleJaune);

        initialSetSpecial(joueur);
    }

    public void setSeed(long seed) {
        this.seed = seed;
    }

    public long getSeed() {
        return seed;
    }

    public void initialSetSpecial (Joueur joueur) {
        Special cerise1 = new Cerises();
        setRandomCaseSpecial(cerise1);
        Special cerise2 = new Cerises();
        setRandomCaseSpecial(cerise2);
        int i = 0;
        while (i <= joueur.getLevel()) {
            Special trap = new Pieges();
            setRandomCaseSpecial(trap);
            i++;
        }
    }
    public void setRandomSeed(Random seed) {
        this.random = seed;
    }

    public Random getRandom() {
        return random;
    }

    public static long randomSeed() {
        Random random = new Random();
        return random.nextInt();
    }

    public void setRandomCaseSpecial (Special special) {
        Case caz = Case.randomEmptyCase(this);
        setSpecial(caz,special);
    }

    public void resetBouleCoo () {
        plateau[this.bouleJaune.cooBoule.getI()][this.bouleJaune.cooBoule.getJ()].addContenuCase(bouleJaune);
    }

    public void removeBouleJaune() {
        BouleJaune bouleJaune = this.getBouleJaune();
        plateau[bouleJaune.cooBoule.getI()][bouleJaune.cooBoule.getJ()].removeContenuCase(this.bouleJaune);
    }

    public void setSpecial(Case caz, Special special) {
        caz.addListeSpecial(special);
    }

    public Case[][] getPlateau(){
        return this.plateau;
    }

    public int getSize(){
        return SIZE;
    }

    public BouleJaune getBouleJaune() {
        return bouleJaune;
    }

    public String toString() {
        var sb = new StringBuilder();
        for (Case[] colonne : plateau) {
            for (Case c : colonne) {
                sb.append(c);
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}