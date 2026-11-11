package staff;

public class WardBoy extends Accountant {
	

	private String name;
	private int id;
	private String dept;
	private String address;
	private double salary;
	
	
	

	public WardBoy(String name, int id, String dept, String address, double salary) {
		super(name, id, dept, address, salary);
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.address=address;
		this.salary = salary;
		
	}

	@Override
	public void showId() {
		// TODO Auto-generated method stub
		System.out.println("WardBoy id:" + id);

	}

	@Override
	public void reportEmergency() {
		System.out.println("Emergency Reported by Wardboy");
		// TODO Auto-generated method stub

	}

	@Override
	public void reportIssue() {
		System.out.println("Emergency reported by wardboy");
		// TODO Auto-generated method stub

	}

	@Override
	public void markAttendace() {
		System.out.println("Ward boy is present !");
		// TODO Auto-generated method stub

	}

	@Override
	public void takeBreak() {
		System.out.println("Wardboy is on break");
		// TODO Auto-generated method stub

	}

	@Override
	public void calSal(double sal) {
		// TODO Auto-generated method stub
		// super.calSal(sal);
		System.out.println("Wardboy salary:" + sal);
	}

	public void getWard() {
		System.out.println("Ward has been taken by ward boy for patient");
		// TODO Auto-generated method stub

	}

}
