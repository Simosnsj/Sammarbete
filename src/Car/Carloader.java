package Car;

public class Carloader { //arraylist med cars f�r de bilar som kan ha bilar p� sig, skapa en restriction f�r varje bil.

	private Car Loaded;
	public void loadCar(Car c) { //G�r s� att bilen kan lasta p� en till bil 
		Loaded = c;
	}
	public Car unloadCar() { //G�r s� att bilen kan avlasta en bil 
		return Loaded;
	}
}
