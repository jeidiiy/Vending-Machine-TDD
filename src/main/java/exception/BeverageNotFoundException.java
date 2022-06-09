package exception;

public class BeverageNotFoundException extends RuntimeException {
    public BeverageNotFoundException(String beverage) {
        super("Not found beverage.Beverage: " + beverage);
    }
}
