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

	protected double getEnginePower() { //Hämtar bilens kraft
		return enginePower;
	}

	private double getCurrentSpeed() { //Hämtar bilens hastighet
		return currentSpeed;
	}

	public Color getColor() { //Hämtar bilens färg 
		return color;
	}

	public void startEngine() { //Startar bilen
		currentSpeed = 0.1;
	}

	protected void stopEngine() { //stänger av bilen
		currentSpeed = 0;
	}

	private void incrementSpeed(double amount) { //ökar bilens fart
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) { //minskar bilens fart
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) { //Gas kallar på incrementSpeed som ökar farten
		incrementSpeed(amount);
	}

	public void brake(double amount) { //Brake kallar på decrementSpeed som minskar farten
		decrementSpeed(amount);
	}

	public abstract double speedFactor(); //kallar på speedfaktor i enskild modell
	
	@Override
	public void move() { //bestämmer rikning som bilen kör i. 
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
	public void turnLeft() { //svänger år vänster 
		// TODO Auto-generated method stub
		if(direction < 3) {
			direction--;
		}
		else direction=0;
	}

	@Override
	public void turnRight() { //svänger år svänster
		// TODO Auto-generated method stub
		if(direction > 0) {
			direction++;
		}
		else direction=0;
	}

}
