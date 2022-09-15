package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(	name = "media")
public class Media {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private int type;

    @OneToMany
    @JoinColumn(name = "UserRating_id")
    private List<UserRatings> userRatingsList;

    public Media(Long id, String name, int type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.userRatingsList = new ArrayList<>();
    }

    public Media() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<UserRatings> getUserRatingsList() {
        return userRatingsList;
    }

    public void setUserRatingsList(List<UserRatings> userRatingsList) {
        this.userRatingsList = userRatingsList;
    }
}
