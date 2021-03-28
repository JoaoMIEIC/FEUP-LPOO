public class Artist extends Act{
    String singer,country;

    public Artist(String singer, String country) {
        this.singer = singer;
        this.country = country;
    }

    public String getName(){
        return this.singer;
    }

    public String getCountry(){
        return this.country;
    }

    public boolean containsArtist(Artist artist) {
        return this.equals(artist);
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof Artist)) {
            return false;
        }

        Artist c = (Artist) o;

        return singer.equals(c.getName()) && country.equals(c.getCountry());
    }


}
