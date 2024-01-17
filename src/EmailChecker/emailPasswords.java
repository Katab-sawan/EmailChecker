package EmailChecker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class emailPasswords {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String file = "passwordDatabase.txt" ;

		FileReader myFile = new FileReader ("C:\\Users\\csmksawa\\eclipse-workspace\\EmailChecker\\passwordDatabase.txt");
		//This is the vs code version
		//Another version
		Scanner userInput = new Scanner (myFile);
		 Scanner scan = new Scanner (System.in);
       
        System.out.println("Enter your email");
        String userEmail = userInput.next();
      
        String userPass = userInput.next();
        System.out.println("Enter your password");
        
        String fileEmail = "";
        String filePass = "";
        
      
		while(scan.hasNext()) {
			fileEmail = scan.next();
			filePass = scan.next();
			
			if(userEmail.equals(fileEmail)) {
				System.out.println("Email Found!");
				if(userPass.equals(filePass)) {
					System.out.println("logged in");
				}   else {
						System.out.println("login Failed");
					}
        	}
        }
		
       

        
       }

	
	}


	
	



