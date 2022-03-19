package nl.han.oose.dea.rest.services.dto;

import java.util.ArrayList;

public class PlaylistDTO {

    private int id;
    private String name;
    private Boolean owner;
    private ArrayList<TrackDTO> tracks = new ArrayList<>();


    public PlaylistDTO() {
    }

    public PlaylistDTO(int id, String name, Boolean owner, ArrayList<TrackDTO> tracks) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.tracks = tracks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getOwner() {
        return owner;
    }

    public ArrayList<TrackDTO> getTracks() {
        return tracks;
    }
}
