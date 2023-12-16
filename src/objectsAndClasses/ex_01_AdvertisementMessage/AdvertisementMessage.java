package objectsAndClasses.ex_01_AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        String[] phraseArr = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        String[] eventsArr = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authorsArr = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cityArr = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();

        for (int i = 1; i <= numberOfMessages ; i++) {

             String phrase = phraseArr[rnd.nextInt(phraseArr.length)];
             String event = eventsArr[rnd.nextInt(eventsArr.length)];
             String author = authorsArr[rnd.nextInt(authorsArr.length)];
             String city = cityArr[rnd.nextInt(cityArr.length)];

             System.out.printf("%s %s %s - %s%n", phrase, event, author, city);

        }


    }
}
