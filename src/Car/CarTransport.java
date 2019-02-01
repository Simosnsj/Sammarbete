package Car;

public class CarTransport {
	private Flatbed flatbed;
	private Carloader loader;

	
	public void loadCar(Car c) { // ska bara kunna ha en bil på sig om backluckan är öppen.
		if(flatbed.isUp()) {
			loader.loadCar(c);
		}
	}

}
