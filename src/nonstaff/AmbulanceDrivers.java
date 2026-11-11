package nonstaff;

public class AmbulanceDrivers {
	private String name;
	private int driverid;
	private String dept;
	private String address;
	private double salary;
	private String status;
	private String location;
	private int ambulanceid;

	public AmbulanceDrivers(String name, int id, String dept, String address, double salary, String status,
			String location,int ambulanceid) {
		super();
		this.name = name;
		this.driverid = id;
		this.dept = dept;
		this.address = address;
		this.salary = salary;
		this.status = status;
		this.location = location;
		this.ambulanceid=ambulanceid;
	}

	public void showStatus() {
		System.out.println("Driver's Status" + status);
		// TODO Auto-generated method stub

	}

	public void showId() {
		// TODO Auto-generated method stub

		System.out.println("Driver id" + driverid);
	}

	public void showName() {
		System.out.println("Driver name" + name);
		// TODO Auto-generated method stub

	}

	public void showLocation() {
		// TODO Auto-generated method stub
		System.out.println("Current location of Driver:" + location);

	}
	
	protected void showAmbulanceId() {
		// TODO Auto-generated method stub
		System.out.println("Ambulance id"+ambulanceid);

	}

	@Override
	public String toString() {
		return "AmbulanceDrivers [name=" + name + ", driverid=" + driverid + ", dept=" + dept + ", address=" + address
				+ ", salary=" + salary + ", status=" + status + ", location=" + location + ", ambulanceid="
				+ ambulanceid + "]";
	}
	
	
	

}
