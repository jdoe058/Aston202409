public class TrainingGround {
    public static void main (String[] args) {
        Hero[] heroes = {
                new Warrior("Eugene"),
                new Mage("Ivan"),
                new Archer("Pete"),
        };

        for (var hero : heroes) {
            hero.attackEnemy();
        }
    }
}
