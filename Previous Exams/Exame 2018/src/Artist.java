public class Artist extends Person{

    String name;
    long age = 0;

    public Artist(String name) {
        this.name = name;
    }

    public Artist(String name, long age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public long getAge() {
        return age;
    }
}
