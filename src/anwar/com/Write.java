package anwar.com;

import java.io.*;

public class Write {
    public static void main(String[] args) throws IOException {
        // define file (path) that we want to read
        String filename = "C:\\javacode\\writetofile.txt";
        String message = "I am writing data that will be placed to a file";
        // create the file in java
        File file = new File(filename);

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(message);
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found: " + filename);
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("ERROR: Couldn not write the data: " + filename);
            e.printStackTrace();
        } finally {
            System.out.println("Finished writing to the file");
        }
        System.out.println("Closing the filewriter");

    }
}
