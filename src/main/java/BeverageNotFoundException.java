public class BeverageNotFoundException extends RuntimeException {
    public BeverageNotFoundException(String beverage) {
        super("Not found Beverage: " + beverage);
    }
}
