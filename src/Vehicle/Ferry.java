package Vehicle;

import javafx.scene.paint.Color;

public class Ferry extends Ship{

	public Ferry(double ep, String m, Color c) {
		super(ep, m, c);
		// TODO Auto-generated constructor stub
	}

	private Flatbed flatbed;
	private Carloader loader;
	private int maxCarLoad = 10;
	
	public int getMaxCarLoad() {
		return maxCarLoad;
	}
	public void setMaxCarLoad(int i) {
		maxCarLoad = i;
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
		if(flatbed.isUp() && (proxy(c) == true) && (loader.GetnumerLoaded() <= maxCarLoad)) {
			loader.loadCar(c);

		}
	}
	public void unloadCar(Car c) { // Om flaket är uppet avlastar man bilen som senast lagrades.
		if(flatbed.isUp()) {
			Car Unload = loader.unloadFirstCar();
			Unload.y = this.y + 45;
		}
	}
	public boolean proxy(Car c){
		int dx = this.x-c.x;
		int dy = this.y-c.y;
		if(Math.sqrt((Math.pow(dx, 2))+(Math.pow(dy, 2))) <= 50) { //pytagaros sats för att kolla bilar i en cirkel runt om.
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
