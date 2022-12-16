package id.ac.undiksha.siak.entities;

public class Student extends Person {
	private String nim;
	private String studyProgram;
	private String department;
	private String faculty;
	
	public Student() {
		super();
		this.nim			= "<invalid nim>";
		this.studyProgram	= "<invalid study program>";
		this.department		= "<invalid department>";
		this.faculty		= "<invalid faculty>";
	}
	
	public Student(String nim, String studyProgram, String department, String faculty) {
		super();
		this.nim 			= nim;
		this.studyProgram 	= studyProgram;
		this.department 	= department;
		this.faculty 		= faculty;
	}

	public void printAllInfo() {
		System.out.println("NIM: "			+this.getNim());
		System.out.println("Name: "			+this.getName());
		System.out.println("Address: "		+this.getAddress());
		System.out.println("Study Program: "+this.getStudyProgram());
		System.out.println("Department: "	+this.getDepartment());
		System.out.println("Faculty: "		+this.getFaculty());
		System.out.println("Gender: "		+
				(getGender() ? "Male" : "Female"));
		System.out.println("\n");
	}
	
	public Student(String name, String address, boolean gender, String nim, String studyProgram, String department, String faculty) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nim 			= nim;
		this.studyProgram 	= studyProgram;
		this.department 	= department;
		this.faculty 		= faculty;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
}