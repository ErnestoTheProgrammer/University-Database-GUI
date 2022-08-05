package Garcia_Ernesto;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SearchClass extends Application {


	@Override
	public void start(Stage primaryStage) {




	}

	public void searchMethod(DatabaseFileIO fileIO, String item) {


		Stage stage = new Stage();

		GridPane gp = new GridPane();


		for(int i = 0; i < fileIO.database.size(); i++) {

			if(fileIO.database.get(0).getFirstName().equalsIgnoreCase(item)) {

				String firstNamePerson = "";
				firstNamePerson += fileIO.database.get(i).toString() + "\n";
				
				TextArea area = new TextArea(firstNamePerson);
				area.setEditable(false); 


				gp.add(area, 0, 5, 5, 5);
				ScrollPane scrollPane = new ScrollPane(gp);
				Scene scene = new Scene(scrollPane);

				stage.setTitle("PERSON");
				stage.setScene(scene);
				stage.show();


			}
			else if(fileIO.database.get(0).getLastName().equalsIgnoreCase(item)) {

				String lastNamePerson = "";
				
					lastNamePerson += fileIO.database.get(i).toString() + "\n";
					
				TextArea area = new TextArea(lastNamePerson);
				area.setEditable(false); 


				gp.add(area, 0, 5, 5, 5);
				ScrollPane scrollPane = new ScrollPane(gp);
				Scene scene = new Scene(scrollPane);

				stage.setTitle("PERSON");
				stage.setScene(scene);
				stage.show();




			}
			else if(item.equalsIgnoreCase("Senior") || item.equalsIgnoreCase("Freshman") || item.equalsIgnoreCase("sophomore") || item.equalsIgnoreCase("junior")) {
				
				 
				TextArea area = new TextArea(fileIO.database.printStudentsByClassStanding(item));
				area.setEditable(false); 


				gp.add(area, 0, 5, 5, 5);
				ScrollPane scrollPane = new ScrollPane(gp);
				Scene scene = new Scene(scrollPane);

				stage.setTitle("PERSON");
				stage.setScene(scene);
				stage.show();




			}
			else if(Double.parseDouble(item) > 4.0) {

				TextArea area = new TextArea(fileIO.database.printStudentsGreaterThanOrEqualToGPA(Double.parseDouble(item)));
				area.setEditable(false); 


				gp.add(area, 0, 5, 5, 5);
				ScrollPane scrollPane = new ScrollPane(gp);
				Scene scene = new Scene(scrollPane);

				stage.setTitle("PERSON");
				stage.setScene(scene);
				stage.show();



			}



		}



	}

	public static void main(String[] args) {

		Application.launch(args);


	}

}
