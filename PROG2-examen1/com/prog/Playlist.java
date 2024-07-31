package com.prog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Playlist {
    private String nom_playlist;
    private List<Chanson> ensemble_de_chanson = new ArrayList<Chanson>();
    private Set<String> likes = new HashSet<String>();

    public Playlist(String nom_playlist) {
        this.nom_playlist = nom_playlist;
    }

    public void addToPlaylist(Chanson chanson) {
        ensemble_de_chanson.add(chanson);
    }

    public void addToPlaylist(Album album) {
        ensemble_de_chanson.addAll(album.getEnsemble_de_chanson);
    }

    public void removeById(String id_chanson){
        ensemble_de_chanson.removeIf(Chanson->Chanson.getId_chanson().equals(id_chanson));
    }


}
