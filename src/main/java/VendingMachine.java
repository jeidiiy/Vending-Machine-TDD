import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class VendingMachine {

    private final Map<String, Queue<Beverage>> stock = new HashMap<>();

    private int money;

    public void inputMoney(int money) {
        this.money += money;
    }

    public void stockUp(String beverageName) {
        if (isNotExistStock(beverageName)) {
            stock.put(beverageName, new LinkedList<>());
        }
        Queue<Beverage> beverages = stock.get(beverageName);
        beverages.add(BeverageFactory.create(beverageName));
    }

    private boolean isNotExistStock(String beverageName) {
        Queue<Beverage> beverages = stock.get(beverageName);
        return beverages == null || beverages.size() == 0;
    }

    private Beverage getBeverage(String beverageName) {
        beverageName = beverageName.toLowerCase();
        if (isNotExistStock(beverageName)) {
            throw new BeverageStockIsNotExistException(beverageName);
        }
        Queue<Beverage> beverages = stock.get(beverageName);
        return beverages.poll();
    }

    public int getBalance() {
        return money;
    }

    public Beverage selectBeverage(String beverageName) {
        beverageName = beverageName.toLowerCase();
        Beverage beverage = getBeverage(beverageName);
        money -= beverage.getPrice();
        return beverage;
    }
}
