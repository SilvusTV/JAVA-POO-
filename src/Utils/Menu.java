package Utils;

import java.util.Scanner;

public class Menu {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        int choice;
        String quit;
        // Array contenant les noms des programmes
        String[] programs = {"TP1", "TP2"};
        do {
            try {
                System.out.println("Voici la liste des programmes disponibles :");

                //Affiche les noms des programmes
                for (int i = 0; i < programs.length; i++) {
                    System.out.println(i + 1 + ". " + programs[i]);
                }

                // Demande à l'utilisateur de choisir un programme
                System.out.println("\nEntrez le numéro du programme à lancer :");
                choice = sc.nextInt();
                //Execute le programme choisi
                switch (choice) {
                    case 1:
                        Courses.TP.tp1.Menu.main();
                        break;
                    case 2:
                        Courses.TP.tp2.Menu.execute();
                        break;
                    default:
                        System.out.println("Ce programme n'existe pas");
                        break;
                }
            } catch (Exception e) {
                System.out.flush();
                System.err.println("une erreur a été détectée => " + e.toString());
                System.err.flush();
            }
            System.out.println();
            System.out.print("Voulez-vous recommencer le menu d'entré [y/n] ? (n) : ");
            quit = sc.nextLine();
        } while ("y".equalsIgnoreCase(quit));
        System.out.println("\nMerci et à bientôt");
    }
}