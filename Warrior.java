package com.lainlimbo;
//just like every single real world object has attributes(height, weight) and capabilities(eating, running)
//in OOPs we store attributes using fields and capabilities using methods

public class Warrior {	
	
	//STEP 1: this thing is protected
	//hence only accessible to this class and its subclasses
	//name of this thing is...
	protected String name = "Warrior";
	
	//STEP 2: so we are going to write attributes of these warriors
	public int health = 0;
	public int attkMax = 0;
	public int blockMax = 0;
	
	//STEP 3: now we are going to set up our warriors
	//constructor is used for this work
	//has the same name as the class
	//whenever a new warrior object is called this constructor would be actually be called
	public Warrior() {
		
	}
		
	public Warrior(//STEP 4: all the  things warrior needs to receive
			String name, int health, int attkMax, int blockMax) {
				
		//STEP 5: if we want to refer to these attributes to a warrior
		//but we don't have a warrior object created
		//(this.) is used to reference an object we do not have a name for
		//by using setters and getters
		this.setName(name);
		//but remember we don't have direct access to NAME
		
		//STEP 7: set all other attributes
		this.health = health;
		this.attkMax = attkMax;
		this.blockMax = blockMax;
	}
	
	//model the capabilities of the warrior;
	public int attack() {
		return 1 + (int)(Math.random() * ((attkMax - 1) + 1));
	}
	
	public int block() {
		return 1 + (int)(Math.random() * ((blockMax - 1) + 1));
	}
	
	//STEP 6: so we are going to use methods that are going to allow us to provide access
	//Step 6.1: get access to the main declaration "name"
	public String getName() {
		return name;
	}
			
	//Step 6.2: connect/set that main declaration as name 
	//and now anyone can access name through a new variable built - "name"
	public void setName(String name) {
		this.name = name;
	}
