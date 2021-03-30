import java.util.Objects;

public abstract class Person implements Comparable,User{

    abstract String getName();

    abstract long getAge();

    public String getUsername(){
        return getName()+getAge();
    }
    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof Person)) {
            return false;
        }

        Person c = (Person) o;

        return getName().equals(c.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public int compareTo(Object o) {
        Person c = (Person) o;
        return getName().compareTo(c.getName());
    }

}

