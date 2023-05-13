package demopack;
import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        String fileName =("D:\\New folder\\abc.txt");

        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}




