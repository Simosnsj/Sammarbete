package Car;

import javafx.scene.paint.Color;

public class Volvo740 extends Car {

	public final static double trimFactor = 1.25;

	public Volvo740() {
		super(100,"Volovo 740", Color.RED);
		stopEngine();
	}

	public double speedFactor() {
		return getEnginePower() * 0.01 * trimFactor;
	}

}
