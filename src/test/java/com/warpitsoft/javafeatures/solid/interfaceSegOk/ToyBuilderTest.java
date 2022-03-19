package com.warpitsoft.javafeatures.solid.interfaceSegOk;

import org.junit.jupiter.api.Test;

import com.warpitsoft.solid.interfaceSegOk.ToyBuilder;
import com.warpitsoft.solid.interfaceSegOk.ToyCar;
import com.warpitsoft.solid.interfaceSegOk.ToyHouse;
import com.warpitsoft.solid.interfaceSegOk.ToyPlane;

class ToyBuilderTest {

	  @Test
	    public void testBuildToyHouse() throws Exception {
	    ToyHouse toyHouse=ToyBuilder.buildToyHouse();
	    System.out.println(toyHouse);
	    }
	    @Test
	    public void testBuildToyCar() throws Exception {
	    ToyCar toyCar=ToyBuilder.buildToyCar();;
	        System.out.println(toyCar);
	    }
	    @Test
	    public void testBuildToyPlane() throws Exception {
	    ToyPlane toyPlane=ToyBuilder.buildToyPlane();
	        System.out.println(toyPlane);
	    }

}
