package Courses.TP.tp2.Views;

import Courses.TP.tp2.Controllers.TriFusion;
import Courses.TP.tp2.Models.TSortedArray;

import java.util.List;
import java.util.Scanner;

public class TP2_4 {
    public static void view() {
        System.out.println("\n ==== TP2.4 ==== \n"); 
        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        arrayLength = Utils.Utilitaires.secureScannerInt(scanner, "Veuillez entrer la taille du tableau à trier: ");
        List<TSortedArray> listSortedArrays = TriFusion.controller(arrayLength);

        List<Integer> startedArray = listSortedArrays.get(0).getStartArray();
        System.out.println("Tableau de départ : \n"+startedArray);
        
        for (TSortedArray sortedArray : listSortedArrays) {
            System.out.println("\n=====================\n");
            System.out.println("Tableau trié par : "+sortedArray.getSortType());
            System.out.println("Trié en "+sortedArray.getTimeTaken()+"ms");
            System.out.println("Résultat : \n"+sortedArray.getSortedArray());
        }
        
    }
}