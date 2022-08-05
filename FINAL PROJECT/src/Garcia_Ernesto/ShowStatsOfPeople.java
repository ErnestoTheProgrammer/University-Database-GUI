package Garcia_Ernesto;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowStatsOfPeople extends Application{
	
	UI ui = new UI();
	
	@Override
	public void start(Stage primaryStage) {
		
		
		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		
		gp.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		Label numOfStudents = new Label("Number of Students: " + ui.db.database.getNumberOfStudents());
		gp.add(numOfStudents, 0, 0);
		
		Label numOfFaculty = new Label("Number of Faculty: " + ui.db.database.getNumberOfFaculty());
		gp.add(numOfFaculty, 0, 1);
		
		Label numOfStaff = new Label("Number of Staff: " + ui.db.database.getNumberOfStaff());
		gp.add(numOfStaff, 0, 2);
		
		Label numOfPeople = new Label("Number of total people: " + ui.db.database.getNumberOfPeople());
		gp.add(numOfPeople, 0, 3);
		
		Scene scene = new Scene(gp);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	

	public static void main(String[] args) {
		
		Application.launch(args);
		
	}

}
