package Courses.TP.tp1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TP14 {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.####");

    public static void main(String[] args) {
        System.out.println("\n ==== TP1.4 ==== \n");
        String[] calcul = {"Carré", "Rectangle", "Triangle rectangle", "Cercle", "Quart de cercle"};

        //Affiche et demande à l'utilisateur de choisir un calcul
        for (int i = 0; i < calcul.length; i++) {
            System.out.println(i + 1 + ". " + calcul[i]);
        }
        int choice = sc.nextInt();

        //redirige vers la fonction de calcul choisi
        switch (choice) {
            case 1:
                surfaceCarre();
                break;
            case 2:
                surfaceRectangle();
                break;
            case 3:
                surfaceTriangleRectangle();
                break;
            case 4:
                surfaceCercle();
                break;
            case 5:
                surfaceQuartCercle();
                break;
            default:
                System.out.println("Ce calcul n'existe pas");
                break;
        }
    }

    //Calcul de la surface d'un carré
    private static void surfaceCarre() {
        System.out.println("\nLa surface du carré se calcule avec la formule : c * c (coté * coté)");
        System.out.println("Rentrer la valeur de c:");
        int c = sc.nextInt();
        int carre = c * c;
        System.out.println("La surface du carré est : " + carre + " ...²");
    }

    //Calcul de la surface d'un rectangle
    private static void surfaceRectangle() {
        System.out.println("\nLa surface du rectangle se calcule avec la formule : l * L (longueur * largeur)");
        System.out.println("Rentrer la valeur de l:");
        int l = sc.nextInt();
        System.out.println("Rentrer la valeur de L:");
        int L = sc.nextInt();
        int rectangle = l * L;
        System.out.println("La surface du rectangle est : " + rectangle + " ...²");
    }

    //Calcul de la surface d'un triangle rectangle
    private static void surfaceTriangleRectangle() {
        System.out.println("\nLa surface du triangle rectangle se calcule avec la formule : (b * h) / 2 (base * hauteur / 2)");
        System.out.println("Rentrer la valeur de b:");
        int b = sc.nextInt();
        System.out.println("Rentrer la valeur de h:");
        int h = sc.nextInt();
        int triangleRectangle = (b * h) / 2;
        System.out.println("La surface du triangle rectangle est : " + triangleRectangle + " ...²");
    }

    //Calcul de la surface d'un cercle
    private static void surfaceCercle() {
        System.out.println("\nLa surface du cercle se calcule avec la formule : π * r² (pi * rayon au carré)");
        System.out.println("Rentrer la valeur de r:");
        int r = sc.nextInt();
        double cercle = Math.PI * r * r;
        System.out.println("La surface du cercle est : " + df.format(cercle) + " ...²");
    }

    //Calcul de la surface d'un quart de cercle
    private static void surfaceQuartCercle() {
        System.out.println("\nLa surface du quart de cercle se calcule avec la formule : π * r² / 4 (pi * rayon au carré / 4)");
        System.out.println("Rentrer la valeur de r:");
        int r = sc.nextInt();
        double quartCercle = Math.PI * r * r / 4;
        System.out.println("La surface du quart de cercle est : " + df.format(quartCercle) + " ...²");
    }
}
