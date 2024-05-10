package Courses.TP.tp3.Controllers;

import Courses.TP.tp3.Models.ETheme;
import Courses.TP.tp3.Models.TCollectionTimbre;
import Courses.TP.tp3.Models.TOeuvre;
import Courses.TP.tp3.Models.TTimbre;

public class Timbre {
    
    public static TCollectionTimbre[] CreerCollectionTimbres() {
        TTimbre timbre1 = new TTimbre(1, "1", "1", "1", "1", "1", "1",new TOeuvre("1", ETheme.ART));
        TTimbre timbre2 = new TTimbre(2, "2", "2", "2", "2", "2", "2", new TOeuvre("2", ETheme.HISTOIRE));
        TTimbre timbre3 = new TTimbre(3, "3", "3", "3", "3", "3", "3", new TOeuvre("3", ETheme.SCIENCE));
        TTimbre timbre4 = new TTimbre(4, "4", "4", "4", "4", "4", "4", new TOeuvre("4", ETheme.ART));
        TTimbre timbre5 = new TTimbre(5, "5", "5", "5", "5", "5", "5", new TOeuvre("5", ETheme.HISTOIRE));
        TTimbre timbre6 = new TTimbre(6, "6", "6", "6", "6", "6", "6", new TOeuvre("6", ETheme.SCIENCE));
        TTimbre timbre7 = new TTimbre(7, "7", "7", "7", "7", "7", "7", new TOeuvre("7", ETheme.ART));
        TTimbre timbre8 = new TTimbre(8, "8", "8", "8", "8", "8", "8", new TOeuvre("8", ETheme.HISTOIRE));
        TTimbre timbre9 = new TTimbre(9, "9", "9", "9", "9", "9", "9", new TOeuvre("9", ETheme.SCIENCE));
        TTimbre timbre10 = new TTimbre(10, "10", "10", "10", "10", "10", "10", new TOeuvre("10", ETheme.ART));
        TTimbre timbre11 = new TTimbre(11, "11", "11", "11", "11", "11", "11", new TOeuvre("11", ETheme.HISTOIRE));
        TTimbre timbre12 = new TTimbre(12, "12", "12", "12", "12", "12", "12", new TOeuvre("12", ETheme.SCIENCE));
        
        TCollectionTimbre[] collections = new TCollectionTimbre[3];
        collections[0] = new TCollectionTimbre(new TTimbre[]{timbre1, timbre2, timbre3, timbre10}, ETheme.ART);
        collections[1] = new TCollectionTimbre(new TTimbre[]{timbre4, timbre5, timbre6, timbre11}, ETheme.HISTOIRE);
        collections[2] = new TCollectionTimbre(new TTimbre[]{timbre7, timbre8, timbre9, timbre12}, ETheme.SCIENCE);
        
        return collections;
    }

}

