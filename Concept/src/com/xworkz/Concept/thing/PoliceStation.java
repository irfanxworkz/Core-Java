
package com.xworkz.Concept.thing;

public class PoliceStation {
	private String stationName;
	private int noOfStaff;
	private String address;
	private int contactNo;
	private String email;
	private String officerName;
	private String department;
	private String area;
	private int noOfVehicle;
	private int femaleStaff;

	public PoliceStation(String stationName, int noOfStaff, String address, int contactNo, String email,
			String officerName, String department, String area, int noOfVehicle, int femaleStaff) {
		this.stationName = stationName;
		this.noOfStaff = noOfStaff;
		this.address = address;
		this.contactNo = contactNo;
		this.email = email;
		this.officerName = officerName;
		this.department = department;
		this.area = area;
		this.noOfVehicle = noOfVehicle;
		this.femaleStaff = femaleStaff;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Police Station : " + obj);
		if (obj != null) {
			System.out.println("Object is not null...");
			if (obj instanceof PoliceStation) {
				System.out.println("Obj is PoliceStation type, compare it...");

				PoliceStation cast = (PoliceStation) obj;
				PoliceStation police1 = this;
				PoliceStation police2 = cast;

				if (police1.stationName.equals(police2.stationName) && police1.noOfStaff == police2.noOfStaff
						&& police1.address.equals(police2.address) && police1.contactNo == police2.contactNo
						&& police1.email.equals(police2.email) && police1.officerName.equals(officerName)
						&& police1.department.equals(police2.department) && police1.area.equals(police2.area)
						&& police1.noOfVehicle == police2.noOfVehicle && police1.femaleStaff == police2.femaleStaff) {
					System.out.println("both are same");
					return true;
				} else {
					System.out.println("Both are Not same");
				}
			} else {
				System.out.println("obj is not PoliceStation type, not compared it");
			}
		} else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		System.out.println("Running toString in PoliceStation Class...");
		return "[Station Name is: " + stationName + "] [No Of Staff is: : " + noOfStaff + " ] [Address :" + address
				+ "] [contactNo is: " + contactNo + "] [Email is:" + email + "] [officerName is: " + officerName
				+ "] [department is: " + department + "] [" + area + "] [noOfVehicle is :" + noOfVehicle
				+ "] [femalStaff is :" + femaleStaff + "] ";
	}
}
