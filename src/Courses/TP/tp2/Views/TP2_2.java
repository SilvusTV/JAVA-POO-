package Courses.TP.tp2.Views;

import Courses.TP.tp2.Controllers.Fibonacci;
import Courses.TP.tp2.Models.TFibonacci;

import java.util.List;
import java.util.Scanner;

public class TP2_2 {
    public static void view() {
        System.out.println("\n ==== TP2.2 ==== \n");
        Scanner scanner = new Scanner(System.in);
        int n;
        String detail;
        n = Utils.Utilitaires.secureScannerInt(scanner, "Veuillez entrer un nombre entier n : ");
        TFibonacci fibonacci = Fibonacci.controller(n);
        List<Integer> listFibonacci = fibonacci.getlistFibonacci();

        do {
            detail = Utils.Utilitaires.scannerString(scanner, "\nVoulez-vous afficher le détail ? [oui/non] : ");
        } while (!detail.equalsIgnoreCase("oui") && !detail.equalsIgnoreCase("non"));
        if (detail.equals("oui")) {
            listFibonacci.forEach((i) -> System.out.println("Fibonacci de " + listFibonacci.indexOf(i) + " est : " + i));
        } else {
            System.out.println("Fibonacci de " + n + " est : " + fibonacci.getFibonacciValuePerIndex(n));
        }
    }
}
