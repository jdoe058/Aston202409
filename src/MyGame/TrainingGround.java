package MyGame;

import java.util.Arrays;

public class TrainingGround {
    public static void main (String[] args) {
        Hero hero = new Warrior("Ilia", 200);

        Hero[] enemies = {
                new Warrior("Eugene", 60),
                new Mage("Ivan", 40),
                new Archer("Pete", 50),
        };

        enemies[2] = (new Warrior("",20));

        while (hero.isAlive() && Arrays.stream(enemies).allMatch(Damaged::isAlive)) {
            for (var enemy : enemies) {
                if (!enemy.isAlive()) {
                    continue;
                }
                hero.attackEnemy(enemy);
                enemy.attackEnemy(hero);

            }
        }
        System.out.println(hero.isAlive() ? "Вы победили" : "Вы проиграли");
    }
}
