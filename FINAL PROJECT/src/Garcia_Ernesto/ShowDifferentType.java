package Garcia_Ernesto;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowDifferentType extends Application{

	@Override
	public void start(Stage primaryStage) {
		
			
		
	}
	
	public void showType(DatabaseFileIO fileIO, ChoiceBox<String> choiceBox) {
		
		Stage stage = new Stage();

		String type = choiceBox.getValue();
		
		switch(type) {
		
		case "Student": {
			
			GridPane gp = new GridPane();
			TextArea area = new TextArea(fileIO.database.printStudents());
			area.setEditable(false);
			
			
			
			gp.add(area, 0, 5, 5, 5);
			ScrollPane scrollPane = new ScrollPane(gp);
			Scene scene = new Scene(scrollPane);
			
			stage.setTitle("Student");
			stage.setScene(scene);
			stage.show();
		
			
			
			
			
			
			break;
		}
		
		case "Faculty": {
			
			GridPane gp = new GridPane();
			TextArea area = new TextArea(fileIO.database.printFaculty());
			area.setEditable(false);
			
			
			
			gp.add(area, 0, 5, 5, 5);
			ScrollPane scrollPane = new ScrollPane(gp);
			Scene scene = new Scene(scrollPane);
			
			
			stage.setTitle("Faculty");
			stage.setScene(scene);
			stage.show();
			
			
			
			break;
		}
		
		case "Staff": {
			
			GridPane gp = new GridPane();
			TextArea area = new TextArea(fileIO.database.printStaff());
			area.setEditable(false);
			
			
			
			gp.add(area, 0, 5, 5, 5);
			ScrollPane scrollPane = new ScrollPane(gp);
			Scene scene = new Scene(scrollPane);
			
			stage.setTitle("Staff");
			stage.setScene(scene);
			stage.show();
			
			
			break;
		}
		
		default:
			
		
		
		
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
