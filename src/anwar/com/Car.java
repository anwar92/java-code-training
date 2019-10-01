package anwar.com;

public class Car {
    //States of the car :color, make, model, year
    //Behavior of the car speed, slow, fast, start the engine, stop the engine
    //object member variables
    //we present the state by variables

    // private primitive variable, you cannot access those variables out side of the Car class
    int speed;
    int gear;

    private String color;
    private String make;
    private String model;
    private int year;
    public String engine;
    //defining a constructor for the class Car with default values
    public Car(){
        this.speed = 0;
        this.gear = 0;
        System.out.println("Executing constructor without arguments");
    }

    public Car(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
        System.out.println("Executing constructor with arguments");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900) {
            this.year = year;
        }else {
            System.out.println("This year is not valid");
        }

    }

    // we present he behaviors by methods
    public void increaseSpeed(){
        System.out.println("increasing the speed");
    }

    // setter method that set a value of field or a variable
    // this is reference the main variable above
    // encapsulation using private variables to hide them from other classes and access them through getters and setters.
    // we can use the getters methods we can do more validation that we can not do if the variable is public
    public void setMake(String make){
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }
}