import java.util.*;

public class Main {
    static Scanner INPUT = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Double> cityTemps = new HashMap<>();
        String userInput = "";

        while (!userInput.equals("END")) {
            System.out.println("Enter a city name:");
            userInput = INPUT.next();

            if (!userInput.equals("END")) {
                cityTemps.put(userInput, null);
            }
        }

        for (String city : cityTemps.keySet()) {
            System.out.println("Enter temperatures for the next five days in " + city);
            double temps = 0;

            for (int i = 0; i < 5; i++) {
                String temp = INPUT.next();
                temps += Double.parseDouble(temp) / 5.0;
            }

            cityTemps.put(city, temps);
        }

        System.out.println(cityTemps);
    }
}