package staff;

import nonstaff.AmbulanceDrivers;
import nonstaff.Insurancers;
import nonstaff.MedicalInterns;
import nonstaff.MedicinesSuppliers;
import clients.*;

public class Main {

	public static void main(String[] args) {

		Accountant acct = new Accountant("ayush", 1, "accoutnat", "UP", 65000.0);
		System.out.println("Accountant: " + acct);
		acct.showId();
		acct.reportEmergency();
		acct.reportIssue();
		acct.markAttendace();
		acct.takeBreak();
		acct.calSal(65000.0);
		acct.calSal(65000.0, 5000);
		acct.calSal(65000.0, 5000, 1000);

		Medical med = new Medical("abhshake", 2, "pharmacy", "nepal", 50000.0);
		System.out.println("Medical: " + med);
		med.showId();
		med.reportEmergency();
		med.reportIssue();
		med.markAttendace();
		med.takeBreak();
		med.getStocks();
		med.sellMedicines();
		med.inspectingMedicines();
		med.inspectingPrescription();
		med.inspectingStocks();

		Doctor dr = new Doctor("parsh", 3, "dentist", "borivali", 12000.0);
		System.out.println("Doctor: " + dr);
		dr.showId();
		dr.reportEmergency();
		dr.reportIssue();
		dr.markAttendace();
		dr.takeBreak();
		// dr.examinePatients();
		// dr.prescriptionWriting();
		// dr.checkingReports();
		// dr.performOps();
		// dr.getDetailsOfPatients();
		dr.calSal(12000.0);

		Nurse n = new Nurse("sneha", 4, "general", "mira road", 65000.0);
		System.out.println("Nurse: " + n);
		n.showId();
		n.reportEmergency();
		n.reportIssue();
		n.markAttendace();
		n.takeBreak();
		n.checkingPatients();
		n.treatPatients();
		n.getPatientsCurrentInfo();
		n.reportPatientDetailToDoctor();
		n.calSal(65000.0);
		n.calSal(65000.0, 3000);
		n.calSal(65000.0, 3000, 1500);

		Cleaner cl = new Cleaner("raju", 5, "general", "dharavi", 35000.0);
		System.out.println("Cleaner: " + cl);
		cl.showId();
		cl.reportEmergency();
		cl.reportIssue();
		cl.markAttendace();
		cl.takeBreak();
		cl.checkPatientRooms();
		cl.cleanPatientRoom();
		cl.reportCleaningEquipments();
		cl.calSal(35000.0);

		WardBoy wb = new WardBoy("Mohito", 6, "general", "chruchgate", 30000.0);
		System.out.println("WardBoy: " + wb);
		wb.showId();
		wb.reportEmergency();
		wb.reportIssue();
		wb.markAttendace();
		wb.takeBreak();
		wb.getWard();
		wb.calSal(30000.0);

		AmbulanceDrivers ad = new AmbulanceDrivers("Omraj", 7, "Driver", "kandivali", 40000.0, "Active",
				"Sdac Hospital", 7);
		System.out.println("\nAmbulanceDriver: " + ad);
		ad.showStatus();
		ad.showId();
		ad.showName();
		ad.showLocation();
//		 ad.showAmbulanceId(); 

		
		Insurancers ins = new Insurancers("Mansi", 8, "Main Branch", "Thakur Business School", 5000.0, "Pune");
		System.out.println("Insurancer: " + ins);
		ins.provideOffers();
		ins.emergencyClaim();
		ins.forwardFile();
	

		MedicalInterns mi = new MedicalInterns("Satyam", 9, "General", "Vasai E", 55000.0);
		System.out.println("MedicalIntern: " + mi);
		mi.showId(); 
		mi.reportEmergency(); 
		mi.reportIssue(); 
		mi.markAttendace(); 
		mi.takeBreak(); 
//		 mi.checkingReports(); 
//		 mi.examinePatients(); 
		 mi.getDetailsOfPatients(); 
		 mi.calSal(55000.0); 

		MedicinesSuppliers ms = new MedicinesSuppliers("Rohan", 10, "medicalpharma", "santa cruz", 75000.0);
		System.out.println("MedicinesSupplier: " + ms);
		ms.getStocks();
		ms.offerMedicines();
		ms.supplyDetails();
		ms.supplyMedicines();
		ms.getCompanyName();
		ms.getName();


		Patients patient = new Patients("Shyam", 3, 11, 123456789, 30);
		System.out.println("Patient: " + patient);
		patient.applyInsurance();
		patient.claimInssurance();
		patient.getPatientsReport();
		patient.doPayment();
		patient.checkPaymentStatus();

	}
}