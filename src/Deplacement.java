public class Deplacement {

    public static void right(BouleJaune bouleJaune){
        bouleJaune.cooBoule.j++;
    }

    public static void left(BouleJaune bouleJaune){
        bouleJaune.cooBoule.j--;
    }

    public static void up(BouleJaune bouleJaune){
        bouleJaune.cooBoule.i++;
    }

    public static void down(BouleJaune bouleJaune){
        bouleJaune.cooBoule.i--;
    }

    public static void selectDeplacement (String zqsd, Grille grille){

        Case[][] plateau = grille.getPlateau();
        BouleJaune bouleJaune = grille.getBouleJaune();
        plateau[bouleJaune.cooBoule.getI()][bouleJaune.cooBoule.getJ()].removeBouleJaune();
        System.out.println(grille);

        switch(zqsd) {

            case "z":
                up(grille.getBouleJaune());
                grille.resetBouleCoo();
                break;
            case "q":
                left(grille.getBouleJaune());
                grille.resetBouleCoo();
                break;
            case "s":
                down(grille.getBouleJaune());
                grille.resetBouleCoo();
                break;
            case "d":
                right(grille.getBouleJaune());
                grille.resetBouleCoo();
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }

    }

}


