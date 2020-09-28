import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		
// since we start on column one we have to move into the voting area
		
		move();
		checkForBeepersPresent();
		
	}
	
//******************* MY METHODS START ***************************	
	

	
// checking to see if there are beepers present in the middle spot & if there is a beeper present we move 2 spaces forward to the next voting column	
	
	private void checkForBeepersPresent() {
		
		while(frontIsClear()) {

			if(beepersPresent()) {
				move();
				move();
			
			}	
		
// NO BEEPER IN MIDDLE - look for beepers in that row 
		
			if(noBeepersPresent()) {
				turnLeft();
				move();
			}

// BEEPER FOUND -  pick all the beepers

			while (beepersPresent()) {
				pickBeeper();
			}
				
// NO BEEPER PRESENT - turn around to check the bottom spot & reset to the middle spot. 
					
			if (noBeepersPresent()) {
					turnAround();
					move();
					move();
					turnLeft();
					turnLeft();
						while (beepersPresent()) {
								pickBeeper();
						}
					move();
					turnRight();
					move();
					move();
					
			} 
			
		} // CLOSE METHOD FOR - while(frontIsClear() loop
	}  // CLOSE METHOD FOR - checkForBeepersPresent()
	
//************************* FINAL BRACE **********************************
		
}
	
	
	
		
	
		

