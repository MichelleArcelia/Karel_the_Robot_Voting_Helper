// Karel_the_Robot_Voting_Helper - Stanford Assignment #1

import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		
// Karel starts on column 1 - moves him into the voting area
		
		move();
		checkForBeepersPresent();
	}
	
//******************* MY METHODS START ***************************	

// BEEPERS PRESENT IN MIDDLE - move to next voting column	
	
	private void checkForBeepersPresent() {
		
		while(frontIsClear()) {

			if(beepersPresent()) {
				move();
				move();
			}	
		
// NO BEEPER IN MIDDLE - look for beepers in the top box of that row 
		
			if(noBeepersPresent()) {
				turnLeft();
				move();
			}

// BEEPER FOUND IN TOP BOX -  pick all the beepers

			while (beepersPresent()) {
				pickBeeper();
			}
				
// NO BEEPER PRESENT IN THE TOP BOX - turn around to check the bottom box & reset to the middle spot. 
					
			if (noBeepersPresent()) {
					turnAround();
					move();
					move();
					if(frontIsBlocked()) {
						turnAround();
					}
						while (beepersPresent()) {
								pickBeeper();
						}
					move();
					turnRight();
					move();
						if(frontIsBlocked()) {
							return;
						}
					move();
			} 
			
		} // CLOSE METHOD FOR - while(frontIsClear() loop
	
	}  // CLOSE METHOD FOR - checkForBeepersPresent()
	
//************************* FINAL BRACE **********************************
		
}