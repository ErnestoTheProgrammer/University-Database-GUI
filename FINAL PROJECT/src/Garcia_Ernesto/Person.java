/* Name: Ernesto Garcia
 * CIN: 306774005
 * Course & Section: CS2012 Sections 20 
 * Description: In this class, the parent class will be holding the data for the students, faculty, employees and data for them that is suitable
 * then will be passed in a toString method
 */
package Garcia_Ernesto;

import java.util.ArrayList;

public class Person {

	private String firstName;
	private String lastName;
	private String emailAddress;
	private Address address;
	private ArrayList<PhoneNumber> phoneNumbers;

	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.emailAddress = "";
		this.phoneNumbers = new ArrayList<>();

	}
	
	public Person(String firstName, String lastName, String emailAddress, Address address, ArrayList<PhoneNumber> phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.address = address;
		this.phoneNumbers = phoneNumber;

	}
	
	public Person(String firstName, String lastName, String emailAddress) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public String getFirstName() {

		return firstName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public String getLastName() {

		return lastName;

	}

	public void setEmailAddress(String emailAddress) {

		this.emailAddress = emailAddress;

	}

	public String getEmailAddress() {
		return emailAddress;

	}

	public void setAddress(Address address) {

		this.address = address;

	}
	
	public Address getAddress() {
		return this.address;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {

		this.phoneNumbers.add(phoneNumber);

	}
	
	public void setPhoneNumbers(ArrayList<PhoneNumber> phoneNumber) {
		
		this.phoneNumbers = phoneNumber;
		
	}
	
	public ArrayList<PhoneNumber> getPhoneNumber(){
		return this.phoneNumbers;
	}

//	@SuppressWarnings("unused")
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Person)) {
			return false;

		}

		Person rightHandSide = (Person)object;


		boolean isFirstName = this.firstName.equalsIgnoreCase(rightHandSide.firstName);
		boolean isLastName = this.lastName.equalsIgnoreCase(rightHandSide.lastName);
		boolean isEmailAddress = this.emailAddress.equalsIgnoreCase(rightHandSide.emailAddress);
		boolean isAddress = this.address.equals(rightHandSide.address);

		if(this.phoneNumbers.size() == rightHandSide.phoneNumbers.size()) { 

			for(int i = 0; i < this.phoneNumbers.size(); i++) {

				if(this.phoneNumbers.get(i).equals(rightHandSide.phoneNumbers.get(i))) {

					boolean isPhoneNumber = true;

					return (isFirstName && isLastName && isEmailAddress && isAddress && isPhoneNumber);

				}else {

					boolean isPhoneNumber = false;

					return (isFirstName && isLastName && isEmailAddress && isAddress && isPhoneNumber);

				}

			}

		}

		boolean isPhoneNumber = false;


		return (isFirstName && isLastName && isEmailAddress && isAddress && isPhoneNumber);
	}

	public String toString() {//check again with the classes to see if you need the toString method for this class. most likely do
		String result = "";

		if(this.address.getStreetName().equalsIgnoreCase("")) {

			result += "Name:\t\t\t" + this.firstName + " " + this.lastName + "\n";

			result += "Email Address:\t\t" + this.emailAddress + "\n";

			result += "Address:\t\tMISSING ADDRESS" + "\n";

			for(int i =0; i < this.phoneNumbers.size(); i++) {

				
				result += "Phone Number:\t\t" + this.phoneNumbers.get(i) + "\n";

			}
		}

		else {

			result += "Name:\t\t\t" + this.firstName + " " + this.lastName + "\n";

			result += "Email Address:\t\t" + this.emailAddress + "\n";

			result += "Address:" + this.address;

			for(int i =0; i < this.phoneNumbers.size(); i++) {

				result += "Phone Number:\t\t" + this.phoneNumbers.get(i) + "\n";
			}



		}



		return result;



	}

}
