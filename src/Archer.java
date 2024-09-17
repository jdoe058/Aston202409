public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.printf("%s стреляет во %s\n", getName(), "врага");
    }
}
