package Garcia_Ernesto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class UI extends Application {
	
	Database dbase = new Database();
	DatabaseFileIO db = new DatabaseFileIO();

@Override
public void start(Stage primaryStage) {
	
	try {
		db.readData(selectFile());
	} catch (FileNotFoundException e1) {
		System.out.println("File Not Found Error");
	} catch (IOException e1) {
		e1.printStackTrace();
		
	} catch (PhoneNumberFormatException e1) {
		
		System.out.println("Incorrect format");
	}
	Button btn = new Button("CLICK TO BEGIN DATABASE");
	
	

	primaryStage.setScene(new Scene(btn, 250, 250)); //scene was not created on its own but instead inside of the primaryStage.setScene () method


		
	btn.setOnAction(e ->{
		
		
		ScrollPane scrollPane = new ScrollPane();		
		
		
		GridPane gPane = new GridPane();
		
		TextArea textArea = new TextArea(getAllPeople());
		textArea.setEditable(false);
		//play around with that method
		
				
		
		Button undoButton = new Button("MAIN MENU");
		Button addPerson = new Button("ADD PERSONS");
		Button selectFile = new Button("SELECT FROM FILE");
		Button statsFromFile = new Button("SHOW STATS");
		Button showType = new Button("SHOW TYPE");
		Button search = new Button("Search");
		Button remove = new Button("Remove");
		
		ChoiceBox<String> types = new ChoiceBox<>();
	
		types.getItems().addAll("Student", "Faculty", "Staff");
		types.getSelectionModel().clearAndSelect(0);
		
		
		gPane.add(types, 4, 0);
		gPane.add(undoButton, 0, 0);
		gPane.add(selectFile, 1, 0);
		gPane.add(statsFromFile, 2, 0);
		gPane.add(addPerson, 3, 0);
		gPane.add(showType, 7, 0);
		gPane.add(search, 9, 0);
		
		
		//gPane.setVheigt and Hheight for the gridPane
		
		
		gPane.add(textArea, 0, 6, 6, 6);
		gPane.add(remove, 0, 20);
		
		TextField searchBar = new TextField();
		gPane.add(searchBar, 8, 0);
		

		
		
		undoButton.setOnAction(undo ->{//action to go back to the main menu
			
			
			UI ui = new UI();
			ui.start(primaryStage);
			
			
			
		});
		
		addPerson.setOnAction(addP ->{//action to add another person to the database and into the file
						
			
			AddPersonButton ad = new AddPersonButton();
			
			ad.addAction(types, primaryStage, addPerson);
				
			
		});
		
		selectFile.setOnAction(selectF -> {//action to select file to read into the scrollPane
			
			
			
			UI ui = new UI();
			ui.start(primaryStage);
			
			
			
		});
		
		statsFromFile.setOnAction(addToF ->{
			
			AddPersonButton back = new AddPersonButton();
			
			
			
			GridPane gp = new GridPane();
			gp.setHgap(10);
			gp.setVgap(10);
			
			gp.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
			
			Label numOfStudents = new Label("Number of Students: " + db.database.getNumberOfStudents());
			gp.add(numOfStudents, 0, 0);
			
			Label numOfFaculty = new Label("Number of Faculty: " + db.database.getNumberOfFaculty());
			gp.add(numOfFaculty, 0, 1);
			
			Label numOfStaff = new Label("Number of Staff: " + db.database.getNumberOfStaff());
			gp.add(numOfStaff, 0, 2);
			
			Label numOfPeople = new Label("Number of total people: " + db.database.getNumberOfPeople());
			gp.add(numOfPeople, 0, 3);
			
			Button backButton = back.goBack(primaryStage);
			gp.add(backButton, 0, 4);
			
			Scene scene = new Scene(gp);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
		});
		
		showType.setOnAction(st -> {
			
			ShowDifferentType personType = new ShowDifferentType();
			
			personType.showType(db, types);
			
			
			
			
		});
		
		search.setOnAction(srch -> {
			
			SearchClass sc = new SearchClass();
			sc.searchMethod(db, searchBar.getText());
			searchBar.clear();
			
		});
		
		remove.setOnAction(rmv -> {
			
			RemovePerson rp = new RemovePerson();
			rp.removePerson(db, searchBar.getText(), primaryStage);
			
		});
		
		scrollPane.setContent(gPane);
		
		Scene scene = new Scene(scrollPane, 900, 500);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	

		
	});
	
	
	
	primaryStage.show();
	
		
}

public File selectFile() {
	
	FileChooser fileChooser = new FileChooser();

	fileChooser.setTitle("Selecting Files");

	File file = fileChooser.showOpenDialog(new Stage());
	
	return file;
	
}

public String getAllPeople() {
	
	
	return db.database.toString();
	
}
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
