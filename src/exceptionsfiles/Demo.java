package exceptionsfiles;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Program starts");
        doMath(12,0);
        System.out.println("Program continues");
    }

    public static void doMath(int a, int b){
        double c = answer(a,b);
        System.out.println(c);
    }

    public static double answer(int x, int y){
        return x/y;
    }
}
