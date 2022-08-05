package Garcia_Ernesto;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingAndRemovingPeople {
	
	//global instances so that it can be accessed from the whole class
	DatabaseFileIO db = new DatabaseFileIO();
	Student student = new Student();
	Faculty faculty = new Faculty();
	Staff staff = new Staff();
	
	public void addPerson() {
		Scanner in = new Scanner(System.in);

		System.out.println("Who would you like to add? (Student, Faculty, Staff)");
		String type = in.nextLine();


		if(type.equalsIgnoreCase("Student")) {
			
			student = new Student();
			
			student.setAddress(makeAddress());

			System.out.print("First Name: ");
			String firstName = in.next(); 
			student.setFirstName(firstName);

			System.out.print("Last Name: ");
			String lastName = in.next();
			student.setLastName(lastName);

			System.out.print("Class standing: ");
			String classStanding = in.next();
			student.setClassStanding(classStanding);

			System.out.print("Email address: ");
			String emailAddress = in.next();
			student.setEmailAddress(emailAddress);

			System.out.print("GPA: ");
			double gpa = in.nextDouble();
			student.setGpa(gpa);
			
			student.setPhoneNumbers(makePhoneNumbers());
			
			db.database.add(student);


		}

		else if(type.equalsIgnoreCase("Faculty")) {

			faculty = new Faculty();
			
			faculty.setAddress(makeAddress());
			
			System.out.print("First Name: ");
			String firstName = in.next(); 
			faculty.setFirstName(firstName);

			System.out.print("Last Name: ");
			String lastName = in.next();
			faculty.setLastName(lastName);
			
			System.out.print("Email address: ");
			String emailAddress = in.next();
			faculty.setEmailAddress(emailAddress);
			
			System.out.print("Office hours: ");
			String officeHours = in.next();
			faculty.setOfficeHours(officeHours);
			
			System.out.print("Office Location: ");
			String officeLocation = in.next();
			faculty.setOfficeLocation(officeLocation);
			
			System.out.print("Rank: ");
			String rank = in.next();
			faculty.setRank(rank);
			
			System.out.print("Salary: ");
			int salary = in.nextInt();
			faculty.setSalary(salary);

			db.database.add(faculty);


		}
		else if(type.equalsIgnoreCase("Staff")) {

			staff = new Staff();
			
			staff.setAddress(makeAddress());

			System.out.print("First Name: ");
			String firstName = in.next(); 
			staff.setFirstName(firstName);

			System.out.print("Last Name: ");
			String lastName = in.next();
			staff.setLastName(lastName);
			
			System.out.print("Email address: ");
			String emailAddress = in.next();
			staff.setEmailAddress(emailAddress);
			
			System.out.print("Job title: ");
			String jobTitle = in.next();
			staff.setJobTitle(jobTitle);
			
			System.out.print("Office Location: ");
			String officeLocation = in.next();
			staff.setOfficeLocation(officeLocation);
			
			System.out.print("Salary: ");
			int salary = in.nextInt();
			staff.setSalary(salary);
			
			staff.setPhoneNumbers(makePhoneNumbers());
			
			db.database.add(staff);


		}


	}

	public Address makeAddress() {
		Scanner in = new Scanner(System.in);

		Address address = new Address();

		System.out.println("Do you live in a home(1) or apartment(2)? [ 1 / 2 ]");
		String choice = in.next();

		if(choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("Home")){
			
			//int streetNumber, String apartmentNumber, String streetName, String city, String state, int zipCode
			
			System.out.print("Street Number: ");
			int streetNumber = in.nextInt();
			address.setStreetNumber(streetNumber);
			
			System.out.print("Street name: ");
			String streetName = in.next();
			address.setStreetName(streetName);

			System.out.print("City: ");
			String city = in.next();
			address.setCity(city);

			System.out.print("State: ");
			String state = in.next();
			address.setState(state);

			System.out.print("Zipcode: ");
			int zipcode = in.nextInt();
			address.setZipCode(zipcode);

		}
		else {

			System.out.print("Street Number: ");
			int streetNumber = in.nextInt();
			address.setStreetNumber(streetNumber);
			
			System.out.print("Street name: ");
			String streetName = in.next();
			address.setStreetName(streetName);
			
			System.out.print("Apartment number: ");
			String aptNumber = in.next();
			address.setApartmentNumber(aptNumber);

			System.out.print("City: ");
			String city = in.next();
			address.setCity(city);

			System.out.print("State: ");
			String state = in.next();
			address.setState(state);

			System.out.print("Zipcode: ");
			int zipcode = in.nextInt();
			address.setZipCode(zipcode);

		}

		return address;

	}
	public ArrayList<PhoneNumber> makePhoneNumbers(){
		Scanner in = new Scanner(System.in);
		PhoneNumber phoneNumber = new PhoneNumber();
		
		ArrayList<PhoneNumber> contacts = new ArrayList<>();
		int num = 0;
		System.out.print("How many phone numbers do you need to add?: ");
		int amount = in.nextInt();
		
		do {
			
			phoneNumber = new PhoneNumber();
			
			
			
			System.out.println("[Mobile / Home / Cell / Business]");
			String type = in.next();
			phoneNumber.setType(type);
			
			System.out.println("Areacode");
			int areacode = in.nextInt();
			phoneNumber.setAreaCode(areacode);
			
			System.out.println("Prefix");
			int prefix = in.nextInt();
			phoneNumber.setPrefix(prefix);
			
			System.out.println("Suffix");
			int suffix = in.nextInt();
			phoneNumber.setSuffix(suffix);
			
			contacts.add(phoneNumber);
			student.setPhoneNumbers(contacts);
			amount--;
			
			
		}while(num < amount);//make this decrease so that it can print only that certain amount of times
			
		
		return contacts;

	}


}
