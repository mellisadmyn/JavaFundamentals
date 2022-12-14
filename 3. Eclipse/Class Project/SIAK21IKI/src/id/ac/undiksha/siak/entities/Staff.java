package id.ac.undiksha.siak.entities;

public class Staff {
	private String nip;
	private String name;
	private String address;
	private boolean gender; //false female, true male
	private String unit;
	
	public Staff() {
		this.name 			= "<invalid name>";
		this.address		= "<invalid address>";
		this.nip			= "<invalid nip>";
		this.unit			= "<invalid unit>";
	}
	
	public Staff(String nip, String name, String address, boolean gender, String unit) {
		super();
		this.nip = nip;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.unit = unit;
	}
	
	public void printAllInfo() {
		System.out.println("NIP: "			+this.nip);
		System.out.println("Name: "			+this.name);
		System.out.println("Address: "		+this.address);
		System.out.println("Gender: "		+
				(gender ? "Male" : "Female"));
		System.out.println("Unit: "		+this.unit);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
