package MyGame;

abstract public class Hero extends Damaged {
    final private String name;

    public Hero(String name, int health) {
        super(health);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void attackEnemy(Damaged enemy);
}