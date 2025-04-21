import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RoulementJeu {

    public static void lancementJeu(){
        Grille grille= new Grille();

        Joueur joueur = new Joueur();

        System.out.println("Quel est ton pseudo ? ");
        Scanner scanner = new Scanner(System.in);
        var pseudo = scanner.nextLine();
        joueur.setPseudo(pseudo);

        System.out.println("Tu peux commencer à bouger ! Prend toutes les cerises, attention aux pièges.");

        gameplay(joueur, grille);

        System.out.println("Bien essayé ! Souhaites tu recommencer (répondre par oui ou par non) ? J'espère que tu as bien mémorisé la carte");
        var reponse = scanner.nextLine();

        while (Objects.equals(reponse, "oui")) {
            joueur.resetLife();
            gameplay(joueur, grille);

            System.out.println("Bien essayé ! Souhaites tu recommencer (répondre par oui ou par non) ? J'espère que tu as bien mémorisé la carte");

            reponse = scanner.nextLine();
        }


    }

    public static void triggerSpecials (List<Special> listeSpecial, Joueur joueur) {
        for (Special s : listeSpecial) {
            s.triggerSpecial(joueur);
        }
    }

    public static void gameplay(Joueur joueur, Grille grille ) {
        System.out.println(grille);
        while (joueur.getLife()!=0){

            Scanner scanner = new Scanner(System.in);
            var zqsd = scanner.nextLine();

            Deplacement.selectDeplacement(zqsd, grille);

            Case[][] plateau = grille.getPlateau();
            BouleJaune bouleJaune = grille.getBouleJaune();
            Case cazCheck = plateau[bouleJaune.getCooBoule().i][bouleJaune.getCooBoule().j];

            if (!cazCheck.listeSpecial.isEmpty()) {
                triggerSpecials(cazCheck.listeSpecial, joueur);
            }

            System.out.println(grille);
        }
    }

}
