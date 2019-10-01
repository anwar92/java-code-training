package anwar.com;

public class Main {

    static byte byteVariable;
    static int intVariable;

    public static void main(String[] args) {
	// write your code here

        System.out.println("hello world");
        System.out.println("byteVariable = " + byteVariable);
        System.out.println("intVariable = " + intVariable);
        anotherMethod();
    }

    public static void anotherMethod(){
        System.out.println("byteVariable2 = " + byteVariable);
    }
}
