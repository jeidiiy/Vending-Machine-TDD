package exception;

public class BeverageNotFoundException extends RuntimeException {
    public BeverageNotFoundException() {
        super("Not found beverage. Check your Input");
    }
}
