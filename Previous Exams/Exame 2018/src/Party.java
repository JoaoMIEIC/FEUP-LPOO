import java.util.ArrayList;
import java.util.List;

public class Party extends Event{

    List<Person> people = new ArrayList<>();
    List<Event> events = new ArrayList<>();

    public Party(String feup_caffe, String s, String s1) {
    }


    public void addPerson(Person person){
        people.add(person);
    }

    public int getAudienceCount() {
        Integer finalCount = 0;
        for(Event x : events){
            finalCount += x.getAudienceCount();
        }
        return people.size() + finalCount;
    }

    public void addEvent(Event e) {
        events.add(e);
    }
}
