package com.warpitsoft.solid.opencloseOk;


//responsible to approve claims.
//we wrote a processClaim() method to accept a InsuranceSurveyor type instead of specifying a concrete type. 
//In this way, any further addition of InsuranceSurveyor implementations will not affect the ClaimApprovalManager class.
//Our insurance system is now open to support more types of insurance claims and closed 
//for any modifications whenever a new claim type is added

public class ClaimApprovalManager {

	 public void processClaim(InsuranceSurveyor surveyor){
	        if(surveyor.isValidClaim()){
	            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
	        }
	    }
	
}


