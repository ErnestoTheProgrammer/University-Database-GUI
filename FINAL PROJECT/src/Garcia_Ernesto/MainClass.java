/* Name: Ernesto Garcia
 * CIN: 306774005
 * Course & Section: CS2012 Sections 20 
 * Description: In this class, the university menu will hold the information for all of the classes and will display them in specific categories.
 * A few of these categories would be to display the number of employee's that is stored in the database. It can print the number of specific objects,
 * display the specific object, and can have objects created.
 * 
 */

package Garcia_Ernesto;

import java.util.ArrayList;


public class MainClass {


	public static void main(String[] args) {


		System.out.println("-------------------------- UNIVERSITY DATA BASE --------------------------");

		Address studentAddress = new Address(276,"-1", "Orchard", "Rialto", "CA", 92376 );
		Address facultyAddress = new Address(201, "32", "Richard", "Ontario", "CA", 92576 );
		Address staffAddress = new Address(532, "2", "Winslet", "Fontana", "CA", 92476 );
		Address employeeAddress = new Address(482,"-1", "Omselet", "Los Angeles", "CA", 92436 );//edit this

		PhoneNumber studentPhoneNumber = new PhoneNumber("Home", 232, 321, 3412);
		PhoneNumber facultyPhoneNumber =  new PhoneNumber("Business", 432, 342, 4323);
		PhoneNumber staffPhoneNumber = new PhoneNumber("Cell", 442, 892, 8023);
		PhoneNumber employeePhoneNumber = new PhoneNumber("Business", 483, 854, 2013);



		ArrayList<PhoneNumber> pn = new ArrayList<>();
		pn.add(staffPhoneNumber);
		pn.add(studentPhoneNumber);

		ArrayList<PhoneNumber> pn1 = new ArrayList<>();
		pn1.add(studentPhoneNumber);
		pn1.add(employeePhoneNumber);






		//person class
		Person person = new Person("Ernesto", "Garcia", "egarcia12@calstatela.edu", studentAddress, pn1);
		System.out.println("PERSON: \n\n" + person);

		//Student class
		Student student = new Student("Sophomore", 3.7, "Ernesto", "Garcia", "egarcia12@calstatela.edu", studentAddress, pn1);
		student.setPhoneNumber(new PhoneNumber("Home", 909, 877, 9738));
		System.out.println("\nSTUDENT: \n\n" + student);

		//Faculty class
		Faculty faculty = new Faculty("1am-2am", "Full time", "SH-B201", 5524243, "Richmond", "Green", "rgreen21@gmail.com", facultyAddress, pn);
		System.out.println("\nFACULTY: \n\n" + faculty);

		//Staff class
		Staff staff = new Staff("Director of Computer Science", "E&T-223", 90242, "Byron", "garcia", "sumone@gmail.com", staffAddress, pn);
		System.out.println("\nSTAFF: \n\n" + staff);

		//Employee class
		Employee employee = new Employee("E&T-763", 10032232, "Wilson", "babol", "wbabol34@gmail.com", employeeAddress, pn);
		System.out.println("\nEMPLOYEE: \n\n" + employee);
		System.out.println("\nEMPLOYEE: \n\n" + employee);


		System.out.println("Equal's method: \n");

		System.out.println("Is Person's equal to same person: " + person.equals(person) + "\n");

		System.out.println("Is Person's equal to Student: " + person.equals(student) + "\n");

		System.out.println("Is Person's equal to Faculty: " + person.equals(faculty) + "\n");

		System.out.println("Is Faculty equal to Person's: " + faculty.equals(person) + "\n");

		System.out.println("Is Faculty equal to Student: " + faculty.equals(student) + "\n");//TRY AND FIX THIS WITH SOMETHING THAT IS COMPATIABLE

		System.out.println("Is Staff equal to Employee: " + staff.equals(employee) + "\n");

		System.out.println("Is Staff equal to Person: " + staff.equals(person) + "\n");

		System.out.println("Is Employee equal to Faculty: " + employee.equals(faculty) + "\n");

		System.out.println("Is Employee equal to same Employee: " + employee.equals(employee) + "\n");


		//address class below

		System.out.println("ADDRESS: ");
		Address address = new Address(784, "Orange", "Riverside", "CA", 94836 );//edit this
		System.out.println("Address:" + address + "\n");


		//phone number class below

		System.out.println("PHONE NUMBER: \n");
		PhoneNumber phoneNumber = new PhoneNumber("Home", 232, 321, 3412);

		System.out.println("Phone number: \n" + phoneNumber + "\n");

		System.out.println("Phone number '" + phoneNumber + "' compared to '" + studentPhoneNumber + "': " + phoneNumber.equals(studentPhoneNumber) + "\n");
		System.out.println("Phone number '" + phoneNumber + "' compared to '" + facultyPhoneNumber + "': " + phoneNumber.equals(facultyPhoneNumber) + "\n");




		Database db = new Database();



		System.out.println("Database: " + db);

		Address address1 = new Address(784, "-1","Orange", "Riverside", "CA", 94836 );//edit this
		Address address2 = new Address(7324, "-1","Blue", "Riverside", "CA", 94836 );//edit this
		Address address3 = new Address(1784, "-1","Arroyo", "Fontana", "CA", 94836 );//edit this
		Address address4 = new Address(7584, "3", "Ayala", "Pasadena", "CA", 94836 );//edit this
		Address address5 = new Address(764,"-1", "Nicolas", "Redlands", "CA", 94836 );//edit this
		Address address6 = new Address(294,"-1", "Willow", "Yucaipa", "CA", 94836 );//edit this
		Address address7 = new Address(404,"-1", "Pepper", "Pomona", "CA", 94836 );//edit this
		Address address8 = new Address(194, "-1","Mill", "Upland", "CA", 94836 );//edit this
		Address address9 = new Address(624, "23",  "Sycamore", "Perris", "CA", 94836 );//edit this
		Address address10 = new Address(1004, "-1","Lilac", "San Bernardino", "CA", 94836 );//edit this
		Address address11 = new Address(1904,"-1", "Sycamore", "Perris", "CA", 94836 );//edit this
		Address address12 = new Address(1002, "-1","Lilac", "San Bernardino", "CA", 94836 );//edit this
		Address address13 = new Address(821, "-1","Sycamore", "Perris", "CA", 94836 );//edit this
		Address address14 = new Address(423, "53", "Miller", "San Bernardino", "CA", 94836 );//edit this
		Address address15 = new Address(700, "-1","Jerry", "San Bernardino", "CA", 94836 );//edit this
		Address address16 = new Address(620,"-1", "Arroz", "San Bernardino", "CA", 94836 );//edit this
		Address address17 = new Address(243,"-1", "Kennedy", "San Bernardino", "CA", 94836 );//edit this
		Address address18 = new Address(200, "E", "San Bernardino", "CA", 94836 );//edit this
		Address address19 = new Address(109, "5th", "San Bernardino", "CA", 94836 );//edit this






		PhoneNumber p1 = new PhoneNumber("Home", 909, 355, 7493);//instance of the PhoneNumber
		PhoneNumber p2 = new PhoneNumber("Cell", 909, 532, 1643);
		PhoneNumber p3 = new PhoneNumber("Business", 323, 342, 302);
		PhoneNumber p4 = new PhoneNumber("Business", 951, 321, 3412);//instance of the PhoneNumber
		PhoneNumber p5 = new PhoneNumber("Home", 951, 931, 7152);
		PhoneNumber p6 = new PhoneNumber("Cell", 323, 43, 1121);//instance of the PhoneNumber
		PhoneNumber p7 = new PhoneNumber("Cell", 909, 232, 9979);
		PhoneNumber p8 = new PhoneNumber("Home", 321, 897, 6542);
		PhoneNumber p9 = new PhoneNumber("Home", 951, 943, 1121);//instance of the PhoneNumber	
		PhoneNumber p10 = new PhoneNumber("Business", 651, 232, 9999);
		PhoneNumber p11 = new PhoneNumber("Home", 951, 876, 7152);
		PhoneNumber p12 = new PhoneNumber("Cell", 323, 43, 1100);//instance of the PhoneNumber	
		PhoneNumber p13 = new PhoneNumber("Cell", 909, 162, 9979);
		PhoneNumber p14 = new PhoneNumber("Home", 951, 931, 7992);
		PhoneNumber p15 = new PhoneNumber("Cell", 323, 3, 1001);//instance of the PhoneNumber	
		PhoneNumber p16 = new PhoneNumber("Business", 909, 232, 9979);
		PhoneNumber p17 = new PhoneNumber("Home", 323, 43, 1121);//instance of the PhoneNumber
		PhoneNumber p18 = new PhoneNumber("Cell", 909, 231, 9939);











		Staff s1 = new Staff("BiologyAdvisor", "BIO-221", 100000, "Micheal", "garcia", "college@gmail.com", address1, pn1);

		Staff s2 = new Staff("Administrative office", "SH-209", 86000, "Brianna", "Rodriguez", "br.csula@gmail.com", address2, pn1);

		Staff s3 = new Staff("Director of Computer Science", "KH-2000B", 232242, "Jerry", "Pho", "pho62@gmail.com", address3, pn1);

		Staff s4 = new Staff("Counselor", "BIO-210", 85000, "Alexandra", "garcia", "college@gmail.com", address4, pn1);

		Staff s5 = new Staff("Event-Coordinator", "GYM-20B", 76332, "Charisma", "Garcia", "flores.csula@gmail.com", address5, pn);

		Staff s6 = new Staff("Advising assistant", "ADM-107", 76423, "Larry", "Pho", "sumone@gmail.com", address6, pn1);

		Staff s7 = new Staff("Mechanical Engineering Advisor", "ST-409", 95043, "Tom", "Boffle", "tboffle123@gmail.com", address7, pn);




		Faculty f1 = new Faculty("1pm-2pm", "Full time", "BIO-100", 90000, "Juan", "Garcia", "jg.csula@gmail.com", address19, pn);

		Faculty f2 = new Faculty("1pm-2pm", "Part time", "SH-2000C", 54340, "Christian", "Alexandra", "ca.csula@gmail.com", address8, pn1);

		Faculty f3 = new Faculty("1pm-2pm", "Full time", "SH-2109C", 98343, "Christy", "Zamora", "cz.csula@gmail.com", address9, pn1);

		Faculty f4 = new Faculty("1pm-2pm", "Full time", "BIO-243", 78453, "Alexis", "Gutierrez", "alexg.csula@gmail.com", address10, pn1);

		Faculty f5 = new Faculty("1pm-2pm", "Part time", "KH-B3333", 67395, "Johnny", "Pho", "phonnytom@gmail.com", address11, pn);

		Faculty f6 = new Faculty("1pm-2pm", "Full time", "KH-C4012", 87754, "Tom", "Gunn", "gunntom.csula@gmail.com", address15, pn);

		Faculty f7 = new Faculty("1pm-2pm", "Full time", "ST-3000", 120448, "Pedro", "Lockett", "cumbol.p@gmail.com", address16, pn1);
		



		Student st1 = new Student("Sophomore", 3.84, "Ernesto", "Garcia", "egarcia12@csula.edu", address19,pn);

		Student st2  = new Student("Senior", 3.43, "Charisma", "Garcia", "cgarcia19@csula.edu", address18,pn);

		Student st3  = new Student("Senior", 2.43, "Vik", "Macias", "vmacias07@csula.edu", address2,pn1);

		Student st4 = new Student("Sophomore", 3.7,  "Brisa", "Serrano", "bserrano43@gmail.com", address17, pn);

		Student st5 = new Student("Junior", 2,  "Jimmy", "Bofa", "jbofa83@gmail.com", address12, pn1);

		Student st6 = new Student("Junior", 1.8,  "Tommy", "Li", "tli909@gmail.com", address13, pn1);

		Student st7 = new Student("Freshman", 3.8,  "Brianna", "Rosales", "brose@gmail.com", address14, pn1);


		//manually adding the objects in the the database instance randomly
		db.add(st1);
		db.add(f7);
		db.add(f1);
		db.add(st5);
		db.add(s1);
		db.add(s5);
		db.add(st7);
		db.add(s2);
		db.add(f4);
		db.add(st6);
		db.add(f3);
		db.add(s3);
		db.add(st2);
		db.add(st4);
		db.add(f6);
		db.add(s6);
		db.add(s4);
		db.add(f2);
		db.add(st3);
		db.add(s7);
		db.add(f5);

		db.add(s2);

		System.out.println("\n------------------ ALL PEOPLE ------------------\n");
		System.out.println(db.toString());
		System.out.println("------------------------------------------------\n");




		System.out.println("\n------------------ EMPLOYEE'S ------------------\n");
		db.printEmployees();
		System.out.println("\n------------------------------------------------\n");

		System.out.println("\n------------------ FACULTY ------------------\n");
		db.printFaculty();
		System.out.println("\n------------------------------------------------\n");


		System.out.println("\n------------------ STAFF ------------------\n");
		db.printStaff();
		System.out.println("\n------------------------------------------------\n");

		System.out.println("\n------------------ STUDENT'S ------------------\n");
		db.printStudents();
		System.out.println("\n------------------------------------------------\n");



		System.out.println("Number of employee's: " + db.getNumberOfEmployees());
		System.out.println("Number of Staff: " + db.getNumberOfStaff());
		System.out.println("Number of Faculty: " + db.getNumberOfFaculty());
		System.out.println("Number of Student's: " + db.getNumberOfStudents());


		System.out.println("\n------------------ FRESHMAN STUDENT'S ------------------\n");
		db.printStudentsByClassStanding("freshman");
		System.out.println("Number of freshman: " + db.getNumberOfStudentsByClassStanding("freshman"));
		System.out.println("\n------------------------------------------------\n");



		System.out.println("\n------------------ SOPHOMORE STUDENT'S ------------------\n");
		db.printStudentsByClassStanding("sophomore");
		System.out.println("Number of freshman: " + db.getNumberOfStudentsByClassStanding("sophomore"));
		System.out.println("\n------------------------------------------------\n");



		System.out.println("\n------------------ JUNIOR STUDENT'S ------------------\n");
		db.printStudentsByClassStanding("junior");
		System.out.println("Number of freshman: " + db.getNumberOfStudentsByClassStanding("junior"));
		System.out.println("\n------------------------------------------------\n");



		System.out.println("\n------------------ SENIOR STUDENT'S ------------------\n");
		db.printStudentsByClassStanding("senior");
		System.out.println("Number of freshman: " + db.getNumberOfStudentsByClassStanding("senior"));
		System.out.println("\n------------------------------------------------\n");

		System.out.println("\n------------------ ABOVE OR EQUAL 2.0 GPA STUDENT'S ------------------\n");
		db.printStudentsGreaterThanOrEqualToGPA(2.0);
		System.out.println("\n------------------------------------------------\n");

		System.out.println("\n------------------ BELOW OR EQUAL 2.0 GPA STUDENT'S ------------------\n");
		db.printStudentsLessThanOrEqualToGPA(2.0);
		System.out.println("\n------------------------------------------------\n");






	}

}
