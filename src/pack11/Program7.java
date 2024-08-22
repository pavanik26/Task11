package pack11;

import java.util.Scanner;

public class Program7 {
	
	int age;
	
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("age less than 18");
		}
		
		else
		{
			System.out.println("age is greater than 18");
		}
	}
	public static void main(String[] args) {
		
      Scanner scanner = new Scanner(System.in);
        
        try {
            // Read age from the user
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            // Validate the age
            validateAge(age);
		}
		catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
		
	}

}
