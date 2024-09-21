package lesson;

public class Archer extends Hero{
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Damaged enemy) {
        int damage = (int)(Math.random()*10);
        System.out.printf("%s стреляет во %s\n", getName(), "врага");
        enemy.takeDamage(damage);
    }
}
