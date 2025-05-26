import java.util.List;
import java.util.Scanner;

public class RoulementJeu {

    public static void lancementJeu(){

        Joueur joueur = new Joueur();
        joueur.setLevel(1);

        System.out.println("Quel est ton pseudo ? ");
        Scanner scanner = new Scanner(System.in);
        var pseudo = scanner.nextLine();
        joueur.setPseudo(pseudo);

        long seed = Grille.randomSeed();
        Grille grille= new Grille(seed, joueur);

        System.out.println("Tu peux commencer à bouger ! Prend toutes les cerises, attention aux pièges.");

        gameplay(joueur, grille);


    }

    public static void triggerSpecials (List<Special> listeSpecial, Joueur joueur) {
        for (Special s : listeSpecial) {
            s.triggerSpecial(joueur);
        }
    }

    public static void gameplay(Joueur joueur, Grille grille ) {
        System.out.println(grille);
        Scanner scanner;
        scanner = new Scanner(System.in);
        do {
            do {
                var zqsd = scanner.nextLine();

                Deplacement.selectDeplacement(zqsd, grille);

                Case[][] plateau = grille.getPlateau();
                BouleJaune bouleJaune = grille.getBouleJaune();
                Case cazCheck = plateau[bouleJaune.getCooBoule().i][bouleJaune.getCooBoule().j];

                if (!cazCheck.listeSpecial.isEmpty()) {
                    triggerSpecials(cazCheck.listeSpecial, joueur);
                    cazCheck.removeListeSpecial();
                }

                if (joueur.getPointCerise() == 2) {
                    break;
                }

                if (joueur.getLife()==0) {
                    restartOrNot(joueur, grille);
                }

                System.out.println(grille);
            } while (joueur.getLife()!=0);

        } while (nextLevelOrNot(joueur, grille));

    }

//    do {
//         do {gameplay
//                    point cerise ok break;
//                while restart;
//    } while (nextLevelOrNot)
//        restart or not

    public static boolean nextLevelOrNot (Joueur joueur, Grille grille) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tu as mangé toutes les cerises ! Souhaites tu passer au niveau suivant ? (Un piège en +) ");
        var reponse = scanner.nextLine();

        if ("oui".equalsIgnoreCase(reponse)) {
            joueur.nextLevel();
            joueur.resetPointCerise();

            Grille grilleB = new Grille(grille.getSeed(), joueur);

            return true;

        }
        System.out.println("Tu as pu aller jusqu'au niveau : " + joueur.getLevel());
        return false;
    }

    public static void restartOrNot(Joueur joueur, Grille grille) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bien essayé ! Souhaites tu recommencer (répondre par oui ou par non) ? J'espère que tu as bien mémorisé la carte");
        var reponse = scanner.nextLine();

        if ("oui".equalsIgnoreCase(reponse)) {
            joueur.resetLife();
            joueur.resetPointCerise();
            grille = new Grille(grille.getSeed(), joueur);

        }
    }

}
