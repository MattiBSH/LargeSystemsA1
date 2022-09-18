package dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class UserRatingsDto implements Serializable {
    private final Long id;
    private final String mediaName;
    private final String description;
    private final int stars;
    private final Date date;

    public UserRatingsDto(Long id, String mediaName, String description, int stars, Date date) {
        this.id = id;
        this.mediaName = mediaName;
        this.description = description;
        this.stars = stars;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getMediaName() {
        return mediaName;
    }

    public String getDescription() {
        return description;
    }

    public int getStars() {
        return stars;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRatingsDto entity = (UserRatingsDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.mediaName, entity.mediaName) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.stars, entity.stars) &&
                Objects.equals(this.date, entity.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mediaName, description, stars, date);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "mediaName = " + mediaName + ", " +
                "description = " + description + ", " +
                "stars = " + stars + ", " +
                "date = " + date + ")";
    }
}
