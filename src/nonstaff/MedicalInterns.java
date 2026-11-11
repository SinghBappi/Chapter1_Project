package nonstaff;

import staff.Doctor;

public class MedicalInterns extends Doctor {

	private String name;
	private int id;
	private String dept;
	private String address;
	private double salary;


	public MedicalInterns(String name, int id, String dept, String address, double salary) {
		super(name, id, dept, address, salary);
		this.name = name;
		this.address = address;
		this.id = id;
		this.dept = dept;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MedicalInterns [name=" + name + ", id=" + id + ", dept=" + dept + ", address=" + address + ", salary="
				+ salary + "]";
	}


	@Override
	public void calSal(double sal) {
		// TODO Auto-generated method stub
//	super.calSal(sal);
		System.out.println("Medical Intern Salary:" + sal);

	}

	@Override
	protected void checkingReports() {
		// TODO Auto-generated method stub
//		super.checkingReports();
		System.out.println("Medical Intern Checking Reports");
	}

	@Override
	protected void examinePatients() {
		// TODO Auto-generated method stub
//		super.examinePatients();
		System.out.println("Medical Interns Examining Patients");
	}

	@Override
	public void reportEmergency() {
		// TODO Auto-generated method stub
//		super.reportEmergency();
		System.out.println("Medical Intern Emergency Report");
	}

	@Override
	public void showId() {
		// TODO Auto-generated method stub
//		super.showId();
		System.out.println("Medical Intern Id" + id);
	}

	@Override
	public void takeBreak() {
		// TODO Auto-generated method stub
//		super.takeBreak();
		System.out.println("Medical Intern is on Break");

	}

	@Override
	public void markAttendace() {
		// TODO Auto-generated method stub
//	super.markAttendace();
		System.out.println("Medical Intern is present");
	}

	@Override
	public void reportIssue() {
		// TODO Auto-generated method stub
//		super.reportIssue();
		System.out.println("Issues reported by MedicalInterns");
	}
}
