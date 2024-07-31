package com.prog;

import java.time.LocalDate;

public class Solo_artiste extends Artiste{
    private String nom_artiste;
    private String prenom_artiste;
    private LocalDate date_naissance;

    public Solo_artiste(String id, String nom, int date_sortie, String nationalite) {
        super(id, nom, date_sortie, nationalite);
            this.nom_artiste = nom;
            this.prenom_artiste = nationalite;
            this.date_naissance = LocalDate.now();
    }

    public String getNom_artiste() {
        return nom_artiste;
    }

    public void setNom_artiste(String nom_artiste) {
        this.nom_artiste = nom_artiste;
    }

    public String getPrenom_artiste() {
        return prenom_artiste;
    }

    public void setPrenom_artiste(String prenom_artiste) {
        this.prenom_artiste = prenom_artiste;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }
}
