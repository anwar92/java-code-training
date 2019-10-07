package anwar.com;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        // Define the collection
        // Set won't display duplicates (dublicates will be removed
        // Set doesn't retain order 

        Set<String> animals = new HashSet<String>();

        // adding element
        animals.add("dog");
        animals.add("pig");
        animals.add("cat");
        animals.add("lion");
        animals.add("cat");
        System.out.println(animals);

        Set<String> farmanimals = new HashSet<String>();
        farmanimals.add("cow");
        farmanimals.add("horse");
        farmanimals.add("chickens");
        farmanimals.add("dog");
        farmanimals.add("cat");
        System.out.println(farmanimals);

        // what is the shared properties between the two sets
        Set<String> intersectionSet = new HashSet<String>(animals);
        System.out.println(intersectionSet);

        intersectionSet.retainAll(farmanimals);
        System.out.println("The intersection is: " + animals);

        // what is the union
        Set<String> unionSet = new HashSet<String>(farmanimals);
        unionSet.addAll(animals);
        System.out.println("The union is: " + unionSet);

        // what is the difference
        Set<String> differenceSet = new HashSet<String>(animals);
        differenceSet.removeAll(farmanimals);
        System.out.println("The difference is :" + differenceSet);
    }
}
