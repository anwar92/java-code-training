package anwar.com;

public class StringDemo {

    public static void main(String[] args) {
       // String literal - String constant pool
        // str1 is a reference to the object Hello
        // Hello is an object
        String str1 = "Hello";
        String str3 = "Hello"; // it doesn't create new object of Hello. it reference the same Hello object

        // String Object - Heap
        String str2 = new String("Welcome");

        String str4 = new String("Welcome");

        // Strings
        // it replace the original Hello object with the new one More Hello.
        str1 = "More Hello";

        System.out.println(str1);
    }

}
