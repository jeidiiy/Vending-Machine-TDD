public class BeverageStockIsNotExistException extends RuntimeException {
    public BeverageStockIsNotExistException(String beverageName) {
        super("This Beverage's stock is not exists: " + beverageName);
    }
}
