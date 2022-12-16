package id.ac.undiksha.siak.entities;

public abstract class Person {
	private String name;
	private String address;
	private boolean gender; //false female, true male
	
	public Person() {
		this.name 			= "<invalid name>";
		this.address		= "<invalid address>";
	}

	public Person(String name, String address, boolean gender) {
		super();
		this.name 		= name;
		this.address 	= address;
		this.gender 	= gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
