package Car;

public class CarTransport {
	private Flatbed flatbed;
	private Carloader loader;

	
	public void loadCar(Car c) { // ska bara kunna ha en bil p� sig om backluckan �r �ppen.
		if(flatbed.isUp()) {
			loader.loadCar(c);
		}
	}

}
