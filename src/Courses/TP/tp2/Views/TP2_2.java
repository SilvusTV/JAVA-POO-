package Courses.TP.tp2.Views;

import java.util.List;
import java.util.Scanner;

public class TP2_2 {
    public static void view() {
        System.out.println("\n ==== TP2.2 ==== \n");
        Scanner scanner = new Scanner(System.in);
        int n;
        String detail;
        n = Utils.Utilitaires.secureScannerInt(scanner, "Veuillez entrer un nombre entier n : ");
        List<Integer> fibonacci = Courses.TP.tp2.Controllers.TP2_2.controller(n);
        
        do {
            detail = Utils.Utilitaires.scannerString(scanner, "\nVoulez-vous afficher le détail ? [oui/non] : ");
        }while (!detail.equalsIgnoreCase("oui") && !detail.equalsIgnoreCase("non"));
        if (detail.equals("oui")) {
            fibonacci.forEach((i) -> System.out.println("Fibonacci de " + fibonacci.indexOf(i) + " est : " + i));
        }else{
            System.out.println("Fibonacci de " + n + " est : " + fibonacci.get(n));
        }
    }
}
