package Car;

public class Carloader { //arraylist med cars f�r de bilar som kan ha bilar p� sig, skapa en restriction f�r varje bil.

	private Car Loaded;
	public void loadCar(Car c) {
		Loaded = c;
	}
	public Car unloadCar() {
		return Loaded;
	}
}
