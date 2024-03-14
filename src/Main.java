import helloworld.HelloWorld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voici la liste des programmes disponibles :");

        // Array contenant les noms des programmes
        String[] programs = {"HelloWorld", "TP1"};

        //Affiche les noms des programmes
        for (int i = 0; i < programs.length; i++) {
            System.out.println(i + 1 + ". " + programs[i]);
        }

        // Demande à l'utilisateur de choisir un programme
        System.out.println("\nEntrez le numéro du programme à lancer :");
        //Execute le programme choisi
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                HelloWorld.main(args);
                break;
            case 2:
                Courses.TP.tp1.Menu.main(args);
                break;
            default:
                System.out.println("Ce programme n'existe pas");
        }
    }
}
