package demopack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {
	public static void main(String[] args) {
		String fileName = ("D:\\New folder\\abc.txt");
		String newText = "Updated content";

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
				BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

			StringBuilder content = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}

			// Update the content as needed
			String updatedContent = content.toString().replace("Hello, World!", newText);

			// Write the updated content back to the file
			writer.write(updatedContent);

			System.out.println("File updated successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
