package models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(	name = "userRatings")
public class UserRatings {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String mediaName;
    private String description;
    private int stars;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "media_id")
    private Media media;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public UserRatings(Long id, String mediaName, String description, int stars,User user) {
        this.id = id;
        this.mediaName = mediaName;
        this.description = description;
        this.stars = stars;
        this.date = new Date();
        this.user=user;
    }

    public UserRatings() {

    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
