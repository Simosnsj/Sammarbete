package Car;

import javafx.scene.paint.Color;

public class CarTransport extends Car {

	private Flatbed flatbed;
	private Carloader loader;
	
	protected CarTransport(double ep, String m, Color c) {
		super(75, "Biltransport", Color.HOTPINK);
		// TODO Auto-generated constructor stub
	}
	public void openFlatbed() {
		while(!flatbed.maxOpen()) { 
			flatbed.incrementDeg();
		}
	}
	public void closeFlatbed() {
		while(!flatbed.maxClosed()) { 
			flatbed.decrementDeg();
		}
	}
	public void gas(double amount) { //Gas kallar på incrementSpeed som ökar farten
		if(flatbed.trunkDeg == 0)
			super.gas(amount);
	}
	public void loadCar(Car c) { // ska bara kunna ha en bil på sig om backluckan är öppen.
		if(flatbed.isUp()) {
			loader.loadCar(c);
		}
	}
	public void unloadCar(Car c) { // Om flaket är uppet avlastar man bilen som senast lagrades.
		if(flatbed.isUp()) {
			loader.unloadLastCar();
		}
	}

	@Override
	public double speedFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

}


