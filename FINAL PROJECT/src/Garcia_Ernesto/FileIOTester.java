package Garcia_Ernesto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIOTester {

	public static void main(String[]args) throws java.io.IOException, FileNotFoundException, PhoneNumberFormatException{
				
		
		
		
		AddingAndRemovingPeople ar = new AddingAndRemovingPeople();	
		
		
//		ar.db.readData(new File("DataBaseFiles/database_files.csv"));
		
		
		ar.addPerson();
		
		ar.makePhoneNumbers();
		
		ar.db.takeInFile();
		
		ar.db.printPeople();
		
		System.out.println(ar.db.database.toString());
		
		
		
		
	}

}




