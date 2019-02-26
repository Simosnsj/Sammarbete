package Car;

import javafx.scene.paint.Color;

public class Scania extends Car {
	
	private Flatbed trunk;
	
	
	public Scania() { //bilens attributer best�mms
		super(75, "Scania", Color.NAVY); //enginepower, namn, f�rg
		stopEngine();//som grund inst�llning �r motorn avst�ngd
		trunk = new Flatbed();
	}
	
	public double speedFactor() {//Speedfactor r�knar ut accelerationen. om turbo �r p� �kar hastigheten
		double FF = 1;
		return getEnginePower() * 0.01 * FF;
	}
	public void OpenTrunk() {
		trunk.incrementDeg();
	}
	public void CloseTrunk() {
		trunk.decrementDeg();
	}
}

