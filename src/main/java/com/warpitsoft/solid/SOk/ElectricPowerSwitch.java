package com.warpitsoft.solid.SOk;


/**
 * we will need an abstraction that both the ElectricPowerSwitch and LightBulb classes will depend on
 * In the ElectricPowerSwitch class we implemented the Switch interface and referred the Switchable interface 
 * instead of any concrete class in a field
 * Now, we can add low-level switchable classes without worrying about modifying 
 * the ElectricPowerSwitch class
 * @author stefa
 *
 */
public class ElectricPowerSwitch implements Switch{
	
    public Switchable client;
	public boolean on;
	
	 public ElectricPowerSwitch(Switchable client) {
	        this.client = client;
	        this.on = false;
	    }

	@Override
	public boolean isOn() {
		 return this.on;
	}

	 public void press(){
	       boolean checkOn = isOn();
	       if (checkOn) {
	           client.turnOff();
	           this.on = false;
	       } else {
	             client.turnOn();
	             this.on = true;
	       }
	   }
}
