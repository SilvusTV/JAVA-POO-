package Courses.TP.tp3.Models;

public final class TPaquet {
    private final TCarte carte;

    public TPaquet(TCarte carte) {
        this.carte = carte;
    }

    public TCarte getCarte() {
        return carte;
    }
}