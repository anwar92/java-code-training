package anwar.com;

import java.sql.SQLIntegrityConstraintViolationException;

public class ClassDemo {
    public static void main(String[] args){
        //accessing private variables through getters and setters
        // Setters: sets values for fields and variables
        // Getters return value
        // if constructors are created in the Car class, it will get executed every time new Car object is created.
        Car bmw = new Car(); // Create and initialize the object
        bmw.setMake("BMW");
        System.out.println(bmw.getMake());

        Car benz = new Car();
        benz.setModel("C300");
        System.out.println(benz.getModel());

        Car fiat = new Car();
        fiat.setColor("red");
        System.out.println(fiat.getColor());

        //accessing public variables directly without getters and setters
        Car nissan = new Car();
        nissan.engine = "V8";
        System.out.println(nissan.engine);

        Car volvo = new Car();
        volvo.setYear(1800);
        System.out.println(volvo.getYear());
        //When the object is created, the constructor gets executed first
        Car c1 = new Car();
        c1.setMake("BMW");
        System.out.println(c1.getMake());

        Car c2 = new Car(10, 1);
        System.out.println(c2.speed);

        final int a = 500;
        System.out.println(a);

        int i = 10; // single value container
        Integer iRef = i;
        int j = iRef;

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // == operator compares values of objects
        if( str1 == str2){
            System.out.println("str1 == str2");
        } else{
            System.out.println("str1 != str2");
        }
        // equals comparing references of objects
        if(str1.equals(str2)){
            System.out.println("str1 equals str2");
        }else{
            System.out.println("str1 not equals str2");
        }

    }
}
