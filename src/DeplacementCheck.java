public class DeplacementCheck {
    public static void verifUp (Grille grille) {
        int i = grille.bouleJaune.getCooBoule().i;
        if (i -1 <= 0){
            throw new DeplacementException();
        }
    }

    public static void verifDown (Grille grille) {
        int i = grille.bouleJaune.getCooBoule().i;
        int size = grille.getSize();
        if (i>= size - 1){
            throw new DeplacementException();
        }
    }

    public static void verifRight (Grille grille) {
        int j = grille.bouleJaune.getCooBoule().j;
        int size = grille.getSize();
        if (j >= size -1 ){
            throw new DeplacementException();
        }
    }

    public static void verifLeft (Grille grille) {
        int j = grille.bouleJaune.getCooBoule().j;
        if (j - 1 < 0 ){
            throw new DeplacementException();
        }
    }
}
