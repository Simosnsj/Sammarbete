package Vehicle;

import javafx.scene.paint.Color;

public class LotusElise extends Car {


		public LotusElise() { //bilens attributer bestämms
			super(125, "LotusElise", Color.BLACK); //enginepower, namn, färg
			stopEngine();//som grund inställning är motorn avstängd
		}
		public double speedFactor() {//Speedfactor räknar ut accelerationen. om turbo är på ökar hastigheten
			double FF = 1;
			return getEnginePower() * 0.01 * FF;
		}

	}

