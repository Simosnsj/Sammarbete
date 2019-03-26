package Vehicle;

import javafx.scene.paint.Color;

public class Scania extends Car {
	
	private Flatbed trunk;
	
	
	public Scania() { //bilens attributer bestämms
		super(75, "Scania", Color.NAVY); //enginepower, namn, färg
		stopEngine();//som grund inställning är motorn avstängd
		trunk = new Flatbed();
	}
	
	public void gas(double amount) { //Gas kallar på incrementSpeed som ökar farten
		if(trunk.trunkDeg == 0)
			super.gas(amount);
	}
	public double speedFactor() {//Speedfactor räknar ut accelerationen. om turbo är på ökar hastigheten
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

