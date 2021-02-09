package com.lainlimbo;
//utility class: a class that defines a set of methods that perform common functions.
public class Battle {
	/*
	 * static methods are used when:
	 * 1.whenever a real world object doesn't have to perform anything
	 * 2.when values are shared by multiple objects
	 * 3.when we have a utility class which is going to simulate a battle between multiple warriors
	 */
	
	//a method (situation) to start a fight
	public static void startFight(Warrior w1, Warrior w2) throws InterruptedException {
		//loop to give chance to each warrior to attack and defend
		while(true) {
			if(getAttackResult(w1, w2).equals("Game Over")) {
				//w1=wA and w2=wB
				System.out.println("Game Over");
				break;
			}
			if(getAttackResult(w2, w1).equals("Game Over")) {
				//w2=wA and w1=wB
				System.out.println("Game Over");
				break;
			}
		}
	}
	
	//a method that will provide the attack results
	public static String getAttackResult(Warrior wA, Warrior wB) throws InterruptedException {
		//wA: whoever is attacking
		//wB: whoever is blocking
		
		//bring the attack and blocking methods to these warrior (basically how to block and attack)
		int wAAttkAmt = wA.attack();
		int wBBlockAmt = wB.block();
		
		//find the overall damage (attack - block)
		int dmg2WarB = wAAttkAmt - wBBlockAmt;
		//if damage is there (i.e damage > 0) then we need to reduce health
		if(dmg2WarB > 0) {
			wB.health = wB.health - dmg2WarB;
		} else dmg2WarB = 0;
		
		/*
		 * printf is used for formatted output:
		 * %s strings
		 * %d integers
		 * %f floats/doubles
		 * %.2f to limit to 2 decimal places
		 * %c char
		 * %e scientific notations
		 * %t dates
		 * %b boolean
		 */
		
		//print some info about what happened in the attack
		//remember all these values are in string
		System.out.printf("%s Attack %s and Deals " + "%d Damage\n", wA.getName(), wB.getName(), dmg2WarB);
		System.out.printf("%s has %d Health\n", wB.getName(), wB.health);
		
		//to delay the output we'll use sleep period
		Thread.sleep(1500);		
		
		//when to end the battle
		if(wB.health <= 0) {
			System.out.printf("%s had died and %s is " + "Victorious\n", wB.getName(), wA.getName());
			return "Game Over";			
		} else return "Fight Again";
		
		
	}

}
