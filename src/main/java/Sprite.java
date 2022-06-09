public class Sprite implements Beverage {

    private final String name;

    public Sprite() {
        this.name = "sprite";
    }

    @Override
    public String getName() {
        return name;
    }
}
