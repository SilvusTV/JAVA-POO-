package Courses.TP.tp2.Views;

import Courses.TP.tp2.Controllers.NombreDOr;

import java.util.List;
import java.util.Scanner;

public class TP2_3 {
    public static void view() {
        System.out.println("\n ==== TP2.3 ==== \n");
        Scanner scanner = new Scanner(System.in);
        int n;

        n = Utils.Utilitaires.secureScannerInt(scanner, "Veuillez entrer un nombre entier n : ");
        List<Float> nombreDOr = NombreDOr.controller(n);
        
        for (int i = 0; i < nombreDOr.size(); i++) {
            System.out.println("O[" + (i + 1) + "] = " + nombreDOr.get(i));
        }
        System.out.println("\nNombre d'or est : " + (float) (1 + Math.sqrt(5)) / 2);
        System.out.println("\nNous voyons que plus n augmente, plus O[n] tend vers la valeur du nombre d'or.");
    }
}
