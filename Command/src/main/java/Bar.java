import java.util.ArrayList;
import java.util.List;

public abstract class Bar {

    boolean happyHour = false;
    List<BarObserver> observers;

    public boolean isHappyHour() {
        return happyHour;
    };

    Bar(){
        this.happyHour = false;
        this.observers = new ArrayList<>();
    }

    public void startHappyHour(){
        this.happyHour = true;
        notifyObservers();
    }

    public void endHappyHour(){
        this.happyHour = false;
        notifyObservers();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
