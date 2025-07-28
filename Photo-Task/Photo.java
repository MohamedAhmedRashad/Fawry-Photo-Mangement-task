import java.time.LocalDate;
import java.util.Set;

public class Photo {
    String id;
    String photoName;
    LocalDate photoDate;
    String location;
    Set<String> tags;


    public Photo(String id, String photoName, LocalDate photoDate, String location, Set<String> tags) {
        this.id = id;
        this.photoName = photoName;
        this.photoDate = photoDate;
        this.location = location;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public String getPhotoName() {
        return photoName;
    }

    public LocalDate getPhotoDate() {
        return photoDate;
    }

    public String getLocation() {
        return location;
    }

    public Set<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id='" + id + '\'' +
                ", photoName='" + photoName + '\'' +
                ", photoDate=" + photoDate +
                ", location='" + location + '\'' +
                ", tags=" + tags +
                '}';
    }
}


