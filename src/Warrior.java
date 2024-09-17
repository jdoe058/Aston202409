public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.printf("%s рубит %s\n", getName(), "врага");
    }
}
