package staff;

public class Medical implements Staff_Rules {
	String name;
	int id;
	String dept;
	String address;
	double salary;

	@Override
	public String toString() {
		return "Medical [name=" + name + ", id=" + id + ", dept=" + dept + ", address=" + address + ", salary=" + salary
				+ "]";
	}

	public Medical(String name, int id, String dept, String address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.address = address;
		this.salary = salary;
	}

	public void getStocks() {
		System.out.println("Stocks collected from suppliers");

		// TODO Auto-generated method stub

	}
	public void sellMedicines() {
		System.out.println("Selling Medicines to Patients");
		// TODO Auto-generated method stub

	}
	public void inspectingMedicines() {
		System.out.println("Inspecting Medicines");
		// TODO Auto-generated method stub

	}
	public void inspectingPrescription() {
		System.out.println("Inspecting Prescription");
		// TODO Auto-generated method stub

	}
	public void inspectingStocks() {
		System.out.println("Checking Medicines that patient\'s prescription");
		// TODO Auto-generated method stub

	}
	@Override
	public void showId() {
		// TODO Auto-generated method stub
		System.out.println("Medical Id:" + id);

	}

	@Override
	public void reportEmergency() {
		System.out.println("Emergency reported by Medical Store");
		// TODO Auto-generated method stub

	}

	@Override
	public void reportIssue() {
		System.out.println("Issues reported by Medical Store");
		// TODO Auto-generated method stub

	}

	@Override
	public void markAttendace() {
		// TODO Auto-generated method stub
		System.out.println("Medical Person is Present");

	}

	@Override
	public void takeBreak() {
		System.out.println("Medical Persone is on Break");
		// TODO Auto-generated method stub

	}

}
