import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Vehicle.Car;
import Vehicle.Saab95;
import Vehicle.Volvo740;

public class carMoveTest {

	Volvo740 volvo = new Volvo740();
	Saab95 saab = new Saab95();

	@Test
	public void moveAndTurnTest() {
		assertEquals(0, volvo.getCurrentSpeed(),0);
		assertEquals(1.25, volvo.getCurrentSpeed(), 0);
		
		volvo.move();
		volvo.move();
		
		assertEquals(2.5, volvo.getXpos(), 0);
		
		volvo.turnLeft();
		volvo.move();
		
		assertEquals(2.5, volvo.getXpos(), 0);
		assertEquals(1.25, volvo.getXpos(), 0);
		
		volvo.move();
		volvo.brake(1);
		
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		
		
		for (int i = 0; i < 100; i++); {
			
			volvo.gas(1);
			
		}
		
		assertEquals(volvo.getEnginePower(), volvo.getCurrentSpeed(), 0);
		for (int i = 0; i < 100; i++) {
			volvo.brake(1);
		}
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		
		
	}
		
		@Test
		public void saabTest() {
			
			assertEquals(0, saab.getCurrentSpeed(), 0);
			
			saab.gas(1);
			saab.gas(1);
			
			assertEquals(1.25, volvo.getCurrentSpeed(), 0);
			
			saab.move();
			saab.move();
			
			assertEquals(1.25, volvo.getCurrentSpeed(), 0);
			
			
		}
		
		
		
		

	

}