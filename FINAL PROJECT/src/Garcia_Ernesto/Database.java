/* Name: Ernesto Garcia
 * CIN: 306774005
 * Course & Section: CS2012 Sections 20 
 * Description: In this class, the database class prints and returns information for the appropriate method depending on what is asked
 * such as the number of students in a specific class as an example. 
 */
package Garcia_Ernesto;

import java.util.ArrayList;

public class Database extends ArrayList<Person>{


	public Database() {//default constructor


	}


	public String printStudents() { //try two different methods

		String students = "";
		
		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Student) {

				System.out.println("STUDENT: \n" + super.get(i) + "\n");
				
				students += super.get(i).toString() + "\n";
				
				
			}



		}
		return students;




	}

	public void printEmployees() {

		for(int i = 0; i < super.size(); i++) {


			if(super.get(i) instanceof Employee) {

				System.out.println("EMPLOYEE: \n" + super.get(i) + "\n");

			}

		}

	}

	public String printStaff() {

		String staff = "";
		
		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Staff) {

				System.out.println("STAFF: \n" + super.get(i) + "\n");

				staff += super.get(i).toString() + "\n";
			}
		}

		return staff;

	}

	public String printFaculty() {
		
		String faculty = "";

		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Faculty) {

				System.out.println("FACULTY: \n" + super.get(i) + "\n");
				
				faculty += super.get(i).toString() + "\n";

			}

		}
		return faculty;

	}

	public int getNumberOfPeople() {

		int numOfPeople = 0;
		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Person) {

				numOfPeople++;

			}

		}
		return numOfPeople;

	}

	public int getNumberOfStudents() {

		int numOfStudents = 0;
		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Student) {

				numOfStudents++;

			}

		}

		return numOfStudents;
	}

	public int getNumberOfEmployees() {

		int numOfEmployees = 0;

		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Employee) {

				numOfEmployees ++;

			}

		}

		return numOfEmployees;


	}

	public int getNumberOfStaff() {

		int numOfStaff = 0;

		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Staff) {

				numOfStaff ++;

			}
		}

		return numOfStaff;

	}

	public int getNumberOfFaculty() {

		int numOfFaculty = 0;

		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Faculty) {

				numOfFaculty ++;

			}

		}

		return numOfFaculty;

	}

	public String printStudentsByClassStanding(String classStanding) {

		String studentClassStanding = "";
		
		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Student) {


				Student rightHandSide = (Student)super.get(i);			



				if(classStanding.equalsIgnoreCase(rightHandSide.getClassStanding())) {

					System.out.println(classStanding.toUpperCase() + ": \n" + super.get(i));
					
					studentClassStanding += super.get(i).toString() + "\n";

				}
					
				}

			}
		
		return studentClassStanding;

		}



	public int getNumberOfStudentsByClassStanding(String classStanding) {

		int classStandingStudents = 0;

		for(int i = 0; i < super.size(); i++) {

			if(super.get(i) instanceof Student) {


				Student rightHandSide = (Student)super.get(i);			

				if(classStanding.equalsIgnoreCase(rightHandSide.getClassStanding())) {


					classStandingStudents++;


				}

			}

		}

		return classStandingStudents;


	}



	public String printStudentsGreaterThanOrEqualToGPA(double gpa) {
		
		String bigGPA = "";
		
		for(int i = 0; i < super.size(); i++) {
			
			if(super.get(i) instanceof Student) {
							
				Student rightHandSide = (Student)super.get(i);
				
				if(rightHandSide.getGpa() >= gpa) {
					
					System.out.println("Student's GPA: \n" + super.get(i));
					
					bigGPA += super.get(i).toString() + "\n";

						
				}
				
			}
						
		}
	
		return bigGPA;



	}
	
	public String printStudentsLessThanOrEqualToGPA(double gpa) {
		
	
		String smallGPA = "";
		
		for(int i = 0; i < super.size(); i++) {
			
			if(super.get(i) instanceof Student) {
				
				Student rightHandSide = (Student)super.get(i);
				
				if(rightHandSide.getGpa() <= gpa) {
					
					System.out.println("Student's GPA: \n" + super.get(i));
					
					smallGPA += super.get(i).toString() + "\n";
					
				}
				
			}
		}
		
		return smallGPA;
		
		
	}

	@Override
	public String toString() {

		String result = "";

		for(int i = 0 ; i < super.size(); i++) {
			
			result += "" + (i+1) + ".\n" + super.get(i) + "\n";
			
		}


		return result;

	}








}
