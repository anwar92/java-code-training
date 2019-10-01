package oop;


class Person {
  String name;
  String email;
  String phoneNumber;

  void walking(){
      System.out.println(name + " is walking");
  }

  void sleeping(){
      System.out.println(name + " is sleeping");
  }

  void reading(){
      System.out.println(name + " is reading");
  }

  void email(){
      System.out.println(name + " personal email is " + email);
  }

}


public class Demo {

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.name = "John";
        person1.email = "john@yahoo.com";

        person1.walking();
        person1.reading();
        person1.email();

        Person person2 = new Person();
        person2.name = "Sarah";
        person2.email = "sarah@gmail.com";

        person2.walking();
        person2.reading();
        person2.email();
       /* String name = "Anwar";
        String email = "anwar@nanoinfotech.net";
        String phoneNumber = "2016061348";
        //String activity1 = "walking";
        //String activity2 = "Sleeping";

        //System.out.println( name + " is " + activity1);
        //System.out.println( name + " is " + activity2);

        walking(name);


        String name2 = "Sarah";
        String emai2 = "sarah@nanoinfotech.net";
        String phoneNumber2 = "2016065555";
        //String activityx1 = "reading";
        //String activityx2 = "Sleeping";

        //System.out.println( name2 + " is " + activityx1);
        //System.out.println( name2 + " is " + activityx2);

        walking(name2);

    }
        static void walking(String name){
            System.out.println(name + " is walking");
        }

        */
    }
}
