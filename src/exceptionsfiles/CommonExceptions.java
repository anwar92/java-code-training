package exceptionsfiles;

public class CommonExceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("cannot divid by zero");
            System.out.println(e.toString());
        }
        System.out.println("program is closing");
        String[] states = {"CA", "TX", "FL", "NY"};

        for (int i=0; i <= states.length; i++){
            try {
                System.out.println(states[i]);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index oustide of array domain");
                System.out.println(e.toString());
            } finally{
            System.out.println("Iterating through array");
        }
        }
        System.out.println("Program is closing");

    }
}

