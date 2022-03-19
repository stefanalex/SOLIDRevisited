package com.warpitsoft.javafeatures.solid.opencloseOk;

import org.junit.jupiter.api.Test;

import com.warpitsoft.solid.opencloseOk.ClaimApprovalManager;
import com.warpitsoft.solid.opencloseOk.HealthInsuranceSurveyor;
import com.warpitsoft.solid.opencloseOk.VehicleInsuranceSurveyor;

class ClaimApprovalManagerTest {

	  @Test
	    public void testProcessClaim() throws Exception {
	      HealthInsuranceSurveyor healthInsuranceSurveyor=new HealthInsuranceSurveyor();
	      ClaimApprovalManager claim1=new ClaimApprovalManager();
	      claim1.processClaim(healthInsuranceSurveyor);
	        VehicleInsuranceSurveyor vehicleInsuranceSurveyor=new VehicleInsuranceSurveyor();
	        ClaimApprovalManager claim2=new ClaimApprovalManager();
	        claim2.processClaim(vehicleInsuranceSurveyor);
	    }

}
