package anwar.com;

import com.sun.security.jgss.GSSUtil;

public class Strings {
    public static void main(String[] args) {
        String bookTitle;
        String wordChoice = "Ring";

        bookTitle = " The lord of the Rings";

        if (bookTitle.contains(wordChoice)) {
            System.out.println("The book contains the word " + wordChoice);
        }

        String browser = "Chrome";
        // it won't print because Java is case sensitive and Chrome not equal chrome
        if (browser.equals("chrome")){
            System.out.println("The browser is Chrome");
        }
        // it will print the statement because the case sensitive is ignored
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("The browser is Chrome");
        }

        String firstName = "Anwar";
        String lastName = "Alkhalili";
        String SSN = "128789090";

        // Print the initials plus last 4 digits of SSN
        System.out.println(firstName.substring(0, 1) + SSN.substring(5,9));
        System.out.println("**********************");
        System.out.print(firstName.substring(0, 1));
        System.out.print(lastName.substring(0,1));
        System.out.print(SSN.substring(5));
        System.out.println("");
        System.out.println("*******************");

        boolean condition=true;
        // once the condition is met, the loop will exist
        while(condition) {
            System.out.println("loop");
            if (condition) {
                condition=false;
            }
        }

    }
}
