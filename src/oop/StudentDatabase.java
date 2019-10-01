package oop;

class Student {

    String name;
    String ssn;
    private String phone;
    private String city;
    private String state;
    private static String id = "XYZ";
    int x = (int)(Math.random() * 9000)+1000;

    // Generate a user ID that is combination of Static ID, random 4-digit number between 1000
    // and 9000, and last 4 of SSN

    Student(String name, String ssn){
        System.out.println("New Student Record");
        System.out.println("*******************************");
        System.out.println("Student Name: " + name);
        System.out.println("Student SSN: " + ssn);
        System.out.println("Student email: " + name.toLowerCase().replaceAll("\\s", "") + "@somemail.com");
        System.out.println("Student ID: " + id + x + ssn.substring(5));
    }

    Student() {

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    // define methods

    public void enroll(){

    }

    public void pay(){

    }

    public void checkBalance(){

    }

    public String toString(){
        return null;
    }

    public void showCourses(){

    }

}

public class StudentDatabase {

    public static void main(String[] args) {
        Student str = new Student("John Doe", "987654321");
        System.out.println("*******************************");
        Student str2 = new Student("Sarah Smith", "0139871254");
        System.out.println("*******************************");
    }
}

/*
    SDET University
Lab 2 – Object-Oriented Programming
        Create a Student Database with the following attributes:
         New Student constructor that takes name and SSN in the arguments
         Automatically create an email ID based on the name
         Set a private static ID
         Generate a user ID that is combination of Static ID, random 4-digit number between 1000
        and 9000, and last 4 of SSN
         Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
         Use encapsulation to set variables (phone, city, state)
 */