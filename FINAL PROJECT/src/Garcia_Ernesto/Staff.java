/* Name: Ernesto Garcia
 * CIN: 306774005
 * Course & Section: CS2012 Sections 20 
 * Description: In this class, the staff class will hold the basic information for the staff such as the job title
 * which the faculty will not be able to hold themselves.
 */
package Garcia_Ernesto;

import java.util.ArrayList;

public class Staff extends Employee {

	private String jobTitle;//ex: head librarian or CS2012 professor

	public Staff() {
		super();
		this.jobTitle = "";

	}

	public Staff(String jobTitle) {
		this();
		this.jobTitle = jobTitle;

	}

	public Staff(String jobTitle, String officeLocation, int salary, String firstName, 
			String lastName, String emailAddress, Address address, ArrayList<PhoneNumber> phoneNumber) {

		super(officeLocation, salary, firstName, lastName, emailAddress, address, phoneNumber);
		this.jobTitle = jobTitle;

	}

	public void setJobTitle(String jobTitle) {

	}

	public String getJobTitle() {
		return jobTitle;

	}

	@Override 
	public boolean equals(Object object) {

		if(!(object instanceof Staff)) {

			return false;
		}

		Staff rightHandSide = (Staff)object;

		boolean isParentField = super.equals(object);
		boolean isJobTitle = this.jobTitle.equalsIgnoreCase(rightHandSide.jobTitle);


		return (isJobTitle && isParentField);


	}

	public String toString() {
		String result = "";

		result += super.toString();

		result+= "Job Title:\t\t" + this.jobTitle + "\n\n";

		return result;
	}
}
