package anwar.com;

import java.util.*;

public class ArrayDemo {

    public static void main(String[] args) {

         int[] myArray1 = {100, 90};
         myArray1[0] = 100;
         myArray1[1] = 90;
         System.out.println(myArray1[0]);
         System.out.println(myArray1[1]);

         int[] myArray2 = new int[10];
            myArray2[0] = 99;
            myArray2[1] = 55;
            myArray2[2] = 44;
            myArray2[3] = 33;

        System.out.println(myArray2[0]);
        System.out.println(myArray2[1]);
        System.out.println(myArray2[2]);

        String[] myString = {"yes", "no", "maybe"};

        System.out.println(myString[0]);
        System.out.println(myString[1]);

        int len1 = myArray1.length;
        int len2 = myArray2.length;
        int len3 = myString.length;

        System.out.println(len1);
        System.out.println(len2);
        System.out.println(len3);

        for (int i=0; i < len2; ++i) {
            System.out.println(myArray2[i] + 1);
        }

        Arrays.sort(myString); // after sort: maybe, no , yes
        for (int i=0; i < len3; ++i) {
            System.out.println(myString[i]);
        }


/*
        int[] myIntArray1 = {100, 90};
		/*myIntArray1 = new int[10];

		myIntArray1[0] = 100;
		myIntArray1[1] = 90;*/
/*
        System.out.println("0 index: " + myIntArray1[0]);
        System.out.println("1st index: " + myIntArray1[1]);
        //System.out.println("2nd index: " + myIntArray1[2]);

        String[] myStringArray1 = {"bmw", "audi", "honda"};
        System.out.println("0 index: " + myStringArray1[0]);
        System.out.println("1st index: " + myStringArray1[1]);
        System.out.println("2nd index: " + myStringArray1[2]);

        int len1 = myIntArray1.length;
        int len2 = myStringArray1.length;

        System.out.println("Int array length: " + len1);
        System.out.println("String array length: " + len2);

        for (int i = 0; i < len1; i++){
            System.out.println(myIntArray1[i]);
        }

        Arrays.sort(myIntArray1);

        for (int i = 0; i < len1; i++){
            System.out.println(myIntArray1[i]);
        }

        //System.arraycopy(src, srcPos, dest, destPos, length);
*/
    }

}
