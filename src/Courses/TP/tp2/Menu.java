package Courses.TP.tp2;

import java.util.Scanner;

import static Utils.Utilitaires.scannerString;
import static Utils.Utilitaires.secureScannerInt;

public class Menu {
    public static void execute() {
        String[] ListTP = {"TP2.1", "TP2.2", "TP2.3", "TP2.4"};
        Scanner sc = new Scanner(System.in);
        int choice;
        String quit;
        do {
            try {
                System.out.println("\n\n=== MENU TP2 ===");
                System.out.println("\nVoici la liste des programmes disponibles :");

                //Affiche les noms des programmes
                for (int i = 0; i < ListTP.length; i++) {
                    System.out.println(i + 1 + ". " + ListTP[i]);
                }
                // Demande à l'utilisateur de choisir un programme
                choice = secureScannerInt(sc, "\nEntrez le numéro du programme à lancer :");
                //Execute le programme choisi
                switch (choice) {
                    case 1:
                        Courses.TP.tp2.Views.TP2_1.view();
                        break;
                    case 2:
                        Courses.TP.tp2.Views.TP2_2.view();
                        break;
                    case 3:
                        Courses.TP.tp2.Views.TP2_3.view();
                        break;
                    case 4:
                        Courses.TP.tp2.Views.TP2_4.view();
                        break;
                    default:
                        System.out.println("Ce TP n'existe pas");
                        break;
                }
            } catch (Exception e) {
                System.out.flush();
                System.err.println("une erreur a été détectée => " + e);
                System.err.flush();
            }
            quit = scannerString(sc, "\nVoulez-vous recommencer le menu du TP2 [y/n] ? (n) : ");
        } while (quit.equalsIgnoreCase("y"));
    }
}
