package Car;

import java.util.ArrayList;

public class Carloader { //arraylist med cars f�r de bilar som kan ha bilar p� sig, skapa en restriction f�r varje bil.

	ArrayList<Car> Loaded = new ArrayList<Car>();

	public void loadCar(Car c) {
		Loaded.add(c);
	}
	public Car unloadLastCar() {
		Car c = Loaded.get(Loaded.size()-1);
		Loaded.remove(Loaded.size()-1);
		return c;
}
	public Car unloadFirstCar() {
		Car c = Loaded.get(0);
				Loaded.remove(0);
		return c;
	}
}
