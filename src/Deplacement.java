public class Deplacement {


    public static void right(Grille grille) {
        try {
            DeplacementCheck.verifRight(grille);
        } catch (DeplacementException e) {
            System.out.println(grille);
            return;
        }
        grille.removeBouleJaune();
        grille.bouleJaune.cooBoule.j++;

    }

    public static void left(Grille grille){
        try {
            DeplacementCheck.verifLeft(grille);
        } catch (DeplacementException e) {
            return;
        }
        grille.removeBouleJaune();
        grille.bouleJaune.cooBoule.j--;
    }

    public static void up(Grille grille){
        try {
            DeplacementCheck.verifUp(grille);
        } catch (DeplacementException e) {
            return;
        }
        grille.removeBouleJaune();
        grille.bouleJaune.cooBoule.i--;;
    }

    public static void down(Grille grille){
        try {
            DeplacementCheck.verifDown(grille);
        } catch (DeplacementException e) {
            return;
        }
        grille.removeBouleJaune();
        grille.bouleJaune.cooBoule.i++;
    }

    public static void selectDeplacement (String zqsd, Grille grille){

        switch(zqsd) {

            case "z":
                up(grille);
                grille.resetBouleCoo();
                break;
            case "q":
                left(grille);
                grille.resetBouleCoo();
                break;
            case "s":
                down(grille);
                grille.resetBouleCoo();
                break;
            case "d":
                right(grille);
                grille.resetBouleCoo();
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }

    }

}


