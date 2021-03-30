public class Speaker extends Person{

    String name;
    long age = 0, fee = 0;

    public Speaker(String name) {
        this.name = name;
    }

    public Speaker(String name, long age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public long getAge() {
        return age;
    }

    public long getFee(){
        return fee;
    }

    @Override
    public String toString() {
        return "Speaker " + name + " has a fee value of " +  fee + ".";
    }


}
