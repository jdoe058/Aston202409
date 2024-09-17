public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.printf("%s кастует во %s\n", getName(), "врага");
    }
}
