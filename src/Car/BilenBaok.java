package Car;

import javafx.scene.paint.Color;

public class BilenBaok extends Car {


			public BilenBaok() { //bilens attributer best�mms
				super(75, "BilenBaok", Color.SADDLEBROWN); //enginepower, namn, f�rg
				stopEngine();//som grund inst�llning �r motorn avst�ngd
			}
			public double speedFactor() {//Speedfactor r�knar ut accelerationen. om turbo �r p� �kar hastigheten
				double FF = 100;
				return getEnginePower() * 0.01 * FF;
			}

		}
<<<<<<< HEAD
	
	

=======
>>>>>>> fd2331096df52edadccc2b4951a2d2c47cc01ba0
