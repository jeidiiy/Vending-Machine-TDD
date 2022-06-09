public class Coke implements Beverage {

    private final String name;

    public Coke() {
        this.name = "coke";
    }

    @Override
    public String getName() {
        return name;
    }
}
