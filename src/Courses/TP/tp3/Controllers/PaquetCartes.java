package Courses.TP.tp3.Controllers;

import Courses.TP.tp3.Models.*;

public class PaquetCartes {

    public static TPaquet[] controller() {

        TPaquet[] paquets = new TPaquet[54];
        int i = 0;
        for (EFigures figure : EFigures.values()) {
            for (EValeurs valeur : EValeurs.values()) {
                if (valeur != EValeurs.JOKER && figure != EFigures.JOKER) {
                    if (figure == EFigures.PIQUE || figure == EFigures.TREFLE)
                        paquets[i] = new TPaquet(new TCarte(valeur, figure, ECouleurs.NOIR));
                    else
                        paquets[i] = new TPaquet(new TCarte(valeur, figure, ECouleurs.ROUGE));
                    i++;
                }
            }
        }
        paquets[52] = new TPaquet(new TCarte(EValeurs.JOKER, EFigures.JOKER, ECouleurs.JOKER));
        paquets[53] = new TPaquet(new TCarte(EValeurs.JOKER, EFigures.JOKER, ECouleurs.JOKER));


        return paquets;
    }
}
