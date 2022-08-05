package Garcia_Ernesto;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestPhoneNumber extends Application{

	Student student = new Student();


	@Override
	public void start(Stage primaryStage){


		GridPane gp = new GridPane();
		Scene scene = new Scene(gp);

		Button button = new Button("Enter");
		gp.add(button, 1, 1);




		Label question = new Label("How many phone numbers do you need to add?: ");
		gp.add(question, 0, 0);
		TextField input = new TextField();
		gp.add(input, 1, 0);





		primaryStage.setScene(scene);
		primaryStage.show();



		ArrayList<PhoneNumber> contacts = new ArrayList<>();
		int num = 0;		

		button.setOnAction(e -> { //adds the extra pane for the phone numbers

			int amount = Integer.parseInt(input.getText());

			//			PhoneNumber phoneNumber = new PhoneNumber();
			//			
			//
			//			do {
			//
			//				Stage stage = new Stage();
			//				
			//				phoneNumber = new PhoneNumber();
			//				GridPane gPane = new GridPane();
			//
			//				contacts.add(phoneNumber);
			//
			//				Button inside = new Button("Enter");
			//
			//
			//				inside.setOnAction(in -> {
			//
			//					student.setPhoneNumbers(contacts);
			//					stage.close();
			//					
			//				});
			//
			//
			//				Scene seen = new Scene(gPane);
			//
			//
			//				Label idk = new Label("Here is a Label " + amount + " Oh yes");		
			//				TextField tf = new TextField();
			//				gPane.add(tf, 1, 1);
			//				TextField fg = new TextField();
			//				gPane.add(fg, 1, 2);
			//				TextField fggg = new TextField();
			//				gPane.add(fggg, 1, 3);
			//				TextField fgggg = new TextField();
			//				gPane.add(fgggg, 1, 4);
			//
			//				gPane.add(idk, 0, 0);
			//				gPane.add(inside, 0, 2);
			//
			//				stage.setScene(seen);
			//				stage.show();
			//
			//
			//				amount--;
			//
			//
			//			}while(num < amount);//make this decrease so that it can print only that certain amount of times
			//

			pn(amount);			
		});	





		primaryStage.setScene(scene);
		primaryStage.show();



	}

	public ArrayList<PhoneNumber> pn(int amount) {

		ArrayList<PhoneNumber> contacts = new ArrayList<>();

		int num = 0;




		do {
			PhoneNumber phoneNumber = new PhoneNumber();

			
			Stage stage = new Stage();

			GridPane gPane = new GridPane();


			Button inside = new Button("Enter");


			Scene seen = new Scene(gPane);


			Label idk = new Label("Here is a Label " + amount + " Oh yes");		
			TextField tf = new TextField();
			gPane.add(tf, 1, 1);
			TextField fg = new TextField();
			gPane.add(fg, 1, 2);
			TextField fggg = new TextField();
			gPane.add(fggg, 1, 3);
			TextField fgggg = new TextField();
			gPane.add(fgggg, 1, 4);


			inside.setOnAction(in -> {

				
				
				Label  lt = new Label(tf.getText());
				
				gPane.add(lt, 1, 5);
				
				int areacode = Integer.parseInt(tf.getText());

//				phoneNumber.setAreaCode(areacode);
				
				contacts.add(phoneNumber);

				//make the the setters in this action for the button if possible
//				PhoneNumber phoneNumber = new PhoneNumber();

				student.setPhoneNumbers(contacts);
				stage.close();



			});
			
			gPane.add(idk, 0, 0);
			gPane.add(inside, 0, 2);

			stage.setScene(seen);
			stage.show();


			amount--;


		}while(num < amount);//make this decrease so that it can print only that certain amount of times




		return contacts;

		//		ArrayList<PhoneNumber> contacts = new ArrayList<>();
		//		
		//		int num = 0;
		//		
		//		PhoneNumber phoneNumber = new PhoneNumber();
		//		
		//
		//		do {
		//
		//			Stage stage = new Stage();
		//			
		//			phoneNumber = new PhoneNumber();
		//			GridPane gPane = new GridPane();
		//
		//			contacts.add(phoneNumber);
		//
		//			Button inside = new Button("Enter");
		//
		//
		//			inside.setOnAction(in -> {
		//
		//				student.setPhoneNumbers(contacts);
		//				stage.close();
		//				
		//			});
		//
		//
		//			Scene seen = new Scene(gPane);
		//
		//
		//			Label idk = new Label("Here is a Label " + amount + " Oh yes");		
		//			TextField tf = new TextField();
		//			gPane.add(tf, 1, 1);
		//			TextField fg = new TextField();
		//			gPane.add(fg, 1, 2);
		//			TextField fggg = new TextField();
		//			gPane.add(fggg, 1, 3);
		//			TextField fgggg = new TextField();
		//			gPane.add(fgggg, 1, 4);
		//
		//			gPane.add(idk, 0, 0);
		//			gPane.add(inside, 0, 2);
		//
		//			stage.setScene(seen);
		//			stage.show();
		//
		//
		//			amount--;


		//		}while(num < amount);//make this decrease so that it can print only that certain amount of times
		//		
		//		
		//		
		//		
		//		
		//		
		//		
		//		return contacts;

	}




	public static void main(String[] args) {
		Application.launch(args);
	}

}
