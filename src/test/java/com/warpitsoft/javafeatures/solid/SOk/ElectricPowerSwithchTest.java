package com.warpitsoft.javafeatures.solid.SOk;

import org.junit.jupiter.api.Test;

import com.warpitsoft.solid.SOk.ElectricPowerSwitch;
import com.warpitsoft.solid.SOk.Fan;
import com.warpitsoft.solid.SOk.LightBulb;
import com.warpitsoft.solid.SOk.Switch;
import com.warpitsoft.solid.SOk.Switchable;

class ElectricPowerSwithchTest {

	@Test
	public void testPress() throws Exception {
		Switchable switchableBulb = new LightBulb();
		Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();
		Switchable switchableFan = new Fan();
		Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
		fanPowerSwitch.press();
		fanPowerSwitch.press();
	}
}
