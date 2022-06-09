package exception;

public class BeverageStockIsNotExistException extends RuntimeException {
    public BeverageStockIsNotExistException(String beverageName) {
        super("This beverage.Beverage's stock is not exists: " + beverageName);
    }
}
