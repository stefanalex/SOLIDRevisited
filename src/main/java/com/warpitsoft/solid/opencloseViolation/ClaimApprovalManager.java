package com.warpitsoft.solid.opencloseViolation;

import com.warpitsoft.solid.opencloseOk.InsuranceSurveyor;



//responsible to approve claims.
public class ClaimApprovalManager {

	
	  public void processHealthClaim (HealthInsuranceSurveyor surveyor)
	    {
	        if(surveyor.isValidClaim()){
	            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
	        }
	    }
	
	  /*
	   *  We need to modify the class to add support for a new functionality.
	   *  In fact, we violated the Open Closed Principle at the very first instance we wrote the ClaimApprovalManager class. 
	   */
	  
	  public void processVehicleClaim (VehicleInsuranceSurveyor surveyor)
	    {
	        if(surveyor.isValidClaim()){
	            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
	        }
	    }
}