package anwar.com;

public class Arrays {
    public static void main(String[] args) {
        String[] alphabets = {"a", "b", "c", "d"};

        for (int i = 0; i < alphabets.length; i++) {
            System.out.print(alphabets[i] + " ");
        }

        System.out.println("");

        for (String letter : alphabets) {
            System.out.print(letter + " ");
        }
        // print each list backward
        String[][] matrix = { {"a","b","c"},
                {"e","f","g"},
                {"h","i","j"} };

        for (String[] list : matrix) {
            for (int i=list.length-1;i>=0;i--) {
                System.out.print(list[i]);
            }
        }
    }
}