package anwar.com;

public class Cities {
    public static void main (String[] args){
        // Declare and define an array
        String[] cities = {"New York", "Miami", "Dallas"};
        System.out.println(cities[0]);
        System.out.println(cities[2]);
        System.out.println(cities.length);

        String[] states = new String[5];
        System.out.println(states.length);
        states[0] = "New Jersey";
        states[1] = "New York";
        states[2] = "Alabama";
        states[3] = "Virginia";
        states[4] = "Texas";
        System.out.println(states[0]);

        String[] countries;
        countries = new String[2];
        countries[0] = "USA";
        countries[1] = "Canada";
        // countries[2] = "China";
        System.out.println("*******************");
        System.out.println(countries.length);

        int i = 0;
        // do loop: enters the loop then tests the condition
        do {
            System.out.println(countries[i]);
            i = i + 1;
        } while (i < 2);
        System.out.println("*****************");
        // while loop: test the condition first then enters loop
        int a = 0;
        while (a < 3) {
            System.out.println("State at array position " + a + " is " + states[a]);
            a++;
        }
        System.out.println("************************");
        for ( int x = 0; x < 5; x++){
            System.out.println("State at array position " + x + " is " + states[x]);
        }
    }
}
