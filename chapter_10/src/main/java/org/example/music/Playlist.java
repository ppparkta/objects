package org.example.music;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> tracks = new ArrayList<>();

    public void append(Song song) {
        tracks.add(song);
    }

    public List<Song> getTracks() {
        return tracks;
    }
}
