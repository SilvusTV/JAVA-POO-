package Courses.TP.tp3.Views;

import Courses.TP.tp3.Controllers.PaquetCartes;
import Courses.TP.tp3.Models.EFigures;
import Courses.TP.tp3.Models.EValeurs;
import Courses.TP.tp3.Models.TPaquet;

import java.util.Arrays;

public class TP3_1 {
    public static void view() {
        System.out.println("\n ==== TP3.1 ==== \n");

        TPaquet[] paquet = PaquetCartes.controller();
        System.out.println("Création d'un paquet de cartes...");

        Arrays.stream(paquet).forEach(
                carte -> {
                    if (carte.getCarte().getFigure() != EFigures.JOKER && carte.getCarte().getValeur() != EValeurs.JOKER) {
                        System.out.println(carte.getCarte().getValeur() + " de " + carte.getCarte().getFigure() + " de couleur " + carte.getCarte().getCouleur());
                    } else {
                        System.out.println("Carte " + carte.getCarte().getFigure());
                    }
                }
        );
    }
}
