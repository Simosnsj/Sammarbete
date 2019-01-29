package Car;

import javafx.scene.paint.Color;

public abstract class Car implements Moveable {

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name

	int direction;	
	int x; //riktning
	int y;
	
	protected Car(double ep, String m, Color c) {
		enginePower = ep;
		modelName = m;
		color = c;
	}

	protected double getEnginePower() {
		return enginePower;
	}

	private double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	protected void stopEngine() {
		currentSpeed = 0;
	}

	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) {
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		decrementSpeed(amount);
	}

	public abstract double speedFactor();
	
	@Override
	public void move() {
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
	public void turnLeft() {
		// TODO Auto-generated method stub
		if(direction < 3) {
			direction--;
			}
		else direction=0;
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		if(direction > 0) {
			direction++;
			}
		else direction=0;
	}

}
