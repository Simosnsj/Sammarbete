package Car;

public class Flatbed {
	
	Double trunkDeg = 0.0;
	public boolean isUp() { //Kollar om det �r n�gon vinkel p� flaket
		if(trunkDeg == 0.0) {
			
			return false;
		}
		else return true;
	}
	public boolean maxOpen() { //N�r backluckan �r 70 grader �r den �ppen 
		if (trunkDeg == 70.0) return true;
		else return false;
	}
	public boolean maxClosed() { //N�r backluckan �r 0 grader �r den st�ngd
		if (trunkDeg == 0.0) return true;
		else return false;
	}
	public void incrementDeg() { //�kar vinkeln p� flaket
		if (trunkDeg <= 70.0 ){
			trunkDeg = 70.0;
			return;
			
		}
		else {
			trunkDeg++;
			return;
		}
	}
	public void decrementDeg(){ //minskar vinkeln p� flaket
		if (trunkDeg <= 0.0 ){
			trunkDeg = 0.0;
			return;
			
		}
		else {
			trunkDeg--;
			return;
		}
	}
	
}
