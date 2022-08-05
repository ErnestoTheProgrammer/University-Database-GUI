/* Name: Ernesto Garcia
 * CIN: 306774005
 * Course & Section: CS2012 Sections 20 
 * Description: In this class, the faculty will be storing most of the basic information for specifically the faculty which is
 * different from staff. it will hold the information appropriate for the class
 */
package Garcia_Ernesto;

import java.util.ArrayList;

public class Faculty extends Employee {

	private String officeHours;
	private String rank; //part time or full time or the only valid ones

	public Faculty() {
		this.officeHours = "";
		this.rank = "";


	}

	public Faculty(String officeHours, String rank) {
		this();
		this.officeHours = officeHours;
		this.rank = rank;

	}

	public Faculty(String officeHours, String rank, String officeLocation, int salary, String firstName, String lastName, String emailAddress, 
			Address address, ArrayList<PhoneNumber> phoneNumber) {


		super(officeLocation, salary, firstName, lastName, emailAddress, address, phoneNumber);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	

	public String getOfficeHours() {
		return officeHours;
	}


	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}


	public String getRank() {
		return rank;
	}


	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public boolean equals(Object object) {

		if(!(object instanceof Faculty)) {
			return false;

		}

		Faculty rightHandSide = (Faculty)object;

		boolean isParentField = super.equals(object);
		boolean isOfficeHours = this.officeHours == rightHandSide.officeHours;

		return (isOfficeHours && isParentField);
	}

	@Override
	public String toString() {
		String result = "";

		result += super.toString();

		result += "Office Hours:\t\t" + this.officeHours + "\n";

		result += "Rank:\t\t\t" + this.rank + "\n\n";

		return result;

	}




}
