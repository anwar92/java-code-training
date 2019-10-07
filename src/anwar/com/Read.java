package anwar.com;

import java.io.*;

public class Read {
    public static void main(String[] args) throws IOException {
        // define file (path) that we want to read
        String filename = "C:\\javacode\\readfile.txt";
        String text = null;
        // create the file in java
        File file = new File(filename);
        // open file
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
            // read the file
            text = br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found: " + filename);
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("ERROR: Couldn not read the data: " + filename);
            e.printStackTrace();
        } finally {
            System.out.println("Finished reading the file");
        }
        System.out.println(text);

    }
}
