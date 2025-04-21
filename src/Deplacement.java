public class Deplacement {


    public static void right(Grille grille) {
        try {
            DeplacementCheck.verifRight(grille);
        } catch (DeplacementException e) {
            return;
        }
        grille.removeBouleJaune();
        grille.bouleJaune.cooBoule.j++;
        grille.resetBouleCoo();

    }

    public static void left(Grille grille){
        try {
            DeplacementCheck.verifLeft(grille);
        } catch (DeplacementException e) {
            return;
        }
        grille.removeBouleJaune();
        grille.bouleJaune.cooBoule.j--;
        grille.resetBouleCoo();
    }

    public static void up(Grille grille){
        try {
            DeplacementCheck.verifUp(grille);
        } catch (DeplacementException e) {
            return;
        }
        grille.removeBouleJaune();
        grille.bouleJaune.cooBoule.i--;;
        grille.resetBouleCoo();
    }

    public static void down(Grille grille){
        try {
            DeplacementCheck.verifDown(grille);
        } catch (DeplacementException e) {
            return;
        }
        grille.removeBouleJaune();
        grille.bouleJaune.cooBoule.i++;
        grille.resetBouleCoo();
    }

    public static void selectDeplacement (String zqsd, Grille grille){

        switch(zqsd) {

            case "z":
                up(grille);
                break;
            case "q":
                left(grille);
                break;
            case "s":
                down(grille);
                break;
            case "d":
                right(grille);
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }

    }

}


