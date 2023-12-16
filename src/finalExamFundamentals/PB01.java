package finalExamFundamentals;


import java.util.Scanner;

public class PB01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String spell = scanner.nextLine();
        StringBuilder spellName = new StringBuilder(spell);

        String commands = scanner.nextLine();
        while (!commands.equals("Abracadabra")) {
            String[] commandsArr = commands.split("\\s+");
            String spellCommand = commandsArr[0];

            switch (spellCommand) {

                case "Abjuration":
                    spell = spell.toUpperCase();
                    System.out.println(spell);

                    break;

                case "Necromancy":
                    spell = spell.toLowerCase();
                    System.out.println(spell);

                    break;

                case "Illusion":
                    int index = Integer.parseInt(commandsArr[1]);
                    String letter = commandsArr[2];
                    char newLetter = letter.charAt(0);
                    char oldLetter = spell.charAt(index);

                    if (index > spell.length() - 1 || index < 0) {
                        System.out.println("The spell was too weak.");

                    } else {
                        spellName.setCharAt(index, newLetter);
                        System.out.println("Done!");

                    }
                    spell = spellName.toString();

                    break;

                case "Divination":
                    String firstSubstring = commandsArr[1];
                    String secondSubstring = commandsArr[2];

                    if (spell.contains(firstSubstring)) {
                        spell = spell.replace(firstSubstring, secondSubstring);
                    }

                    break;

                case "Alteration":
                    String substring = commandsArr[1];

                    if (spell.contains(substring)) {
                        spell = spell.replace(substring, "");
                        System.out.println(spell);
                    }

                    break;

                default:
                    System.out.println("The spell did not work!");
            }

            commands = scanner.nextLine();

        }

    }
}
