package nl.han.oose.dea.rest.services.dto;

public class TrackDTO {

    private Integer id;
    private String title;
    private String performer;
    private Integer duration;
    private String album;
    private Integer playcount;
    private String publicationDate;
    private String description;
    private Boolean offlineAvailable;

    public TrackDTO() {
    }

    public TrackDTO(Integer id, String title, String performer, Integer duration, String album, Integer playcount, String publicationDate, String description, Boolean offlineAvailable) {
        this.id = id;
        this.title = title;
        this.performer = performer;
        this.duration = duration;
        this.album = album;
        this.playcount = playcount;
        this.publicationDate = publicationDate;
        this.description = description;
        this.offlineAvailable = offlineAvailable;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPerformer() {
        return performer;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getAlbum() {
        return album;
    }

    public Integer getPlaycount() {
        return playcount;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getOfflineAvailable() {
        return offlineAvailable;
    }
}
