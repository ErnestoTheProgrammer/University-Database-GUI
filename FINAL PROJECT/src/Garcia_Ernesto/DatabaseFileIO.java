package Garcia_Ernesto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.stage.FileChooser;


public class DatabaseFileIO {

	Database database = null;
	File file = null;


	public DatabaseFileIO() {
		database = new Database();
	}
	
	public DatabaseFileIO(File file) {
		this.file = file;
		
	}
	
	
	
	
	public void takeInFile() {
		Scanner in = new Scanner(System.in);
		
		

		File inFile = this.file;

//		toCSVFile();

		try {
			ArrayList<Person> persons = readData(inFile);

		}

		catch(Exception ex) {
			System.out.println("Error");
		}
	}

	public ArrayList<Person> readData(File inFile) throws java.io.IOException, FileNotFoundException, PhoneNumberFormatException{
		ArrayList<Person> persons = new ArrayList <>();

		try {

			Scanner reader = new Scanner(inFile);

			while(reader.hasNext()) {


				String nextLine = reader.nextLine(); //move the split method to each and every one of the cases so that the loop would continue

				String[] tokens = nextLine.split(",");
				String personType = tokens[0];

				switch(personType) {


				case "Employee":

					String[] employees = nextLine.split(",");
					String firstNameOne = employees[1];
					String lastNameOne = employees[2];
					String emailAddressOne = employees[3];
					String officeLocationOne = tokens[4];
					int salary = Integer.parseInt(tokens[5]);

					String nextLine2 = reader.nextLine();
					Address address2 = null;

					if(nextLine2.startsWith("Address")) {
						address2 = getAddress(nextLine2);
					}


					ArrayList<PhoneNumber> phoneNumberTwo = new ArrayList <>();


					Employee employee = new Employee(officeLocationOne, salary, firstNameOne, lastNameOne, emailAddressOne, address2, phoneNumberTwo);
					persons.add(employee);
					database.add(employee);


					break;

				case "Student":		

					String[] students = nextLine.split(",");
					String firstNameTwo = students[1];
					String lastNameTwo = students[2];
					String emailAddressTwo = students[3];
					String classStanding = tokens[4];
					double gpa = Double.parseDouble(tokens[5]);

					String nextLine3 = reader.nextLine();
					Address address3 = null;

					if(nextLine3.startsWith("Address")) {

						address3 = getAddress(nextLine3);

					}


					ArrayList<PhoneNumber> phoneNumberThree = new ArrayList<>();


					Student student = new Student(classStanding, gpa, firstNameTwo, lastNameTwo, emailAddressTwo, address3, phoneNumberThree);
					database.add(student);// get rid of all db
					persons.add(student);


					break;


				case "Faculty":

					String[] faculties = nextLine.split(",");
					String firstNameThree = faculties[1];
					String lastNameThree = faculties[2];
					String emailAddressThree = faculties[3];
					String facultyOfficeLocation = tokens[4];
					int facultySalary = Integer.parseInt(tokens[5]);
					String officeHours = (tokens[6]);	
					String facultyRank = tokens[7];

					String nextLine4 = reader.nextLine();
					Address facultyAddress = null;

					facultyAddress = getAddress(nextLine4);	


					ArrayList<PhoneNumber> facultyPhoneNumber = new ArrayList<>();



					Faculty faculty = new Faculty(officeHours, facultyRank, facultyOfficeLocation, facultySalary, firstNameThree, lastNameThree, emailAddressThree, facultyAddress, facultyPhoneNumber);
					database.add(faculty);
					persons.add(faculty);

					break;

				case "Staff":
					String[] staffs = nextLine.split(",");
					String firstNameFour = staffs[1];
					String lastNameFour = staffs[2];
					String emailAddressFour = staffs[3];
					String staffOfficeLocation = tokens[4];
					String jobTitle = tokens[6];
					int staffSalary = Integer.parseInt(tokens[5]);


					String nextLine5 = reader.nextLine();
					Address staffAddress = null;

					if(nextLine5.startsWith("Address")) {

						staffAddress = getAddress(nextLine5);

					}
					ArrayList<PhoneNumber> staffPhoneNumber = new ArrayList<>();

					Staff staff = new Staff(jobTitle, staffOfficeLocation, staffSalary, firstNameFour, lastNameFour, emailAddressFour, staffAddress, staffPhoneNumber);
					database.add(staff);//remove
					persons.add(staff); 

					break;

				case "Phone":

					getPhoneNumber(tokens[1], tokens[2]);


					break;



				default:



				}


			}

		}
		catch(FileNotFoundException ex) {

			System.out.println("ERROR: FILE NOT FOUND");
		}


		return persons;
		//USE THE SCROLL PANE FOR THE GUI
	}

