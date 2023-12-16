package finalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfHeroes = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> heroHP = new LinkedHashMap<>();
        Map<String, Integer> heroMP = new LinkedHashMap<>();

        for (int heroes = 1; heroes <= numberOfHeroes; heroes++) {

            String[] heroInfo = scanner.nextLine().split("\\s+");
            int HP = Integer.parseInt(heroInfo[1]);
            int MP = Integer.parseInt(heroInfo[2]);

            heroHP.put(heroInfo[0], HP);
            heroMP.put(heroInfo[0], MP);

        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split(" \\- ");
            String mainCommand = commands[0];

            switch (mainCommand) {

                case "CastSpell":    //CastSpell – {hero name} – {MP needed} – {spell name}"
                    String heroName = commands[1];
                    int neededMP = Integer.parseInt(commands[2]);
                    String spellName = commands[3];

                    if (heroMP.get(heroName) >= neededMP) {
                        int leftMP = heroMP.get(heroName) - neededMP;
                        heroMP.put(heroName, leftMP);

                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                heroName, spellName, leftMP);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }

                    break;

                case "TakeDamage":   //TakeDamage – {hero name} – {damage} – {attacker}

                    String name = commands[1];
                    int damage = Integer.parseInt(commands[2]);
                    String attackerName = commands[3];

                    int HPleft = heroHP.get(name) - damage;

                    if (HPleft <= 0) {

                        heroHP.remove(name);
                        heroMP.remove(name);
                        System.out.printf("%s has been killed by %s!%n", name, attackerName);

                    } else {
                        heroHP.put(name, HPleft);

                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                name, damage, attackerName, HPleft);

                    }
                    break;

                case "Recharge":     //Recharge – {hero name} – {amount}"
                    int amount = Integer.parseInt(commands[2]);
                    String nameOfHero = commands[1];

                    int increaseMP = heroMP.get(nameOfHero) + amount;
                    if (increaseMP > 200) {

                        System.out.printf("%s recharged for %d MP!%n", nameOfHero, 200 - heroMP.get(nameOfHero));
                        heroMP.put(nameOfHero, 200);

                    } else {
                        heroMP.put(nameOfHero, increaseMP);
                        System.out.printf("%s recharged for %d MP!%n", nameOfHero, amount);
                    }

                    break;

                case "Heal":   //Heal – {hero name} – {amount}

                    String nAmE = commands[1];
                    int healAmount = Integer.parseInt(commands[2]);

                    int increasedHP = heroHP.get(nAmE) + healAmount;

                    if (increasedHP > 100) {

                        System.out.printf("%s healed for %d HP!%n", nAmE, 100 - heroHP.get(nAmE));
                        heroHP.put(nAmE, 100);

                    } else {
                        heroHP.put(nAmE, increasedHP);
                        System.out.printf("%s healed for %d HP!%n", nAmE, healAmount);
                    }

                    break;

            }

            input = scanner.nextLine();
        }

        heroMP.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.printf(" HP: %d%n", heroHP.get(entry.getKey()));
            System.out.printf(" MP: %d%n", entry.getValue());
        });

    }
}
