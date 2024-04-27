package Courses.TP.tp1;

import java.util.Scanner;

public class TP12 {
    public static void main() {
        System.out.println("\n ==== TP1.2 ==== \n");
        Scanner sc = new Scanner(System.in);

        String[] programs = {"Addition", "Soustraction", "Multiplication", "Division"};

        //Demander quel opérateur vas être utilisé
        System.out.println("Quel opérateur voulez-vous utiliser ?");
        for (int i = 0; i < programs.length; i++) {
            System.out.println(i + 1 + ". " + programs[i]);
        }
        int choice = sc.nextInt();

        //Demander à l'utilisateur 2 nombres réel
        System.out.println("\nRentrer un nombre réel A:");
        int A = sc.nextInt();
        System.out.println("Rentrer un nombre réel B:");
        int B = sc.nextInt();
        System.out.println("\n");


        //Execute l'opérateur choisi et affiche le résultat
        int result;
        switch (choice){
            case 1:
                result = addition(A, B);
                System.out.println("Le résultat de l'addition est : " + result);
                break;
            case 2:
                result = soustraction(A, B);
                System.out.println("Le résultat de la soustraction est : " + result);
                break;
            case 3:
                result = multiplication(A, B);
                System.out.println("Le résultat de la multiplication est : " + result);
                break;
            case 4:
                result = division(A, B);
                System.out.println("Le résultat de la division est : " + result);
                break;
            default:
                System.out.println("Cet opérateur n'existe pas");
                break;
        }
    }

    //Fonction pour additionner 2 nombres
    private static int addition(int a, int b){
        return a + b;
    }

    //Fonction pour soustraire 2 nombres
    private static int soustraction(int a, int b){
        return a - b;
    }

    //Fonction pour multiplier 2 nombres
    private static int multiplication(int a, int b){
        return a * b;
    }

    //Fonction pour diviser 2 nombres
    private static int division(int a, int b){
        return a / b;
    }
}
