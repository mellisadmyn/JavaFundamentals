package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;

public class Main {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setName("Mellisa");
		
		std1.printAllInfo();
		
		Student std2 = new Student(
		"2115101037",
		"Mellisa",
		"Badung",
		false,
		"Computer Science",
		"Computer Science",
		"Computer Science"
		);
		
		std2.printAllInfo();
				
	}

}
