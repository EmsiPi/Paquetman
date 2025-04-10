public class Deplacement {

    public static void right(BouleJaune bouleJaune){
        bouleJaune.cooBoule.i++;
    }

    public static void left(BouleJaune bouleJaune){
        bouleJaune.cooBoule.i = bouleJaune.cooBoule.i - 1;
    }

    public static void up(BouleJaune bouleJaune){
        bouleJaune.cooBoule.j++;
    }

    public static void down(BouleJaune bouleJaune){
        bouleJaune.cooBoule.j = bouleJaune.cooBoule.j - 1;
    }

}


