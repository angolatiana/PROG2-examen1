package com.prog;

import java.util.List;

public  abstract class Chanson {
    private String id_chanson;
    private String titre;
    private int duree;
    private List<String> genre;

    public Chanson(String id_chanson, String titre, int duree, List<String> genre) {
        this.id_chanson = id_chanson;
        this.titre = titre;
        this.duree = duree;
        this.genre = genre;
    }

    public List<String> getGenre() {
        return genre;
    }

    public int getDuree() {
        return duree;
    }

    public String getTitre() {
        return titre;
    }

    public String getId_chanson() {
        return id_chanson;
    }
}
