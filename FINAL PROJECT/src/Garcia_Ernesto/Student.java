/* Name: Ernesto Garcia
 * CIN: 306774005
 * Course & Section: CS2012 Sections 20 
 * Description: In this class, the student class is the subclass of the person class and will hold the basic information for
 * both the person and student to make it distinct  from the rest of the other classes from employees
 */
package Garcia_Ernesto;

import java.util.ArrayList;

public class Student extends Person {
	
	private String classStanding;
	private double gpa;
	
	
	public Student(){
		this.classStanding = "";
		this.gpa = 0;
		
	}
	
//	public Student(String classStanding, double gpa) {
//	
//		this.classStanding = classStanding;
//		this.gpa = gpa;
//		
//	}
	
	public Student(String classStanding, double gpa, String firstName, String lastName, String emailAddress, Address address, ArrayList<PhoneNumber> phoneNumber) {
		
		super(firstName, lastName, emailAddress, address, phoneNumber);
		this.classStanding = classStanding;
		this.gpa = gpa;
		
	}

	public String getClassStanding() {
		return classStanding;
	}

	public void setClassStanding(String classStanding) {
		this.classStanding = classStanding;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	@Override
	public boolean equals(Object object) {
		
		if(!(object instanceof Student)) {
			
			return false;
			
		}
		
		Student rightHandSide = (Student)object;
		
		boolean isParentField = super.equals(object);
	
		boolean isClassStanding = this.classStanding.equalsIgnoreCase(rightHandSide.classStanding);
		
		return (isClassStanding && isParentField);
		
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += super.toString();
		
		result += "Class standing:\t\t" + this.classStanding + "\n";
		
		result += "GPA:\t\t\t" + this.gpa + "\n\n";		
		
		
		return result;
		
	}

}
