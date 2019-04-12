package Vehicle;

import javafx.scene.paint.Color;

public abstract class Vehicle implements Moveable{
	
	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name

	int direction; //bilens riktning, se switch under move
	int x; //bilens positionering
	int y;
	public int getXpos() {
		return x;
	}
	public int getYpos(){
		return y;
	}
	
	public Vehicle(double ep, String m, Color c) { //bilens attributer
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
		if( amount <= getEnginePower() || amount >= 0){
			currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}
		else return;
	}

	private void decrementSpeed(double amount) { //minskar bilens fart
		if( amount <= getEnginePower() || amount >= 0){
			currentSpeed = getCurrentSpeed() - speedFactor() * amount;
			if(currentSpeed < 0) {currentSpeed = 0;}
	} 
		else return;
	}

	public void gas(double amount) { //Gas kallar p� incrementSpeed som �kar farten
		if( amount <= 1 || amount >= 0){
			incrementSpeed(amount);
	}
		else return;
	}

	public void brake(double amount) { //Brake kallar p� decrementSpeed som minskar farten
		if( amount < 1 || amount > 0){
			decrementSpeed(amount);
		}
			else return;
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
		else direction=3;
	}

}
