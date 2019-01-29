package Car;

import javafx.scene.paint.Color;

public class Volvo740 extends Car {

	public final static double trimFactor = 1.25; /* Volvi bilen har trim vilket �r unikt f�r denna model
		*Trim g�r s� att bilens fart �kar enligt FF
		*/

	public Volvo740() { //bilens atributer
		super(100,"Volovo 740", Color.RED); //enginepower, namn, f�rg
		stopEngine();//som grund inst�llning �r motorn avst�ngd
	}

	public double speedFactor() { // r�knar ut accelerationen
		return getEnginePower() * 0.01 * trimFactor;
	}


}
