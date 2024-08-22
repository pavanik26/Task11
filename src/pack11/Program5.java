package pack11;

import java.util.Arrays;

public class Program5 {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30};
						
		try {
			
			// Attempt to access an invalid index
            System.out.println("Accessing element at index 5: " + a[3]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        // StringIndexOutOfBoundsException Example
        try {
            String text = "Hello";
            // Attempt to access an invalid index
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
        }
	}
}

		