package Car;

import javafx.scene.paint.Color;

public class Volvo740 extends Car {

	public final static double trimFactor = 1.25; /* Volvi bilen har trim vilket är unikt för denna model
		*Trim gör så att bilens fart ökar enligt FF
		*/

	public Volvo740() { //bilens atributer
		super(100,"Volovo 740", Color.RED); //enginepower, namn, färg
		stopEngine();//som grund inställning är motorn avstängd
	}

	public double speedFactor() { // räknar ut accelerationen
		return getEnginePower() * 0.01 * trimFactor;
	}


}
