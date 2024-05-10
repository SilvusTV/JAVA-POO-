package Courses.TP.tp3.Models;

public final class TTimbre {
    private final int Valeur;
    private final String Filet;
    private final String Dentelure;
    private final String Pays;
    private final String SignatureGraveur;
    private final String Designation;
    private final String SignatureDessinateur;
    private final TOeuvre Oeuvre;
    
    


    public TTimbre(int Valeur, String Filet, String Dentelure, String Pays, String SignatureGraveur, String Designation, String SignatureDessinateur, TOeuvre Oeuvre) {
        this.Valeur = Valeur;
        this.Filet = Filet;
        this.Dentelure = Dentelure;
        this.Pays = Pays;
        this.SignatureGraveur = SignatureGraveur;
        this.Designation = Designation;
        this.SignatureDessinateur = SignatureDessinateur;
        this.Oeuvre = Oeuvre;
    }
    public String getTimbreInfo(){
        return "Valeur: "+Valeur+" Filet: "+Filet+" Dentelure: "+Dentelure+" Pays: "+Pays+" SignatureGraveur: "+SignatureGraveur+" Designation: "+Designation+" SignatureDessinateur: "+SignatureDessinateur+" Oeuvre: "+Oeuvre.getTitre();
    }
    
}
