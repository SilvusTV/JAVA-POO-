package Courses.TP.tp1;

import java.util.Scanner;

/**
 * Ajouter un menu pour tout les tps.
 * Commentaire dans le code
 * faire un package par tp
 * TP1.1
 */

public class TP11 {
    public static void main() {
        System.out.println("\n ==== TP1.1 ==== \n");
        Scanner sc = new Scanner(System.in);
        // Demande à l'utilisateur d'écrire son message
        System.out.println("Rentrer votre nom :");
        // Récupère le message de l'utilisateur
        String name = sc.nextLine();
        // Affiche le message de l'utilisateur
        System.out.println("Bonjour " + name);

        //Demande à l'utilisateur 2 nombres réel
        System.out.println("Rentrer un nombre réel A:");
        int A = sc.nextInt();
        System.out.println("Rentrer un nombre réel B:");
        int B = sc.nextInt();

        if (A > B) {
            System.out.println("Le maximum entre A et B est :" + A);
        } else {
            System.out.println("Le maximum entre A et B est :" + B);
        }

        //Demander à l'utulisatuer de rentrer un nombre
        System.out.println("Rentrer un entier :");
        int entier = sc.nextInt();

        //Afficher si le nombre est pair ou impair
        if (entier % 2 == 0) {
            System.out.println(entier + " est un nombre paire");
        } else {
            System.out.println(entier + " est un nombre impaire");
        }

    }

}
