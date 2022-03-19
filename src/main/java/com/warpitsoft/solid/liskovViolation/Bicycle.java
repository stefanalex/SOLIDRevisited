package com.warpitsoft.solid.liskovViolation;


// a bicycle is a transportation device, however, it does not have an engine and hence, 
//the method startEngine() cannot be implemented.
//These are the kinds of problems that violation of Liskov Substitution Principle leads to, 
//and they can most usually be recognized by a method that does nothing, or even can’t be implemented.
//The solution to these problems is a correct inheritance hierarchy, and in our case we would solve the problem by differentiating classes of transportation devices with and without engines.
public class Bicycle extends TransportationDevice {

	
		   @Override
		   void startEngine() /*problem!*/ {
			   
		   }
	
	
}
