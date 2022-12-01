package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    
    // Member Variables    
    private ArrayList<String> patientNotes;
	
    // TODO: Constructor that takes an ID
	public Physician(Integer id) {
		super(id);
		patientNotes = new ArrayList<String>();
	}
	
    // TODO: Implement HIPAACompliantUser!
	public boolean assignPin(int pin) {
		if(pin/1000 < 1) {
			return false;
		}
		this.setPin(pin);
		return true;
	}
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
		return this.getId() == confirmedAuthID;
	}
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // TODO: Setters & Getters
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

}
