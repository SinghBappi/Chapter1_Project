package staff;

public class Cleaner extends Accountant {
//	String name;
//	int id;
//	String dept;
//	String address;
//	double salary;

	@Override
	public void showId() {
		// TODO Auto-generated method stub
		System.out.println("Cleaner id:" + id);

	}
	

	public Cleaner(String name, int id, String dept, String address, double salary) {
		super(name, id, dept, address, salary);
		this.name = name;
		this.id =id;
		this.dept = dept;
		this.address = address;
		this.salary = salary;
		
	}


	@Override
	public void reportEmergency() {
		System.out.println("Emergency reported by Cleaner");
		// TODO Auto-generated method stub

	}

	@Override
	public void reportIssue() {
		System.out.println("Issues reported by Cleaner");
		// TODO Auto-generated method stub

	}

	@Override
	public void markAttendace() {
		System.out.println("Cleaner is present");
		// TODO Auto-generated method stub

	}

	@Override
	public void takeBreak() {
		System.out.println("Cleaner is on break");
		// TODO Auto-generated method stub

	}

	@Override
	public void calSal(double sal) {
		// TODO Auto-generated method stub
//		super.calSal(sal);
		System.out.println("Cleaner Salary:" + sal);
	}
	public void checkPatientRooms() {
		System.out.println("Checking Patients room for cleaning");
		// TODO Auto-generated method stub

	}
	
	public void cleanPatientRoom() {
		System.out.println("Cleaning Room of Patients");
		// TODO Auto-generated method stub

	}
	public void reportCleaningEquipments() {
		System.out.println("Equipments Stocks...");
		// TODO Auto-generated method stub

	}


}
