package pack11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program8 {
	
	public static void main(String[] args) {
        // Path to the file to read
        String filePath = "example.txt";
        
        // Attempt to read the file
        try {
            // Create a File object
            File file = new File(filePath);
            
            // Create a FileReader and BufferedReader to read the file
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // Read and display the content of the file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close the readers
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file does not exist
            System.out.println("Error: The file \"" + filePath + "\" was not found.");
        } catch (IOException e) {
            // Handle other I/O exceptions
            System.out.println("Error: An I/O error occurred while reading the file.");
        } finally {
            // Optionally perform any necessary cleanup here
            System.out.println("File reading operation completed.");
        }
    }

}
