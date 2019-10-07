package anwar.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static void main(String[] args) throws FileNotFoundException {
        // this method will read data from a CSV file
        List<String[]> data = new ArrayList<String[]>();
        String filename = "C:\\javacode\\accounts.csv";
        String dataRaw;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((dataRaw = br.readLine()) != null) {
                String[] line = dataRaw.split(",");
                data.add(line);
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (String[] account : data){
            System.out.print("[ ");
            for (String field : account) {
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }
    }
}
