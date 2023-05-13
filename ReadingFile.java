package demopack;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	public class ReadingFile {
	
	    public static void main(String[] args) {
	        String fileName = ("D:\\New folder\\abc.txt");

	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}


