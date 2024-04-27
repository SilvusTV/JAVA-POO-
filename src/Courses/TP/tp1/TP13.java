package Courses.TP.tp1;

import java.util.Scanner;

public class TP13 {
    public static void main() {
        System.out.println("\n ==== TP1.3 ==== \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("          B       \n" +
                "      ________\n" +
                "    /|        |\\\n" +
                "   / |        | \\\n" +
                "  /  |       C|  \\\n" +
                " /   |        |   \\\n" +
                "/    |        |    \\\n" +
                "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n" +
                "          A\n");


        //Demande à l'utilisateur de rentrer les valeur de A, B et C

        System.out.println("Rentrer la valeur de A:");
        int A = sc.nextInt();
        System.out.println("Rentrer la valeur de B:");
        int B = sc.nextInt();
        System.out.println("Rentrer la valeur de C:");
        int C = sc.nextInt();

        System.out.println("\nLa surface du trapèze est : " + surface(A, B, C)+ "m²");
    }

    //Calcul de la surface du Trapèze
    private static int surface(int a, int b, int c){
        return (a + b) * c / 2;
    }
}
