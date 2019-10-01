package anwar.com;

class CarPolymorphism{
    void run(){
        System.out.println("Car is running");
    }
}
// Overloading
class Audi extends CarPolymorphism{
    void run(){System.out.println("Audi is running safely with 100km");}

    public static void main(String[] args){
        CarPolymorphism b =new Audi(); // upcasting
        b.run();
    }
}

