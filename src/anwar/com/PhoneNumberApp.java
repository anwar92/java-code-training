package anwar.com;

import java.io.*;

public class PhoneNumberApp {
    public static void main(String[] args) throws IOException {
        // this will read a text file and will retrieve phone number
        // valid phone number
            // 10 digits long
            // area code cannot start in 0 or 9
            // there can be 911 in the phone
        String filename = "C:\\javacode\\phonenumber.txt";
        File file = new File(filename);
        String[] phoneNums = new String[8];
        String phoneNum = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i=0 ; i < phoneNums.length; i++ ){
                phoneNums[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROR: File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR: Could not read file");
        }
        for (int i= 0; i < phoneNums.length; i++){

            phoneNum = phoneNums[i];
            try {
                if (phoneNum.length() != 10) {
                    throw new TenDigitsException(phoneNum);
                }
                if (phoneNum.substring(0, 1).equals("0") || phoneNum.substring(0, 1).equals("9")) {
                    throw new AreaCodeException(phoneNum);
                }
                for (int n = 0; n < phoneNum.length() - 2; n++) {
                    if (phoneNum.substring(n, (n + 1)).equals("9")) {
                        if (phoneNum.substring(n + 1, n + 3).equals("11")) {
                            throw new EmergencyException(phoneNum);
                        }
                    }
                }
                System.out.println(phoneNum);
            } catch (TenDigitsException e) {
                System.out.println("ERROR: phone number is not 10 digits");
                System.out.println(e.toString());
            } catch (AreaCodeException e) {
                System.out.println("ERROR: Phone number has invalid area code");
                System.out.println(e.toString());
            } catch (EmergencyException e) {
                System.out.println("ERROR: Invalid 911 sequence found");
                System.out.println(e.toString());
            }
        }


    }
}

class TenDigitsException extends Exception {
    String num;
    TenDigitsException(String num) {
        this.num = num;
    }
    public String toString() {
        return ("TenDigitsException: " + num);
    }
}
class AreaCodeException extends Exception {
    String num;
    AreaCodeException(String num) {
        this.num = num;
    }
    public String toString() {
        return ("AreaCodeException: " + num);
    }
}

class EmergencyException extends Exception{
    String num;
    EmergencyException(String num) {
        this.num = num;
    }
    public String toString() {
        return ("EmergencyException: " + num);
    }
}
