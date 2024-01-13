package EmailChecker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public final class loginSystem {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader myFile = new FileReader("C:\\Users\\csmksawa\\eclipse-workspace\\EmailChecker\\passwordDatabase.txt");
		Scanner scan = new Scanner(myFile);
		
		Scanner userInfo = new Scanner(System.in);
		System.out.println("Enter your Email");
		String userEmail = userInfo.next();
		System.out.println("Enter you password");
		String userPass = userInfo.next();
			
		String fileEmail = "";
        String filePass = "";
        
        while(scan.hasNext()) {
        	fileEmail = scan.next();
        	filePass = scan.next();
        	
        	if (userEmail.equals(fileEmail)) {
        	    System.out.println("Your email is correct");
        	    if(userPass.equals(filePass)) {
        	    System.out.println("Your password is correct");
        	     }
        	}   if (userEmail.equals(fileEmail) && (userPass.equals(filePass))) {
        	    	 System.out.println("Logged in!");
        	    } else {
      	    		 System.out.println("Password is incorrect.Please try again");
        	    	
        	    	 }
        	     }
        	     }

        	
        	}
      	