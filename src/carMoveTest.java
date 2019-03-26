import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Car.Car;
import Car.Volvo740;

public class carMoveTest {

	Car volvo = new Volvo740();

	@Test
	public void moveAndTurnTest() {
		volvo.move();

		assertEquals(0, volvo.getXPos(), 0);
		assertEquals(0, volvo.getYPos(), 0);

		volvo.gas(1);
		volvo.move();

		assertEquals(1.25, volvo.getXPos(), 0);
		assertEquals(0, volvo.getYPos(), 0);
		
		volvo.turnLeft();
		
		volvo.move();
		assertEquals(1.25, volvo.getXPos(), 0);
		assertEquals(1.25, volvo.getYPos(), 0);
		

	}

}