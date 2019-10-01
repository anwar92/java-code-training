package oop;

public class BankAccount {
    // define variables
    String accountNumber;

    // static belongs to the class not the object instance
    // final constant often static final
    static final String routingNumber = "013245676";
    String name;
    String ssn;
    String accountType;
    // constructor definition unique methods
      // 1. they are used to define / setup / instantiate an object
      // 2. constructors are implicitly called upon instantiation
      // 3. the same name as the class itself
      // 4. constructors have no return type - no void - no string - no double ...etc

    BankAccount(){
        System.out.println("New account created");
    }

    // overloading call same method name with different arguments
    BankAccount(String accountType) {
        System.out.println("New Account: " + accountType);
    }

    BankAccount(String accountType, double initDeposit){
        System.out.println("New Account: " + accountType);
        System.out.println("Initial Deposit of $" + initDeposit);
    }

    // define methods
    void deposit(){

    }

    void checkBalance(){

    }
    void getStatus(){

    }
}
