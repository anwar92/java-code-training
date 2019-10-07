package anwar.com;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        // create a collection
        ArrayList<String> cities = new ArrayList();
        // add some elements
        cities.add("Cleveland");
        cities.add("New York");
        cities.add("Miami");
        cities.add("New Orleans");

        for (String city: cities) {
            System.out.println(city);
        }
        int size = cities.size();
        System.out.println("there are "+ size + " elements in the collection");
        // retrieve specific element
        System.out.println(cities.get(0));
        // remove a specific element from the collection
        cities.remove(1);
        size =cities.size();
        System.out.println(cities.remove(0));
        System.out.println("there are "+ size + " elements in the collection");
        for (String city: cities) {
            System.out.println(city);
        }
    }
}
