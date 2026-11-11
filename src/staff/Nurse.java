package staff;

public class Nurse extends Accountant {
//	private String name;
//	private int id;
//	private String dept;
//	private String address;
//	private double salary;
//	
	

	public Nurse(String name, int id, String dept, String address, double salary) {
		super(name, id, dept, address, salary);
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.address = address;
		this.salary = salary;
		
	}

	public void checkingPatients() {
		System.out.println("Checking Patients by Nurse");
		// TODO Auto-generated method stub

	}

	public void treatPatients() {
		System.out.println("Treating Patients");
		// TODO Auto-generated method stub

	}

	public void getPatientsCurrentInfo() {
		System.out.println("Getting Info about Patients");
		// TODO Auto-generated method stub

	}

	public void reportPatientDetailToDoctor() {
		System.out.println("Patients details submitted to doctor");
		// TODO Auto-generated method stub

	}

	@Override
	public void showId() {
		// TODO Auto-generated method stub
		System.out.println("Nurse id" + id);

	}

	@Override
	public void reportEmergency() {
		System.out.println("Emergency reported by Nurse");
		// TODO Auto-generated method stub

	}

	@Override
	public void reportIssue() {
		System.out.println("Issues reported by Nurse");
		// TODO Auto-generated method stub

	}

	@Override
	public void markAttendace() {
		System.out.println("Nurse is present !");
		// TODO Auto-generated method stub

	}

	@Override
	public void takeBreak() {
		System.out.println("Nurse is on break");
		// TODO Auto-generated method stub

	}

	@Override
	public void calSal(double sal) {
		// TODO Auto-generated method stub
		// super.calSal(sal);
		System.out.println("Nurse Salary:" + sal);
	}

}
