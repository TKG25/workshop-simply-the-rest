package nl.han.oose.dea.rest.services.dto;

import java.util.ArrayList;

public class PlaylistsDTO {

    private Integer length;
    ArrayList<PlaylistDTO> playlists = new ArrayList<>();


    public PlaylistsDTO(Integer length, ArrayList<PlaylistDTO> playlists) {
        this.length = length;
        this.playlists = playlists;
    }

    public Integer getLength() {
        return length;
    }

    public ArrayList<PlaylistDTO> getPlaylists() {
        return playlists;
    }
}
