package Courses.TP.tp1;

import java.util.Scanner;

public class TP15 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n ==== TP1.5 ==== \n");
        //Demander à l'utilisateur de saisir un nombre
        System.out.println("Rentrer un nombre :");
        int number = sc.nextInt();
        //Afficher si le nombre est premier ou non
        if (isPrime(number)) {
            System.out.println("\n" + number + " est un nombre premier");
        } else {
            System.out.println("\n" + number + " n'est pas un nombre premier");
        }
    }

    //Fonction pour détecter si un nombre est premier
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
