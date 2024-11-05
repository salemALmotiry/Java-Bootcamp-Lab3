import java.util.ArrayList;

public class Music extends Media {

    private String artist;

    public Music(String title, String author, String ISBN, double price, String artist) {
        super(title, author, ISBN, price);
        this.artist = artist;
    }

    public Music(String artist) {
        this.artist = artist;
    }


    public void listen(User user){
        user.directPurchaseMedia(this);
        System.out.println(user.getName()+ " Listening for " +super.getTitle());
    }

    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog){

        ArrayList<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if(this.getArtist().equals(music.getArtist())){
                playlist.add(music);
            }
        }

        return playlist;
    }


    @Override
    public String toString() {
        return super.toString() +"\nArtist"+ artist;
    }


    @Override
    public String getMediaType() {
        if(this.getPrice()>10)
            return "premium music";
        else
            return "music";
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
