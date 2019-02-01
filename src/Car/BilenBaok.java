package Car;

import javafx.scene.paint.Color;

public class BilenBaok extends Car {


			public BilenBaok() { //bilens attributer bestämms
				super(75, "BilenBaok", Color.SADDLEBROWN); //enginepower, namn, färg
				stopEngine();//som grund inställning är motorn avstängd
			}
			public double speedFactor() {//Speedfactor räknar ut accelerationen. om turbo är på ökar hastigheten
				double FF = 100;
				return getEnginePower() * 0.01 * FF;
			}

		}
