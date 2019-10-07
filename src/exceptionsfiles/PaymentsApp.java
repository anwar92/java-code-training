package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {
    public static void main(String[] args) {
        //1. ask the user for payment
        System.out.print("Enter the payment amount:");
        //2. get the amount test the value
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        System.out.println(amount);


    }
}
