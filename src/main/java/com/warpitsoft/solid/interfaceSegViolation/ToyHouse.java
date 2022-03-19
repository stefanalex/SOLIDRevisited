package com.warpitsoft.solid.interfaceSegViolation;


/**
 * ToyHouse needs to provide implementation of the move() and fly() methods, even though it does not require them. 
 * This is a violation of the Interface Segregation Principle. 
 * Such violations affect code readability and confuse programmers. 
 * Imagine that you are writing the ToyHouse class and the IntelliSense feature of your IDE pops up the fly() method for autocomplete.
 * Not exactly the behavior you want for a toy house, is it?
 * @author stefa
 *
 */
public class ToyHouse implements Toy{

	double price;
    String color;
	
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
