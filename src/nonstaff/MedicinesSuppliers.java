package nonstaff;

public class MedicinesSuppliers {
	private String name;
	private int companyId;
	private String companyname;
	private String address;
	private double income;


	public MedicinesSuppliers(String name, int companyId, String companyname, String address, double income) {
		super();
		this.name = name;
		this.companyId = companyId;
		this.companyname = companyname;
		this.address = address;
		this.income = income;
	}

	@Override
	public String toString() {
		return "MedicinesSuppliers [name=" + name + ", companyId=" + companyId + ", companyname=" + companyname
				+ ", address=" + address + ", income=" + income + "]";
	}


	public void getStocks() {
		System.out.println("getting Stocks");
		// TODO Auto-generated method stub

	}

	public void offerMedicines() {
		System.out.println("Medicines lists");
		// TODO Auto-generated method stub

	}

	public void supplyDetails() {
		System.out.println("Supply Details...");
		// TODO Auto-generated method stub

	}

	public void supplyMedicines() {
		System.out.println("Supply Medicines");
		// TODO Auto-generated method stub

	}

	private void getId() {
		System.out.println("medicine id" + companyId);
		// TODO Auto-generated method stub

	}

	public void getCompanyName() {
		System.out.println("Company name" + companyname);
		// TODO Auto-generated method stub

	}

	public void getName() {
		System.out.println("Name of Supplier:" + name);
//		return name;

	}

}
