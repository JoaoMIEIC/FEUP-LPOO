import java.util.ArrayList;
import java.util.List;

public class Band extends Act{
    String band, country;

    List<Artist> artists = new ArrayList<>();

    public Band(String band, String country) {
        this.band = band;
        this.country = country;
    }

    public String getName(){
        return this.band;
    }

    public String getCountry(){
        return this.country;
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    /*public boolean containsArtist(Artist artist){
        for(Artist x : artists){
            if(x.equals(artist))
                return true;

        }
        return false;
    }*/

    public boolean containsArtist(Artist artist) {
        return artists.contains(artist);
    }
}
