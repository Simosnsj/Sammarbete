package Car;

public class Flatbed {
	
	Double trunkDeg = 0.0;
	public boolean isUp() { //Kollar om det är någon vinkel på flaket
		if(trunkDeg == 0.0) {
			
			return false;
		}
		else return true;
	}
	public boolean maxOpen() { //När backluckan är 70 grader är den öppen 
		if (trunkDeg == 70.0) return true;
		else return false;
	}
	public boolean maxClosed() { //När backluckan är 0 grader är den stängd
		if (trunkDeg == 0.0) return true;
		else return false;
	}
	public void incrementDeg() { //ökar vinkeln på flaket
		if (trunkDeg <= 70.0 ){
			trunkDeg = 70.0;
			return;
			
		}
		else {
			trunkDeg++;
			return;
		}
	}
	public void decrementDeg(){ //minskar vinkeln på flaket
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