	public Address getAddress(String addressLine) {

		Address address = new Address();



		String[] parts = addressLine.split(",");
		int streetNumber = Integer.parseInt(parts[1]);

		if(parts.length == 6) {

			String streetName = parts[2];
			String city = parts[3];
			String state = parts[4];
			int zipCode = Integer.parseInt(parts[5]);

			//Address,117,Sunshine Dr.,Los Angeles,CA,90012


			address.setStreetNumber(streetNumber);
//			address.setApartmentNumber("");
			address.setStreetName(streetName);
			address.setCity(city);
			address.setState(state);
			address.setZipCode(zipCode);

		}
		else {
			String apartmentNumber = parts[2];
			String streetName = parts[3];
			String city = parts[4];
			String state = parts[5];
			int zipCode = Integer.parseInt(parts[6]);

			//Address,117,Sunshine Dr.,Los Angeles,CA,90012

			address.setStreetNumber(streetNumber);
			address.setApartmentNumber(apartmentNumber);
			address.setStreetName(streetName);
			address.setCity(city);
			address.setState(state);
			address.setZipCode(zipCode);
		}


		return address;
	}

	public void getPhoneNumber(String phoneType, String phoneNumber) throws PhoneNumberFormatException {



		PhoneNumber contacts = new PhoneNumber("",0,0,0);
		Person person = database.get(database.size()-1);

		String format = "\\d{3}-\\d{3}-\\d{4}";
		if(phoneNumber.matches(format)) {

			String[] tokens = phoneNumber.split("-");
			int areaCode = Integer.parseInt(tokens[0]);
			int prefix = Integer.parseInt(tokens[1]);
			int suffix = Integer.parseInt(tokens[2]);

			contacts.setType(phoneType);
			contacts.setAreaCode(areaCode);
			contacts.setPrefix(prefix);
			contacts.setSuffix(suffix);

			person.getPhoneNumber().add(contacts);

		}
		else {
			throw new PhoneNumberFormatException(phoneNumber);
		}


	}


