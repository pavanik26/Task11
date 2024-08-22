package pack11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program4 {
	
	
	public static void main(String[] args) {
	
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
				
		try 
		{
	     System.out.println("Enter value of first integer");
	     int a = Integer.parseInt(br.readLine());
		 System.out.println("Enter value of second integer");				
		 int b = Integer.parseInt(br.readLine());					
		 int ans=a/b;
		 System.out.println("result of division: " + ans);
		}
		catch (ArithmeticException e) {
            // Handle the case where the denominator is zero
            System.out.println("Error: Division by zero is not allowed.");
            
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
		
		
	}

}
