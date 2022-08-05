package Garcia_Ernesto;


import java.io.File;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class FileChoose extends Application {

	@Override
	public void start(Stage primaryStage)throws Exception{
		//you can find the path of the directory

		FileChooser filechooser = new FileChooser();
		filechooser.setTitle("FILE CHOOSER FOR JAVA");
		filechooser.showOpenDialog(primaryStage); //double check this to make sure this will work
		
//		File directory = new File("user.Documents/FINAL PROJECT");
//		filechooser.setInitialDirectory(directory);
		
		
		File file = filechooser.showOpenDialog(primaryStage);
		
		if(file != null) {
//			stage.display(file);
		}

	}



public static void main(String[] args) {
	Application.launch(args);
}
}


