package Car;
import javafx.scene.paint.Color;

public class Saab95 extends Car {

	public boolean turboOn;/* Saab bilen har turbo vilket är unikt för denna model
	 						*Turbo gör så att bilens fart ökar enligt FF
	 						*/
	public Saab95() { //bilens attributer bestämms
		super(125, "Saab95", Color.BLACK); //enginepower, namn, färg
		setTurboOff();// som grund inställning är turbo funktionen avstängd
		stopEngine();//som grund inställning är motorn avstängd
	}

	public void setTurboOn() {//sätter på turbo
		turboOn = true;
	}

	public void setTurboOff() {//stänger av turbo
		turboOn = false;
	}

	public double speedFactor() {//Speedfactor räknar ut accelerationen. om turbo är på ökar hastigheten
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}

}