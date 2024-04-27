package Courses.TP.tp1;

import java.util.Scanner;

public class Menu {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ======== \n");
        System.out.println("Voici la liste des TP disponibles :");

        // Array contenant les noms des programmes
        String[] programs = {"TP1.1", "TP1.2", "TP1.3", "TP1.4", "TP1.5"};

        //Affiche les noms des programmes
        for (int i = 0; i < programs.length; i++) {
            System.out.println(i + 1 + ". " + programs[i]);
        }

        // Demande à l'utilisateur de choisir un programme
        System.out.println("\nEntrez le numéro du TP à executer :");
        int choice = sc.nextInt();
        //Execute le programme choisi
        switch (choice) {
            case 1:
                Courses.TP.tp1.TP11.main();
                break;
            case 2:
                Courses.TP.tp1.TP12.main();
                break;
            case 3:
                Courses.TP.tp1.TP13.main();
                break;
            case 4:
                Courses.TP.tp1.TP14.main();
                break;
            case 5:
                Courses.TP.tp1.TP15.main();
                break;
            default:
                System.out.println("Ce TP n'existe pas");
        }
    }
}
