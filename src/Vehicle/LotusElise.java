package Vehicle;

import javafx.scene.paint.Color;

public class LotusElise extends Car {


		public LotusElise() { //bilens attributer best�mms
			super(125, "LotusElise", Color.BLACK); //enginepower, namn, f�rg
			stopEngine();//som grund inst�llning �r motorn avst�ngd
		}
		public double speedFactor() {//Speedfactor r�knar ut accelerationen. om turbo �r p� �kar hastigheten
			double FF = 1;
			return getEnginePower() * 0.01 * FF;
		}

	}

