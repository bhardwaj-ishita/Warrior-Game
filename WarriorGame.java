package com.lainlimbo;

public class WarriorGame {

	public static void main(String[] args) throws InterruptedException {
		//give the warrior their ability specs
		Warrior thor = new Warrior("Thor", 800, 130, 40);
		Warrior loki = new Warrior("Loki", 800, 85, 40);
		
		//Start the battle
		Battle.startFight(thor, loki);

	}

}
