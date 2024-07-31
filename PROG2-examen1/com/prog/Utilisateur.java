package com.prog;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Utilisateur {
    private String id;
    private String nom_user;
    private Set<String> playlist_Favortite = new TreeSet<String>();
    private List<Playlist> playlists = new LinkedList<Playlist>();

    public Utilisateur(String id, String nom_user, Set<String> playlist_Favortite, List<Playlist> playlists) {
        this.id = id;
        this.nom_user = nom_user;
        this.playlist_Favortite = playlist_Favortite;
        this.playlists = playlists;
    }
}
