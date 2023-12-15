package finalExamPreparation;

import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        Map<String, String> piecesComposerMap = new LinkedHashMap<>();
        Map<String, String> piecesKeyMap = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfPieces; i++) {
            String[] piecesArr = scanner.nextLine().split("\\|");    //{piece}|{composer}|{key}
            String piece = piecesArr[0];
            String composer = piecesArr[1];
            String key = piecesArr[2];

            piecesComposerMap.put(piece, composer);
            piecesKeyMap.put(piece, key);
        }


        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String command = input.split("\\|")[0];
            String inputPiece = input.split("\\|")[1];

            switch (command) {

                case "Add":      //Add|{piece}|{composer}|{key}

                    if (piecesComposerMap.containsKey(inputPiece) && piecesKeyMap.containsKey(inputPiece)) {
                        System.out.printf("%s is already in the collection!%n", inputPiece);
                    } else {
                        piecesComposerMap.put(inputPiece, input.split("\\|")[2]);
                        piecesKeyMap.put(inputPiece, input.split("\\|")[3]);
                        System.out.printf("%s by %s in %s added to the collection!%n"
                                , inputPiece, input.split("\\|")[2], input.split("\\|")[3]);
                    }


                    break;
                case "Remove":    //Remove|{piece}

                    if (piecesComposerMap.containsKey(inputPiece) || piecesKeyMap.containsKey(inputPiece)) {
                        piecesComposerMap.remove(inputPiece);
                        piecesKeyMap.remove(inputPiece);
                        System.out.printf("Successfully removed %s!%n", inputPiece);

                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", inputPiece);
                    }

                    break;
                case "ChangeKey":   //ChangeKey|{piece}|{new key}

                    if (piecesKeyMap.containsKey(inputPiece)) {
                        piecesKeyMap.put(inputPiece, input.split("\\|")[2]);
                        System.out.printf("Changed the key of %s to %s!%n", inputPiece, input.split("\\|")[2]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", inputPiece);
                    }

                    break;
            }

            input = scanner.nextLine();
        }


        piecesComposerMap.entrySet().forEach(entry ->
                System.out.printf("%s -> Composer: %s, Key: %s%n",
                        entry.getKey(), entry.getValue(), piecesKeyMap.get(entry.getKey())));
    }
}
