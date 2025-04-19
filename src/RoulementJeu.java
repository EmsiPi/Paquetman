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
        System.out.println(grille);

        while (joueur.getLIFE()!=0){
            var zqsd = scanner.nextLine();
            Deplacement.selectDeplacement(zqsd, grille);
            System.out.println(grille);
        }

        //fonction de déplacement

    }

}
