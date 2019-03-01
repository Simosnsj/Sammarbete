package Car;

public class Carloader { //arraylist med cars för de bilar som kan ha bilar på sig, skapa en restriction för varje bil.

	private Car Loaded;
	public void loadCar(Car c) { //Gör så att bilen kan lasta på en till bil 
		Loaded = c;
	}
	public Car unloadCar() { //Gör så att bilen kan avlasta en bil 
		return Loaded;
	}
}
