public class Water implements Beverage {

    private final String name;

    public Water() {
        this.name = "water";
    }

    @Override
    public String getName() {
        return name;
    }
}
