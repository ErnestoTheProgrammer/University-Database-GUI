package Garcia_Ernesto;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddPersonButton extends Application{

	UI ui = new UI();
	DatabaseFileIO fileIO = new DatabaseFileIO();
	Student student = new Student();
	Faculty faculty = new Faculty();
	Staff staff = new Staff();


	@Override
	public void start(Stage primaryStage) {
	


	}

	public Button goBack(Stage primaryStage) {
		Button buttonOne = new Button("Back");
		buttonOne.setOnAction(e -> {

			ui.start(primaryStage);
		});
		return buttonOne;
	}

	public void addAction(ChoiceBox<String> choiceBox, Stage primaryStage, Button button) {

		String types = choiceBox.getValue();


		//put the hw05 methods in this assignment

		switch(types){

		case "Student": 
		{

			GridPane pane = new GridPane();
			pane.setAlignment(Pos.CENTER);
			pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
			pane.setHgap(10);
			pane.setVgap(10);

			pane.add(new Label("First name: "), 0, 0);
			TextField firstName = new TextField();
			pane.add(firstName, 1, 0);

			pane.add(new Label("Last name:"), 0, 1); 
			TextField lastName = new TextField();
			pane.add(lastName, 1, 1);

			pane.add(new Label("Email Address:"), 0, 2);
			TextField emailAddress = new TextField ();
			pane.add(emailAddress, 1, 2);

			pane.add(new Label("Class Standing: "), 0, 3);
			TextField classStanding = new TextField();
			pane.add(classStanding, 1, 3);

			pane.add(new Label("GPA: "), 0, 4); //parse this into an double

			TextField gpa = new TextField();
			pane.add(gpa, 1, 4);

			pane.add(new Label("Address"), 0, 5);

			pane.add(new Label("Street name: "), 0, 6);
			TextField addressStreet = new TextField();
			pane.add(addressStreet, 1, 6);

			pane.add(new Label("Street number: "), 0, 7); //parse this into an integer

			TextField streetNumber = new TextField();
			pane.add(streetNumber, 1, 7);

			pane.add(new Label("Apartment number: "), 0, 8);
			TextField aptNum = new TextField();
			pane.add(aptNum, 1, 8);

			pane.add(new Label("City: "), 0, 9);
			TextField city = new TextField();
			pane.add(city, 1, 9);

			pane.add(new Label("State: "), 0, 10);
			TextField state = new TextField();
			pane.add(state, 1, 10);

			pane.add(new Label("Zipcode: "), 0, 11); //parse this into an integer
			TextField zipCode = new TextField();
			pane.add(zipCode, 1, 11);

			pane.add(new Label("Phone Number"), 0, 12);
			pane.add(new Label("How many phone numbers do you have?"), 0, 13);
			TextField numOfPhones = new TextField();
			pane.add(numOfPhones, 1, 13);

			Button addPn = new Button("Add phone number");

			addPn.setOnAction(er -> {

				int amount = Integer.parseInt(numOfPhones.getText());
				student.setPhoneNumbers(phonenumbers(amount));

			});

			pane.add(addPn, 1, 14);

			Button btAdd = new Button("Add person");

			btAdd.setOnAction(add -> {


				int streetNum = Integer.parseInt(streetNumber.getText()); 
				int zipcode = Integer.parseInt(zipCode.getText());

				Address address = new Address(streetNum, aptNum.getText(), addressStreet.getText(), city.getText(), state.getText(), zipcode);

				student.setFirstName(firstName.getText());
				student.setLastName(lastName.getText());
				student.setClassStanding(classStanding.getText());
				student.setGpa(Double.parseDouble(gpa.getText()));
				student.setEmailAddress(emailAddress.getText());


				student.setAddress(address);
				ui.db.database.add(student);
				ui.db.toCSVFile(ui.selectFile());

				ui.start(primaryStage);



			});


			pane.add(btAdd, 2, 14);
			pane.add(goBack(primaryStage), 0, 14);
			GridPane.setHalignment(btAdd, HPos.RIGHT);


			Scene scene = new Scene(pane);

			primaryStage.setTitle("Student"); 
			primaryStage.setScene(scene); 
			primaryStage.show(); 

			GridPane gp = new GridPane();
			Button addPerson = new Button("Add person");
			gp.add(addPerson, 200, 200); 


			break;
		}

		case "Faculty":
			

		{

			GridPane pane = new GridPane();
			pane.setAlignment(Pos.CENTER);
			pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
			pane.setHgap(10);
			pane.setVgap(10);

			pane.add(new Label("First name: "), 0, 0);
			TextField firstName = new TextField();
			pane.add(firstName, 1, 0);

			pane.add(new Label("Last name:"), 0, 1); 
			TextField lastName = new TextField();
			pane.add(lastName, 1, 1);

			pane.add(new Label("Email Address:"), 0, 2);
			TextField emailAddress = new TextField ();
			pane.add(emailAddress, 1, 2);

			pane.add(new Label("Salary: "), 0, 3);
			TextField salary = new TextField();
			pane.add(salary, 1, 3);

			pane.add(new Label("Rank: "), 0, 4);
			TextField rank = new TextField();
			pane.add(rank, 1, 4);
			
			pane.add(new Label("Office Location: "), 0, 5);
			TextField officeLocation = new TextField();
			pane.add(officeLocation, 1, 5);
			
			pane.add(new Label("Office Hours: "), 0, 6);
			TextField officeHours = new TextField();
			pane.add(officeHours, 1, 6);

			pane.add(new Label("Address"), 0, 7);

			pane.add(new Label("Street name: "), 0, 8);
			TextField addressStreet = new TextField();
			pane.add(addressStreet, 1, 8);

			pane.add(new Label("Street number: "), 0, 9); //parse this into an integer
			TextField streetNumber = new TextField();
			pane.add(streetNumber, 1, 9);

			pane.add(new Label("Apartment number: "), 0, 10);
			TextField aptNum = new TextField();
			pane.add(aptNum, 1, 10);

			pane.add(new Label("City: "), 0, 11);
			TextField city = new TextField();
			pane.add(city, 1, 11);

			pane.add(new Label("State: "), 0, 12);
			TextField state = new TextField();
			pane.add(state, 1, 12);

			pane.add(new Label("Zipcode: "), 0, 13); //parse this into an integer
			TextField zipCode = new TextField();
			pane.add(zipCode, 1, 13);

			pane.add(new Label("Phone Number"), 0, 14);
			pane.add(new Label("How many phone numbers do you have?"), 0, 15);
			TextField numOfPhones = new TextField();
			pane.add(numOfPhones, 1, 15);

			Button addPn = new Button("Add phone number");

			addPn.setOnAction(er -> {

				int amount = Integer.parseInt(numOfPhones.getText());
				faculty.setPhoneNumbers(phonenumbers(amount));

			});

			pane.add(addPn, 1, 16);

			Button btAdd = new Button("Add person");

			btAdd.setOnAction(add -> {


				int streetNum = Integer.parseInt(streetNumber.getText()); 
				int zipcode = Integer.parseInt(zipCode.getText());

				Address address = new Address(streetNum, aptNum.getText(), addressStreet.getText(), city.getText(), state.getText(), zipcode);

				faculty.setFirstName(firstName.getText());
				faculty.setLastName(lastName.getText());
				faculty.setSalary(Integer.parseInt(salary.getText()));
				faculty.setRank(rank.getText());
				faculty.setEmailAddress(emailAddress.getText());
				faculty.setOfficeLocation(officeLocation.getText());
				faculty.setOfficeHours(officeHours.getText());


				faculty.setAddress(address);
				ui.db.database.add(faculty);
				ui.db.toCSVFile(ui.selectFile());

				ui.start(primaryStage);


			});


			pane.add(btAdd, 2, 16);
			pane.add(goBack(primaryStage), 0, 16);
			GridPane.setHalignment(btAdd, HPos.RIGHT);


			Scene scene = new Scene(pane);

			primaryStage.setTitle("Faculty"); 
			primaryStage.setScene(scene); 
			primaryStage.show(); 

			GridPane gp = new GridPane();
			Button addPerson = new Button("Add person");
			gp.add(addPerson, 200, 200);

			break;
		}

		case "Staff":

		{

			GridPane pane = new GridPane();
			pane.setAlignment(Pos.CENTER);
			pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
			pane.setHgap(10);
			pane.setVgap(10);

			pane.add(new Label("First name: "), 0, 0);
			TextField firstName = new TextField();
			pane.add(firstName, 1, 0);

			pane.add(new Label("Last name:"), 0, 1); 
			TextField lastName = new TextField();
			pane.add(lastName, 1, 1);

			pane.add(new Label("Email Address:"), 0, 2);
			TextField emailAddress = new TextField ();
			pane.add(emailAddress, 1, 2);

			pane.add(new Label("Salary: "), 0, 3);
			TextField salary = new TextField();
			pane.add(salary, 1, 3);
			
			pane.add(new Label("Office Location: "), 0, 4);
			TextField officeLocation = new TextField();
			pane.add(officeLocation, 1, 4);
			
			pane.add(new Label("Job Title: "), 0, 5);
			TextField jobTitle = new TextField();
			pane.add(jobTitle, 1, 5);

			pane.add(new Label("Address"), 0, 6);

			pane.add(new Label("Street name: "), 0, 7);
			TextField addressStreet = new TextField();
			pane.add(addressStreet, 1, 7);

			pane.add(new Label("Street number: "), 0, 8); //parse this into an integer
			TextField streetNumber = new TextField();
			pane.add(streetNumber, 1, 8);

			pane.add(new Label("Apartment number: "), 0, 9);
			TextField aptNum = new TextField();
			pane.add(aptNum, 1, 9);

			pane.add(new Label("City: "), 0, 10);
			TextField city = new TextField();
			pane.add(city, 1, 10);

			pane.add(new Label("State: "), 0, 11);
			TextField state = new TextField();
			pane.add(state, 1, 11);

			pane.add(new Label("Zipcode: "), 0, 12); //parse this into an integer
			TextField zipCode = new TextField();
			pane.add(zipCode, 1, 12);

			pane.add(new Label("Phone Number"), 0, 13);
			pane.add(new Label("How many phone numbers do you have?"), 0, 14);
			TextField numOfPhones = new TextField();
			pane.add(numOfPhones, 1, 14);

			Button addPn = new Button("Add phone number");

			addPn.setOnAction(er -> {

				int amount = Integer.parseInt(numOfPhones.getText());
				staff.setPhoneNumbers(phonenumbers(amount));

			});

			pane.add(addPn, 1, 15);

			Button btAdd = new Button("Add person");

			btAdd.setOnAction(add -> {


				int streetNum = Integer.parseInt(streetNumber.getText()); 
				int zipcode = Integer.parseInt(zipCode.getText());

				Address address = new Address(streetNum, aptNum.getText(), addressStreet.getText(), city.getText(), state.getText(), zipcode);

				staff.setFirstName(firstName.getText());
				staff.setLastName(lastName.getText());
				staff.setSalary(Integer.parseInt(salary.getText()));
				staff.setJobTitle(jobTitle.getText()); 
				staff.setEmailAddress(emailAddress.getText());
				staff.setOfficeLocation(officeLocation.getText());


				staff.setAddress(address);
				ui.db.database.add(staff);
				ui.db.toCSVFile(ui.selectFile());


				primaryStage.close();
				ui.start(primaryStage);
			



			});


			pane.add(btAdd, 2, 15);
			pane.add(goBack(primaryStage), 0, 15);
			GridPane.setHalignment(btAdd, HPos.RIGHT);


			Scene scene = new Scene(pane);

			primaryStage.setTitle("Staff"); 
			primaryStage.setScene(scene); 
			primaryStage.show(); 

			GridPane gp = new GridPane();
			Button addPerson = new Button("Add person");
			gp.add(addPerson, 200, 200);

			break;
		}

		default:

			
			//add name button should exit the scene and there should be a add phone number button in the center
			//make the add person button have an if else statement that only allows it to press the action if the object has a phoneNumber


		}



	}

	public ArrayList<PhoneNumber> phonenumbers(int amount){


		ArrayList<PhoneNumber> contacts = new ArrayList<>();

		int num = 0;


		do {

			PhoneNumber phoneNumber = new PhoneNumber();

			Stage stage = new Stage();

			GridPane gPane = new GridPane();

			Button enter = new Button("Enter");



			Scene seen = new Scene(gPane);


			Label phonenumberNum = new Label("Phone number:  " + amount );	
			gPane.add(phonenumberNum, 0, 0);
			gPane.add(new Label("Type: "), 0, 1);
			TextField type = new TextField();
			gPane.add(type, 1, 1);
			gPane.add(new Label("Areacode: "), 0, 2);
			TextField areacode = new TextField();
			gPane.add(areacode, 1, 2);
			gPane.add(new Label("Prefix: "), 0, 3);
			TextField prefix = new TextField();
			gPane.add(prefix, 1, 3);
			gPane.add(new Label("Suffix: "), 0, 4);
			TextField suffix = new TextField();
			gPane.add(suffix, 1, 4);


			enter.setOnAction(in -> {

				phoneNumber.setType(type.getText());
				phoneNumber.setAreaCode(Integer.parseInt(areacode.getText()));
				phoneNumber.setPrefix(Integer.parseInt(prefix.getText()));
				phoneNumber.setSuffix(Integer.parseInt(suffix.getText()));

				contacts.add(phoneNumber);

				stage.close();

			});

			gPane.add(enter, 0, 5);

			stage.setScene(seen);
			stage.show();


			amount--;


		}while(num < amount);//make this decrease so that it can print only that certain amount of times


		return contacts;


	}



	public static void main(String[]args) {

		Application.launch(args);

	}

}
