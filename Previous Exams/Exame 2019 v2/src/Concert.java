import java.util.ArrayList;
import java.util.List;

public class Concert {
    private String city, country,date;
    private int tnum;
    private List<Act> acts;

    public Concert(String city, String country, String date) {
        this.city = city;
        this.acts = new ArrayList<>();
        this.country = country;
        this.date = date;
        tnum = 1;
    }

    public int getTnum() {
        return tnum;
    }
    public void increment(){
        tnum++;
    }
    public void addAct(Act act) {
        acts.add(act);
    }

    public List<Act> getActs() {
        return acts;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public String getCountry() {
        return country;
    }

    public boolean participates(Artist artist) {
        for (Act act: acts ) {
            if (act.containsArtist(artist)) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof Concert)) {
            return false;
        }

        Concert c = (Concert) o;

        return city.equals(c.getCity()) && country.equals(c.getCountry()) && date.equals(c.getDate());
    }

    @Override
    public int hashCode() {
        return this.getCity().hashCode() + this.getCountry().hashCode() + this.getDate().hashCode();
    }

    public boolean isValid(Ticket ticket) {
        if (ticket.concert == this) return true;
        return false;
    }

}
