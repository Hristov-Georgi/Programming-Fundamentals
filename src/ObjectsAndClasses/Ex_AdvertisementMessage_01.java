package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class Ex_AdvertisementMessage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeatTimes = Integer.parseInt(scanner.nextLine());

        Random random = new Random();

        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};


        for (int i = 1; i <= repeatTimes ; i++) {



            String outputMessage = String.format("%s %s %s – %s.",
                    phrases[random.nextInt(phrases.length)],
                    events[random.nextInt(events.length)],
                    authors[random.nextInt(authors.length)],
                    cities[random.nextInt(cities.length)]);

            System.out.println(outputMessage);



        }


    }
}
