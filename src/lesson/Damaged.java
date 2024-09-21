package lesson;

public class Damaged implements Mortal {
    // Жизнь - количество повреждений, причиняемых вашему персонажу до того, как он умрёт. (c) "Fallout 2"
    private int health;

    public Damaged(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    void takeDamage(int damage) {
        health -= damage;
        System.out.printf("\tПолучено %d урона, осталось %d жизни\n", damage, health);

    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
