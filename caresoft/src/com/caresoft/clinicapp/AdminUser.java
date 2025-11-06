package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    public int pin;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer employeeID, String role){
        this.employeeID = employeeID;
        this.role = role;
        this.setId(employeeID); 
    }
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin){
        int numbers = String.valueOf(pin).length();
        if(numbers == 6){
            setPin(pin);
            return true;
        }else{
            return false;
        }
    }
    public boolean accessAuthorized(Integer confirmedAuthID){
        if(this.id.equals(confirmedAuthID)){
            return true;
        }else{
            return false;
        }
    }

    // TO DO: Implement HIPAACompliantAdmin!
    @Override
    public ArrayList<String> reportSecurityIncidents(){
        return securityIncidents;
    }
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
}
