package Courses.TP.tp2.Controllers;

import Courses.TP.tp2.Models.TSortedArray;

import java.util.Arrays;
import java.util.List;

import static Utils.Utilitaires.randomArray;

public class TriFusion {

    public static List<TSortedArray> controller(int arraySize) {
        int[] randomArray = randomArray(arraySize);
        
        int[] sortedArrayTF = randomArray.clone();
        double debutTempsTriFusion = System.nanoTime ();
        triFusion(sortedArrayTF, 0, arraySize - 1);
        double finTempsTriFusion = System.nanoTime ();
        float tempsTriFusion = (float) ((finTempsTriFusion - debutTempsTriFusion) / 1000000);
        TSortedArray resultTriFusion = new TSortedArray("Tri fusion", randomArray, sortedArrayTF, arraySize, tempsTriFusion);

        int[] sortedArrayJV = randomArray.clone();
        double debutTempsTriJava = System.nanoTime ();
        Arrays.sort(sortedArrayJV);
        double finTempsTriJava = System.nanoTime ();
        float tempsTriJava = (float) ((finTempsTriJava - debutTempsTriJava) / 1000000);
        TSortedArray resultTriJava = new TSortedArray("Tri Java", randomArray, sortedArrayJV, arraySize, tempsTriJava);
        
        return List.of(resultTriFusion, resultTriJava) ;
    }

    private static void triFusion(int[] tableau, int deb, int fin) {
        if (deb != fin) {
            int milieu = (fin + deb) / 2;
            triFusion(tableau, deb, milieu);
            triFusion(tableau, milieu + 1, fin);
            fusion(tableau, deb, milieu, fin);
        }
    }

    private static void fusion(int[] tableau, int deb1, int fin1, int fin2) {
        int deb2 = fin1 + 1;

        int[] table1 = new int[fin1 - deb1 + 1];
        if (fin1 + 1 - deb1 >= 0) System.arraycopy(tableau, deb1, table1, 0, fin1 + 1 - deb1);

        int compt1 = deb1;
        int compt2 = deb2;

        for (int i = deb1; i <= fin2; i++) {
            if (compt1 == deb2) 
            {
                break;
            } else if (compt2 == (fin2 + 1)) 
            {
                tableau[i] = table1[compt1 - deb1]; 
                compt1++;
            } else if (table1[compt1 - deb1] < tableau[compt2]) {
                tableau[i] = table1[compt1 - deb1]; 
                compt1++;
            } else {
                tableau[i] = tableau[compt2]; 
                compt2++;
            }
        }
    }
}