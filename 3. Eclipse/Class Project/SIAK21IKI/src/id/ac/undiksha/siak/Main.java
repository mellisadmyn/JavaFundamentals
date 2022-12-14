package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.Staff;

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
			"Technical Information",
			"Technical and Vocational"
		);
		std2.printAllInfo();	
		
		Lecturer lect1 = new Lecturer(
			"198806222015041003",
			"Yudhi Paramartha",
			"Singaraja",
			true,
			"Computer Science",
			"Technical Information",
			"Technical and Vocational",
			"Koorprodi"
		);
		lect1.printAllInfo();
		
		Staff staff1 = new Staff(
				"221123456789103",
				"Draco Malfoy",
				"Denpasar",
				true,
				"UPT TIK"
			);
		staff1.printAllInfo();
	}
}