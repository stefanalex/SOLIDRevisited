package com.warpitsoft.solid.opencloseOk;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {

	public boolean isValidClaim(){
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
    }
}
