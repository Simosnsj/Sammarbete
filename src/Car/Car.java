package Car;

import javafx.scene.paint.Color;

public abstract class Car implements Moveable {

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name

	int direction; //bilens riktning, se switch under move
	int x; //bilens positionering
	int y;

	protected Car(double ep, String m, Color c) { //bilens attributer
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

	public void startEngine() { //Startar bilen
		currentSpeed = 0.1;
	}

	protected void stopEngine() { //st�nger av bilen
		currentSpeed = 0;
	}

	private void incrementSpeed(double amount) { //�kar bilens fart
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) { //minskar bilens fart
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) { //Gas kallar p� incrementSpeed som �kar farten
		incrementSpeed(amount);
	}

	public void brake(double amount) { //Brake kallar p� decrementSpeed som minskar farten
		decrementSpeed(amount);
	}

	public abstract double speedFactor(); //kallar p� speedfaktor i enskild modell
	
	@Override
	public void move() { //best�mmer rikning som bilen k�r i. 
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
	public void turnLeft() { //sv�nger �r v�nster 
		// TODO Auto-generated method stub
		if(direction < 3) {
			direction--;
		}
		else direction=0;
	}

	@Override
	public void turnRight() { //sv�nger �r sv�nster
		// TODO Auto-generated method stub
		if(direction > 0) {
			direction++;
		}
		else direction=0;
	}

}
