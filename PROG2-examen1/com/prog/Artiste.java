package com.prog;

public abstract class Artiste {
    private String id;
    private String nom;
    private int date_sortie;
    private String nationalite;

    public Artiste(String id, String nom, int date_sortie, String nationalite) {
        this.id = id;
        this.nom = nom;
        this.date_sortie = date_sortie;
        this.nationalite = nationalite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDate_sortie() {
        return date_sortie;
    }

    public void setDate_sortie(int date_sortie) {
        this.date_sortie = date_sortie;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
}
