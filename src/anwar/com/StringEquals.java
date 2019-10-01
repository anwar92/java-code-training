package anwar.com;

public class StringEquals {
    public static void main(String[ ] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        String s3 = "Hello";

        System.out.println(s1 + " equals " + s2 + "--> " +  s1.equals(s2)); //true

        System.out.println(s1 + " == " + s2 + " --> " + (s1 == s2)); //false
        System.out.println(s1 + " == " + s3+ " --> " + (s1 == s3)); //true

        System.out.println(s1.equals(s2)); // true

        System.out.println(s1 == s2); //false

        String s4 = new String("A");
        String s5 = new String("A");

        System.out.println(s4 == s5); // false
        System.out.println(s4.intern() == s5.intern()); // true


    }
}