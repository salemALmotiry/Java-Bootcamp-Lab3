import java.util.ArrayList;

public class Store {

    private ArrayList<User> user= new ArrayList<>();
    private ArrayList<Media> media= new ArrayList<>();


    public Store() {

    }

    public void addUser(User user) {
        this.user.add(user);
    }


    public void addMedia(Media media) {
        this.media.add(media);
    }


    public void displayUser() {
        System.out.println("__________________________________");
        System.out.println(" Welcome to our All In One Store ");
        System.out.println("In this moment this all users we hava");
        System.out.println("__________________________________");
        for (User user : user) {
            System.out.println(user.toString());
        }
    }

    public void displayMedia() {
        System.out.println("__________________________________");
        System.out.println(" Welcome to our All In One Store ");
        System.out.println("In this moment this is available items");
        System.out.println("__________________________________");

        for (Media media : media) {
            System.out.println(media.toString());
            System.out.println("-----------------------");

        }
    }


    public Media searchMedia(String title) {
        for (Media media : media) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }



    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }
}
