import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PhotoManager {

     HashSet<Photo> loadedPhoto=new HashSet<>();

    public void uploadPhoto(Photo photo){
        loadedPhoto.add(photo);
        System.out.println(loadedPhoto);
    }

    public ArrayList<Photo> searchByTag(String tag){
        ArrayList<Photo> tagedPhotos=new ArrayList<>();

        for(Photo photo:loadedPhoto){
            if(photo.getTags().contains(tag))
                tagedPhotos.add(photo);
        }
        return tagedPhotos;
    }

    public ArrayList<Photo> searchByDate(LocalDate date){
        ArrayList<Photo> sameDatePhotos=new ArrayList<>();
        for(Photo photo:loadedPhoto){
            if(photo.getPhotoDate().compareTo(date)==0)
                sameDatePhotos.add(photo);
        }
        return sameDatePhotos;
    }


    public ArrayList<Photo> searchByLocation(String location){
        ArrayList<Photo> byLocationPhotos=new ArrayList<>();
        for(Photo photo:loadedPhoto){
            if(photo.getLocation().equals(location))
                byLocationPhotos.add(photo);
        }

        return byLocationPhotos;
    }

    public ArrayList<Photo> searchByMultipleTags(Set<String> tags){
        ArrayList<Photo> multipleTagsPhotos=new ArrayList<>();
        for(Photo photo:loadedPhoto){
            if(photo.getTags().containsAll(tags))
                multipleTagsPhotos.add(photo);
        }
        return multipleTagsPhotos;
    }



}
