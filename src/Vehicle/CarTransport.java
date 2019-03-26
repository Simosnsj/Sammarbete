package Vehicle;

import javafx.scene.paint.Color;

public class CarTransport extends Car {	
	// hur man kollar vilken super klass ett fordon som ska loadas är: this.getclass().getsuperClass().getSimpleName();

	private Flatbed flatbed;
	private Carloader loader;
	private int maxCarLoad = 4;
	
	public int getMaxCarLoad() {
		return maxCarLoad;
	}
	public void setMaxCarLoad(int i) {
		maxCarLoad = i;
	}

	public CarTransport(double ep, String m, Color c) {
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
		if(flatbed.isUp() && (proxy(c) == true) && (loader.GetnumerLoaded() <= maxCarLoad) && c.getClass().getSuperclass().getSimpleName().equals("Car")) {
			loader.loadCar(c);

		}
	}
	public void unloadCar(Car c) { // Om flaket är uppet avlastar man bilen som senast lagrades.
		if(flatbed.isUp()) {
			Car Unload = loader.unloadLastCar();
			Unload.y = this.y + 45;
		}
	}
	public boolean proxy(Car c){
		int dx = this.x-c.x;
		int dy = this.y-c.y;
		if(Math.sqrt((Math.pow(dx, 2))+(Math.pow(dy, 2))) <= 50) {
			return true;
		}
		else return false;
	}


	@Override
	public double speedFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

}


