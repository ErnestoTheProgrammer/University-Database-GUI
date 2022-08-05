package Garcia_Ernesto;

import javafx.application.Application;
import javafx.stage.Stage;

public class RemovePerson extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		
		
		
	}
	
	public void removePerson(DatabaseFileIO fileIO, String number, Stage primaryStage) {
		
		UI ui = new UI();
		
		fileIO.database.remove(Integer.parseInt(number)-1);
		
		ui.start(primaryStage);
		
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}

}
