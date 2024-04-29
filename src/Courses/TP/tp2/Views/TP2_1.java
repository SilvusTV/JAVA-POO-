package Courses.TP.tp2.Views;

import Courses.TP.tp2.Controllers.Syracuse;

import java.util.List;
import java.util.Scanner;

import static Utils.Utilitaires.secureScannerInt;

public class TP2_1 {
    public static void view() {
        System.out.println("\n ==== TP2.1 ==== \n");
        Scanner scanner = new Scanner(System.in);
        int U0;
        List<Integer> syracuse;
        
        //ask for U0
        U0 = secureScannerInt(scanner, "\nEntrez la valeur de U0 ( U0 > 0 ) : ");
        
        //call the controller
        syracuse = Syracuse.controller(U0);
        
        //display the syracuse suite
        for (int i = 0; i < syracuse.size(); i++) {
            System.out.println("U" + i + " = " + syracuse.get(i));
        }
    }
}
