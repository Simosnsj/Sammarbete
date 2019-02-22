package Car;

public class Carloader { //arraylist med cars för de bilar som kan ha bilar på sig, skapa en restriction för varje bil.

	private Car Loaded;
	public void loadCar(Car c) {
		Loaded = c;
	}
	public Car unloadCar() {
		return Loaded;
	}
}
