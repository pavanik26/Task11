package pack11;

import java.util.Scanner;

public class Program6 {
	   
    	
	static void validatePassword(String pwd) throws InvalidPasswordException
	{
	  // Simulated correct password
      String correctPassword = "password123";
	
		if(!pwd.equals(correctPassword))
		{
			throw new InvalidPasswordException("Error: Incorrect password.");
		}
		
		else
		{
			System.out.println("Login success");
		}
	}
	public static void main(String[] args) {
		
	 	
       Scanner scanner = new Scanner(System.in);     
        
        try {
            // Read age from the user
            System.out.print("Enter your password: ");
            String pwd = scanner.nextLine();
            
            // Validate the age
            validatePassword(pwd);
		}
		catch (InvalidPasswordException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

}
}
