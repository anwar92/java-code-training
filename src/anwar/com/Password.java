package anwar.com;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) throws IOException {
        // this will read a text file and will retrieve passwords
        // password contains:
        // A numner
        // A letter
        // Special character (!@#)
        // user defined exceptions for the corresponding criteria
        // if the password doesn't meet the criteria, create and through the appropriate exception
        String filename = "C:\\javacode\\passwordfile.txt";
        File file = new File(filename);
        String[] passwords = new String[13];
        String passwordtext = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i=0 ; i < passwords.length; i++ ){
                passwords[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROR: File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR: Could not read file");
        }

        for (int i= 0; i < passwords.length; i++){

            passwordtext = passwords[i];
            try {
                if (Pattern.compile( "[0-9]" ).matcher( passwordtext ).find() & Pattern.compile( "[a-z]" ).matcher( passwordtext ).find() & passwordtext.contains("@") || passwordtext.contains("!") || passwordtext.contains("#")){
                    System.out.println("Valid Password found " + passwordtext);
                }else {
                    if (Pattern.compile("[0-9]").matcher(passwordtext).find()) {
                        //System.out.println("Password contains a number " + passwordtext );
                    } else {
                        throw new NoNumberException(passwordtext);
                    }
                    if (Pattern.compile("[a-z]").matcher(passwordtext).find()) {
                        //System.out.println("Password contains a letter " + passwordtext );
                    } else {
                        throw new NoLetterException(passwordtext);
                    }
                    if (passwordtext.contains("@") || passwordtext.contains("!") || passwordtext.contains("#")) {
                        //System.out.println("Password contains a letter " + passwordtext );
                    } else {
                        throw new NoSpecialCharacterException(passwordtext);
                    }
                }

            } catch (NoNumberException e) {
                System.out.println("ERROR: No Number Found in the password");
                System.out.println(e.toString());
            }
            catch (NoLetterException e) {
                System.out.println("ERROR: No Letter Found in the password");
                System.out.println(e.toString());
            }
            catch (NoSpecialCharacterException e) {
                System.out.println("ERROR: No Special Character Found in the password");
                System.out.println(e.toString());
            }

        }
    }
}

class NoNumberException extends Exception {
    String num;
    NoNumberException(String num) {
        this.num = num;
    }
    public String toString() {
        return ("NoNumberException: " + num);
    }
}

class NoLetterException extends Exception {
    String num;
    NoLetterException(String num) {
        this.num = num;
    }
    public String toString() {
        return ("NoLetterException: " + num);
    }
}

class NoSpecialCharacterException extends Exception {
    String num;
    NoSpecialCharacterException(String num) {
        this.num = num;
    }
    public String toString() {
        return ("NoSpecialCharacterException: " + num);
    }
}