	public void toCSVFile(File file) {//save db

		Scanner in = new Scanner(System.in);
		PrintWriter writer = null;
		StringBuilder stringBuilder = new StringBuilder();

		try {

//			File file = (inFile); //input file here
			writer = new PrintWriter(file);


		}
		catch(FileNotFoundException ex) {
			System.out.println("ERROR: FILE ERROR");

		}

		for(int i = 0; i < database.size(); i++){

			stringBuilder =new StringBuilder();
			Person person = database.get(i);


			if(person instanceof Student) {



				Student student = (Student)person;

				stringBuilder.append(String.format("Student,%s,%s,%s,%s,%s", student.getFirstName(),
						student.getLastName(),student.getEmailAddress(),
						student.getClassStanding(),student.getGpa()));

				writer.println(stringBuilder.toString());

				stringBuilder = new StringBuilder();//resets the stringBuilder object and allows a new line of string to be used
				//appending the address from the student


				if(student.getAddress().getApartmentNumber().equalsIgnoreCase("")) {

					stringBuilder.append(String.format("Address,%s,%s,%s,%s,%s", student.getAddress().getStreetNumber(),
							student.getAddress().getStreetName(),student.getAddress().getCity(),
							student.getAddress().getState(),student.getAddress().getZipCode()));

					writer.println(stringBuilder.toString());

				}
				else {
					stringBuilder.append(String.format("Address,%s,%s,%s,%s,%s,%s", student.getAddress().getStreetNumber(),
							student.getAddress().getApartmentNumber(),student.getAddress().getStreetName(),
							student.getAddress().getCity(),student.getAddress().getState(),student.getAddress().getZipCode()));

					writer.println(stringBuilder.toString());

				}

				//will be appending the strings and phone numbers from the student into new lines of code

				stringBuilder = new StringBuilder();
				for(int k = 0; k < student.getPhoneNumber().size(); k++) {
					stringBuilder.append(String.format("Phone,%s,%s-%s-%s", student.getPhoneNumber().get(k).getType(),
							student.getPhoneNumber().get(k).getAreaCode(),student.getPhoneNumber().get(k).getPrefix(),
							student.getPhoneNumber().get(k).getSuffix()));

					writer.println(stringBuilder.toString());

					stringBuilder = new StringBuilder();


				}

			}
			else if(person instanceof Staff) {

				Staff staff = (Staff)person;

				stringBuilder.append(String.format("Staff,%s,%s,%s,%s,%s,%s", staff.getFirstName(),
						staff.getLastName(),staff.getEmailAddress(),staff.getOfficeLocation(),
						staff.getSalary(),staff.getJobTitle()));

				writer.println(stringBuilder.toString());

				stringBuilder = new StringBuilder();//resets the stringBuilder object and allows a new line of string to be used
				//appending the address from the staff

				if(staff.getAddress().getApartmentNumber().equalsIgnoreCase("")) {

					stringBuilder.append(String.format("Address,%s,%s,%s,%s,%s", staff.getAddress().getStreetNumber(),
							staff.getAddress().getStreetName(),staff.getAddress().getCity(),
							staff.getAddress().getState(),staff.getAddress().getZipCode()));

					writer.println(stringBuilder.toString());

				}
				else {
					stringBuilder.append(String.format("Address,%s,%s,%s,%s,%s,%s", staff.getAddress().getStreetNumber(),
							staff.getAddress().getApartmentNumber(),staff.getAddress().getStreetName(),
							staff.getAddress().getCity(),staff.getAddress().getState(),staff.getAddress().getZipCode()));

					writer.println(stringBuilder.toString());

				}

				//will be appending the strings and phone numbers from the staff into new lines of code

				stringBuilder = new StringBuilder();
				for(int k = 0; k < staff.getPhoneNumber().size(); k++) {
					stringBuilder.append(String.format("Phone,%s,%s-%s-%s", staff.getPhoneNumber().get(k).getType(),
							staff.getPhoneNumber().get(k).getAreaCode(),staff.getPhoneNumber().get(k).getPrefix(),
							staff.getPhoneNumber().get(k).getSuffix()));

					writer.println(stringBuilder.toString());

					stringBuilder = new StringBuilder();
				}

			}
			else if(person instanceof Faculty) {

				Faculty faculty = (Faculty)person;

				stringBuilder.append(String.format("Faculty,%s,%s,%s,%s,%s,%s,%s", faculty.getFirstName(), faculty.getLastName(),
						faculty.getEmailAddress(),faculty.getOfficeLocation(),faculty.getSalary(),
						faculty.getOfficeHours(),faculty.getRank()));

				writer.println(stringBuilder.toString());
				stringBuilder = new StringBuilder();//resets the stringBuilder object and allows a new line of string to be used
				//appending the address from the faculty

				if(faculty.getAddress().getApartmentNumber().equalsIgnoreCase("")) {

					stringBuilder.append(String.format("Address,%s,%s,%s,%s,%s", faculty.getAddress().getStreetNumber(),
							faculty.getAddress().getStreetName(),faculty.getAddress().getCity(),
							faculty.getAddress().getState(),faculty.getAddress().getZipCode()));

					writer.println(stringBuilder.toString());

				}
				else {
					stringBuilder.append(String.format("Address,%s,%s,%s,%s,%s,%s", faculty.getAddress().getStreetNumber(),
							faculty.getAddress().getApartmentNumber(),faculty.getAddress().getStreetName(),
							faculty.getAddress().getCity(),faculty.getAddress().getState(),faculty.getAddress().getZipCode()));

					writer.println(stringBuilder.toString());

				}

				//will be appending the strings and phone numbers from the faculty into new lines of code

				stringBuilder = new StringBuilder();
				for(int k = 0; k < faculty.getPhoneNumber().size(); k++) {
					stringBuilder.append(String.format("Phone,%s,%s-%s-%s", faculty.getPhoneNumber().get(k).getType(),
							faculty.getPhoneNumber().get(k).getAreaCode(),faculty.getPhoneNumber().get(k).getPrefix(),
							faculty.getPhoneNumber().get(k).getSuffix()));

					writer.println(stringBuilder.toString());

					stringBuilder = new StringBuilder();
				}



			}


		}


		writer.close();
		in.close();


	}

	public void printPeople() {

		System.out.println(database.toString());

	}


}



