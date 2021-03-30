public class Attendee extends Person{
    String name;
    long age = 0;
    boolean paid = false;
    public Attendee(String name) {
        this.name = name;
    }

    public Attendee(String name, long age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public long getAge() {
        return age;
    }

    public boolean hasPaid(){
        return paid;
    }

    @Override
    public String toString() {
        if(paid)
            return "Attendee " + name + " has paid its registration." ;
        else return "Attendee " + name + " hasn't paid its registration." ;
    }

}
