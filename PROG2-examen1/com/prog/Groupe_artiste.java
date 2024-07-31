package com.prog;

import java.util.List;

public class Groupe_artiste extends Artiste{
    private List<Solo_artiste> membres;

    public Groupe_artiste(String id, String nom, int date_sortie, String nationalite) {
        super(id, nom, date_sortie, nationalite);
        this.membres=membres ;
    }

    public List<Solo_artiste> getMembres() {
        return membres;
    }

    public void setMembres(List<Solo_artiste> membres) {
        this.membres = membres;
    }
}
