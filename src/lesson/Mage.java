package lesson;

public class Mage extends Hero{
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Damaged enemy) {
        int damage = (int)(Math.random()*11);
        System.out.printf("%s кастует во %s\n", getName(), "врага");
        enemy.takeDamage(damage);
    }
}
