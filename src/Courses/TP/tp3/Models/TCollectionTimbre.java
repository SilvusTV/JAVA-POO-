package Courses.TP.tp3.Models;

public final class TCollectionTimbre {
    private final TTimbre[] Timbres;
    private final ETheme Theme;

    public TCollectionTimbre(TTimbre[] timbres, ETheme theme) {
        this.Timbres = timbres;
        this.Theme = theme;
    }
    public ETheme getTheme() {
        return Theme;
    }
    public TTimbre[] getTimbres() {
        return Timbres;
    }
}
