package Courses.TP.tp3.Models;

public final class TOeuvre {
    private final String Titre;
    private final ETheme Theme;

    public TOeuvre(String titre, ETheme theme) {
        this.Titre = titre;
        this.Theme = theme;
    }
    
    //get titre
    public String getTitre() {
        return Titre;
    }
}
