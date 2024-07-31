package com.prog;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class Album {
    public Collection<? extends Chanson> getEnsemble_de_chanson;
    private String id_album;
    private String nom_album;
    private LocalDate date_sortie_album;
    private List<Chanson> ensemble_de_chanson;

    public Album(String id_album, String nom_album, LocalDate date_sortie_album, List<Chanson> ensemble_de_chanson) {
        this.id_album = id_album;
        this.nom_album = nom_album;
        this.date_sortie_album = date_sortie_album;
        this.ensemble_de_chanson = ensemble_de_chanson;
    }

    public List<Chanson> getEnsemble_de_chanson() {
        return ensemble_de_chanson;
    }
}
