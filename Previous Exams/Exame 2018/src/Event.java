import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Event {
    Set<Person> people = new HashSet<>();
    private String nameEvent = "",date = "",description = "";

    public Event(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public Event(String nameEvent, String date) {
        this.nameEvent = nameEvent;
        this.date = date;
    }

    public Event(String nameEvent, String date, String description) {
        this.nameEvent = nameEvent;
        this.date = date;
        this.description = description;
    }

    public Event(Event e) {
        this.nameEvent = e.getTitle();
        this.date = e.getDate();
        this.description = e.getDescription();
    }

    public Event() {

    }

    public String getTitle() {
        return nameEvent;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    static String add (String name, Event a)
    {
        name = a.getTitle() + a.getDate() + a.getDescription();
        return name ;
    }

    @Override
    public String toString() {
        return nameEvent + " is a " +  description + " and will be held at " + date + ".";
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof Event)) {
            return false;
        }

        Event c = (Event) o;

        return nameEvent.equals(c.getTitle()) && date.equals(c.getDate()) && description.equals(c.getDescription());
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public int getAudienceCount() {
        return people.size();
    }
}
