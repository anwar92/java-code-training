package anwar.com;

import java.util.*;

public class RandomCode {
    public static void main(String[] args) {

        // ArrayList : resizable array

        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        Collections.sort(cars);  // Sort cars
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println( cars.get(2));
        System.out.println(cars.remove(0));
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        // Array
        String[] trucks = {"Volvo", "BMW", "Ford", "Mazda"};
        trucks[0] = "Opel";
        System.out.println(trucks[0]);
        // Now outputs Opel instead of Volvo
        for (int i=0; i < trucks.length ; i++){
            System.out.print(trucks[i] + " ");
        }
        System.out.println("******************");
        //HashMap

        Map capitals = new HashMap();
        capitals.put("Palestine", "Jerusalem");
        capitals.put("Jordan", "Amman");
        capitals.put("Iraq", "Bagdad");
        capitals.put("Iraq", "Bagdad");
        capitals.put("", "maqadisho");
        System.out.println(capitals);
        // HashTable
        Hashtable<String, String> fruit = new Hashtable<String, String>();
        fruit.put("banana", "yellow");
        fruit.put("apple", "red");
        fruit.put("kiwi", "green");
        fruit.put("", "black");
        System.out.println(fruit);



    }


}
