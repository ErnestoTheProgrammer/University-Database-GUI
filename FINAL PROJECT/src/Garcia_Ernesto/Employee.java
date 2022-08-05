/* Name: Ernesto Garcia
 * CIN: 306774005
 * Course & Section: CS2012 Sections 20 
 * Description: In this class, The employee will be the superclass for the faculty, and staff class. The information from this and the person
 * class will be passed onto the subclasses and can be changed.
 */
package Garcia_Ernesto;

import java.util.ArrayList;

public class Employee extends Person{

	private String officeLocation;
	private int salary;

	public Employee(){
		super();
		this.officeLocation = "";
		this.salary = 0;

	}

	public Employee(String officeLocation, int salary) {

		this();
		this.officeLocation = officeLocation;
		this.salary = salary;

	}

	public Employee(String officeLocation, int salary, String firstName, String lastName, String emailAddress, Address address, ArrayList<PhoneNumber> phoneNumber) {


		super(firstName, lastName, emailAddress, address, phoneNumber);
		this.officeLocation = officeLocation;
		this.salary = salary;

	}
	
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setRoomNumber(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Employee)) {

			return false;

		}

		Employee rightHandSide = (Employee)object;

		//check to see what the parent data field would be like in the example. ask yourself what exactly do you want to be comparing??

		boolean isParentFieldEqual = super.equals(object); 
		boolean isOfficeLocation = this.officeLocation.equalsIgnoreCase(rightHandSide.officeLocation);
		boolean isSalary = this.salary == rightHandSide.salary;




		return (isOfficeLocation && isSalary && isParentFieldEqual);


	}

	@Override
	public String toString() {
		String result = "";
		result += super.toString();
		result += "Office location: \t" +  this.officeLocation  + "\n";
		result += "Salary: \t\t$" + this.salary + "\n";

		return result;

	}



}
