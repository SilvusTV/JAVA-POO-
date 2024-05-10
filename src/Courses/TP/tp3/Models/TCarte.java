package Courses.TP.tp3.Models;

public final class TCarte {
    private final EValeurs Valeur;
    private final EFigures Figure;
    private final ECouleurs Couleur;


    public TCarte(EValeurs Valeur, EFigures Figure, ECouleurs Couleur) {
        this.Valeur = Valeur;
        this.Figure = Figure;
        this.Couleur = Couleur;
    }

    public TCarte(TCarte carte) {
        this.Valeur = carte.Valeur;
        this.Figure = carte.Figure;
        this.Couleur = carte.Couleur;
    }

    public EValeurs getValeur() {
        return Valeur;
    }

    public EFigures getFigure() {
        return Figure;
    }

    public ECouleurs getCouleur() {
        return Couleur;
    }
}
