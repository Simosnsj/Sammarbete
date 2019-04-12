package Vehicle;
import java.util.ArrayList;

public class Observable {
ArrayList <Observer> observers = new ArrayList<Observer>();
public void addObserver(Observer o) {
	observers.add(o);
}
public void removeObserver(Observer o) {
	observers.remove(o);
}
public void notifyObservers(){
	for (Observer o : observers) {
		Observer.u
	}
}
}
