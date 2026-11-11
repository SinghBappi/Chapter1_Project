package staff;

public class Accountant implements Staff_Rules {
	String name;
	int id;
	String dept;
	String address;
	double salary;
	
	
	public Accountant(String name, int id, String dept, String address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Accountant [name=" + name + ", id=" + id + ", dept=" + dept + ", address=" + address + ", salary="
				+ salary + "]";
	}

	@Override
	public void showId() {
		// TODO Auto-generated method stub
		System.out.println("Accountant id:" + id);

	}

	@Override
	public void reportEmergency() {
		System.out.println("Emergency reported by Accountant");
		// TODO Auto-generated method stub

	}

	@Override
	public void reportIssue() {
		System.out.println("Issues reported by Accoutant");
		// TODO Auto-generated method stub

	}

	@Override
	public void markAttendace() {
		System.out.println("Accountant is present");
		// TODO Auto-generated method stub

	}

	@Override
	public void takeBreak() {
		System.out.println("Accountant is on break");
		// TODO Auto-generated method stub

	}

	public void calSal(double sal) {
		System.out.println("Salary" + sal);

		// TODO Auto-generated method stub

	}

	public void calSal(double sal, int bonus) {
		System.out.println("Total salary with bonus:" + sal + bonus);
		// TODO Auto-generated method stub

	}

	public void calSal(double sal, int bonus, int tax) {
		System.out.println("Total Salary with bonus and Tax surprise:" + ((sal + bonus) - tax));

		// TODO Auto-generated method stub

	}
}
