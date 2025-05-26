import java.util.List;
import java.util.Objects;
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
        while (joueur.getLife() != 0) {

            var zqsd = scanner.nextLine();

            Deplacement.selectDeplacement(zqsd, grille);

            Case[][] plateau = grille.getPlateau();
            BouleJaune bouleJaune = grille.getBouleJaune();
            Case cazCheck = plateau[bouleJaune.getCooBoule().i][bouleJaune.getCooBoule().j];

            if (!cazCheck.listeSpecial.isEmpty()) {
                triggerSpecials(cazCheck.listeSpecial, joueur);
                cazCheck.removeListeSpecial();
            }

            if (joueur.getPointCerise() == Grille.getEffectifCerises()) {
                System.out.println(grille);
                nextLevelOrNot(joueur, grille);
                break;
            }

            System.out.println(grille);
        }

        restartOrNot(joueur,grille);

    }

    public static void nextLevelOrNot (Joueur joueur, Grille grille) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tu as mangé toutes les cerises ! Souhaites tu passer au niveau suivant ? (Un piège en +) ");
        var reponse = scanner.nextLine();

        if (Objects.equals(reponse, "oui")) {
            joueur.nextLevel();
            joueur.resetPointCerise();

            Grille grilleB = new Grille(grille.getSeed(), joueur);

            gameplay(joueur, grilleB);

        }
        System.out.println("Tu as pu aller jusqu'au niveau : " + joueur.getLevel());
    }

    public static void restartOrNot (Joueur joueur, Grille grille) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bien essayé ! Souhaites tu recommencer (répondre par oui ou par non) ? J'espère que tu as bien mémorisé la carte");
        var reponse = scanner.nextLine();

        while (Objects.equals(reponse, "oui")) {
            joueur.resetLife();
            Grille grilleB = new Grille(grille.getSeed(), joueur);

            gameplay(joueur, grilleB);

            System.out.println("Bien essayé ! Souhaites tu recommencer (répondre par oui ou par non) ? J'espère que tu as bien mémorisé la carte");
            reponse = scanner.nextLine();
        }
    }

}
