package clients;

//import staff.Doctor;
//import staff.Nurse;

public class Patients {
	private String fullname;
	private int doctorid;
	private int nurseid = 0;
	private int addharcardnum;
	private int age;

	@Override
	public String toString() {
		return "Patients [fullname=" + fullname + ", doctorid=" + doctorid + ", nurseid=" + nurseid + ", addharcardnum="
				+ addharcardnum + ", age=" + age + "]";
	}



	public Patients(String fullname, int doctorid, int nurseid, int addharcardnum, int age) {
		super();
		this.fullname = fullname;
		this.doctorid = doctorid;
		this.nurseid = nurseid;
		this.addharcardnum = addharcardnum;
		this.age = age;
	}

	public void claimInssurance() {
		System.out.println("Claiming Insurance");
		// TODO Auto-generated method stub

	}

	public void applyInsurance() {
		System.out.println("Application submited to Company");
		// TODO Auto-generated method stub

	}

	public void getPatientsReport() {
		System.out.println("Getting Patients Reports");
		// TODO Auto-generated method stub

	}

	public void doPayment() {
		System.out.println("Payment performing...");

		// TODO Auto-generated method stub

	}

	public void checkPaymentStatus() {
		System.out.println("Payment Status");
		// TODO Auto-generated method stub

	}

}
