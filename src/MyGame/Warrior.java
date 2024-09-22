package MyGame;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Damaged enemy) {
        int damage = (int)(Math.random()*10);
        System.out.printf("%s рубит %s\n", getName(), "врага");
        enemy.takeDamage(damage);
    }
}
