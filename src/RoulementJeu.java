import java.util.List;
import java.util.Scanner;

public class RoulementJeu {

    public static void lancementJeu(){

        Joueur joueur = new Joueur();

        System.out.println("Quel est ton pseudo ? ");
        Scanner scanner = new Scanner(System.in);
        var pseudo = scanner.nextLine();
        joueur.setPseudo(pseudo);

        long seed = Grille.randomSeed();
        Grille grille = new Grille(seed, joueur);

        System.out.println("Tu peux commencer à bouger ! Prend toutes les cerises, attention aux pièges.");

        gameplay(joueur, grille);


    }

    public static void triggerSpecials (List<Special> listeSpecial, Joueur joueur) {
        for (Special s : listeSpecial) {
            s.triggerSpecial(joueur);
        }
    }

    public static void gameplay(Joueur joueur, Grille grille ) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        boolean ok = true;
        System.out.println(grille);
        while (ok) {

            var zqsd = scanner.nextLine();

            Deplacement.selectDeplacement(zqsd, grille);

            Case[][] plateau = grille.getPlateau();
            BouleJaune bouleJaune = grille.getBouleJaune();
            Case cazCheck = plateau[bouleJaune.getCooBoule().i][bouleJaune.getCooBoule().j];

            if (!cazCheck.listeSpecial.isEmpty()) {
                triggerSpecials(cazCheck.listeSpecial, joueur);
                    cazCheck.removeListeSpecial();
            }

            System.out.println(grille);

            if (joueur.getLife() == 0) {
                ok = restartOrNot(joueur, grille);
                if (ok) {
                    grille = new Grille(grille.getSeed(), joueur);
                    System.out.println(grille);
                }
            }

            if (joueur.getPointCerise() == 2) {
                ok = nextLevelOrNot(joueur, grille);
                if(ok) {
                    grille = new Grille(grille.getSeed(), joueur);
                    System.out.println(grille);
                }
            }
        }
    }

    public static boolean nextLevelOrNot (Joueur joueur, Grille grille) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tu as mangé toutes les cerises ! Souhaites tu passer au niveau suivant ? (Un piège en +) ");
        var reponse = scanner.nextLine();

        if ("oui".equalsIgnoreCase(reponse)) {
            joueur.nextLevel();
            joueur.resetPointCerise();
            return true;
        }
        System.out.println("Tu as pu aller jusqu'au niveau : " + joueur.getLevel());
        return false;
    }

    public static boolean restartOrNot(Joueur joueur, Grille grille) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bien essayé ! Souhaites tu recommencer (répondre par oui ou par non) ? J'espère que tu as bien mémorisé la carte");
        var reponse = scanner.nextLine();

        if ("oui".equalsIgnoreCase(reponse)) {
            joueur.resetLife();
            joueur.resetPointCerise();
            return true;
        }
        System.out.println("Tu as pu aller jusqu'au niveau : " + joueur.getLevel())
        System.out.println("Fin de partie ! A la prochaine ;)");
        return false;
    }

}
