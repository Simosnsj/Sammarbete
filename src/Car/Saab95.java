package Car;
import javafx.scene.paint.Color;

public class Saab95 extends Car {

	public boolean turboOn;/* Saab bilen har turbo vilket �r unikt f�r denna model
	 						*Turbo g�r s� att bilens fart �kar enligt FF
	 						*/
	public Saab95() { //bilens attributer best�mms
		super(125, "Saab95", Color.BLACK); //enginepower, namn, f�rg
		setTurboOff();// som grund inst�llning �r turbo funktionen avst�ngd
		stopEngine();//som grund inst�llning �r motorn avst�ngd
	}

	public void setTurboOn() {//s�tter p� turbo
		turboOn = true;
	}

	public void setTurboOff() {//st�nger av turbo
		turboOn = false;
	}

	public double speedFactor() {//Speedfactor r�knar ut accelerationen. om turbo �r p� �kar hastigheten
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}

}