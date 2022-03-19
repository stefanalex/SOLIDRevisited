package com.warpitsoft.solid.SViolation;

/**
 * Our high-level ElectricPowerSwitch class is directly dependent on the low-level LightBulb class. 
 * if you see in the code, the LightBulb class is hardcoded in ElectricPowerSwitch. 
 * But, a switch should not be tied to a bulb.
 * @author stefa
 *
 */
public class ElectricPowerSwitch{
	public LightBulb lightBulb;
	public boolean on;
	
	
	public ElectricPowerSwitch(LightBulb lightBulb, boolean on) {
		super();
		this.lightBulb = lightBulb;
		this.on = on;
	}
	
	public boolean isOn() {
		return this.on;
	}
	
	public void press() {
		boolean checkOn = isOn();
		if(checkOn) {
			lightBulb.turnOff();
			this.on=false;
		}else {
			lightBulb.turnOn();
			this.on=true;
		}
	}
	
}