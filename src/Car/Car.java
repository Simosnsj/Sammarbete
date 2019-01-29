package Car;

import javafx.scene.paint.Color;

public abstract class Car implements Moveable {

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name

	int direction;	
	int x;
	int y;

	protected Car(double ep, String m, Color c) {
		enginePower = ep;
		modelName = m;
		color = c;
	}

	protected double getEnginePower() { //H�mtar bilens kraft
		return enginePower;
	}

	private double getCurrentSpeed() { //H�mtar bilens hastighet
		return currentSpeed;
	}

	public Color getColor() { //H�mtar bilens f�rg 
		return color;
	}

	public void startEngine() { //H�mtar n�r bilen ska startas 
		currentSpeed = 0.1;
	}

	protected void stopEngine() { //H�mtar n�r bilen ska stoppas
		currentSpeed = 0;
	}

	private void incrementSpeed(double amount) { //H�mtar att bilens fart ska �ka 
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) { //H�mtar att bilens fart ska minska 
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) { //Gas kallar p� incrementSpeed som �kar farten
		incrementSpeed(amount);
	}

	public void brake(double amount) { //Brake kallar p� decrementSpeed som minskar farten
		decrementSpeed(amount);
	}

	public abstract double speedFactor(); //Den h�r metoden kallar p� speedfaktor i enskild modells 
	
	@Override
	public void move() { //H�mtar vilket h�ll bilen ska k�ra 
		// TODO Auto-generated method stub

		switch(direction) {

		case 0:
			y+= currentSpeed;
			break;
		case 1:
			x+=currentSpeed;
			break;
		case 2:
			y-=currentSpeed;
			break;
		case 3:
			x-=currentSpeed;
			break;
		}

	}

	@Override
	public void turnLeft() { //H�mtar att bilen ska k�ra �t v�nster 
		// TODO Auto-generated method stub
		if(direction < 3) {
			direction--;
		}
		else direction=0;
	}

	@Override
	public void turnRight() { //H�mtar att bilem ska k�ra �t h�ger
		// TODO Auto-generated method stub
		if(direction > 0) {
			direction++;
		}
		else direction=0;
	}

}
