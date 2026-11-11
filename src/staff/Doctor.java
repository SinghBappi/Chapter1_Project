package staff;

public class Doctor extends Accountant {
//	private String name;
//	private int id;
//	private String dept;
//	private String address;
//	private double salary;

	public Doctor(String name, int id, String dept, String address, double salary) {
		super(name, id, dept, address, salary);
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.address = address;
		this.salary = salary;

	}

	protected void examinePatients() {
		System.out.println("Doctors checking patients");
		// TODO Auto-generated method stub

	}

	protected void prescriptionWriting() {
		System.out.println("Doctor has written medcines on paper");
		// TODO Auto-generated method stub

	}

	protected void checkingReports() {
		System.out.println("Doctor is checking patients reports");

		// TODO Auto-generated method stub

	}

	protected void performOps() {
		System.out.println("Doctor is preforming Operation");
		// TODO Auto-generated method stub

	}

	protected void getDetailsOfPatients() {
		System.out.println("Getting Info about Patient");
		// TODO Auto-generated method stub

	}

	@Override
	public void showId() {
		// TODO Auto-generated method stub
		System.out.println("Doctor id" + id);

	}

	@Override
	public void reportEmergency() {
		System.out.println("Emergency Reported by Doctor");
		// TODO Auto-generated method stub

	}

	@Override
	public void reportIssue() {
		System.out.println("Issues Reported by Doctor");
		// TODO Auto-generated method stub

	}

	@Override
	public void markAttendace() {
		System.out.println("Doctor is present");
		// TODO Auto-generated method stub

	}

	@Override
	public void takeBreak() {
		System.out.println("Doctor is on break");
		// TODO Auto-generated method stub

	}

	@Override
	public void calSal(double sal) {
		// TODO Auto-generated method stub
		// super.calSal(sal);
		System.out.println("Doctors salary:" + sal);
	}

	public static void main(String[] args) {
		Doctor doctor = new Doctor("bappi", 1, "general", "mumbai", 40000);
		doctor.calSal(4000);
		doctor.checkingReports();
		doctor.examinePatients();
		doctor.getDetailsOfPatients();
		doctor.prescriptionWriting();
		doctor.performOps();
		System.out.println(doctor);
	}

}
