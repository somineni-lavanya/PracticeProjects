package demopack;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		String fileName = ("D:\\New folder\\abc.txt");

		File file = new File(fileName);

		if (file.delete()) {
			System.out.println("File deleted successfully.");
		} else {
			System.out.println("Failed to delete the file.");
		}
	}
}
