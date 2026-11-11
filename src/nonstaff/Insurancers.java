package nonstaff;

public class Insurancers {
	String name;
	int id;
	String branchname;
	String address;
	double commission;
	String cityname;

	public Insurancers(String name, int id, String branchname, String address, double commission, String cityname) {
		super();
		this.name = name;
		this.id = id;
		this.branchname = branchname;
		this.address = address;
		this.commission = commission;
		this.cityname = cityname;
	}

	

	@Override
	public String toString() {
		return "Insurancers [name=" + name + ", id=" + id + ", branchname=" + branchname + ", address=" + address
				+ ", commission=" + commission + ", cityname=" + cityname + "]";
	}



	public void provideOffers() {
		System.out.println("List of Insurances...");
		// TODO Auto-generated method stub

	}

	public void forwardFile() {
		System.out.println("Insurance File has been forwarded");
		// TODO Auto-generated method stub

	}

	public void emergencyClaim() {
		System.out.println("Claim has been instiated in Emergency condition");
		// TODO Auto-generated method stub

	}

	protected void showCommission() {
		System.out.println("The commision:" + commission);
		// TODO Auto-generated method stub

	}

	protected void chargeCommission() {
		System.out.println("Charged Commission:" + commission);
		// TODO Auto-generated method stub

	}
}
