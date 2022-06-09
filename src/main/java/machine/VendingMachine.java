package machine;

import beverage.Beverage;
import beverage.BeverageFactory;
import beverage.EBeverage;
import exception.BeverageStockIsNotExistException;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class VendingMachine {

    private final Map<EBeverage, Queue<Beverage>> stock = new EnumMap<>(EBeverage.class);

    private int money;

    public void inputMoney(int money) {
        this.money += money;
    }

    public void stockUp(EBeverage eBeverage) {
        if (isNotExistStock(eBeverage)) {
            stock.put(eBeverage, new LinkedList<>());
        }
        Queue<Beverage> beverages = stock.get(eBeverage);
        beverages.add(BeverageFactory.create(eBeverage));
    }

    private boolean isNotExistStock(EBeverage eBeverage) {
        Queue<Beverage> beverages = stock.get(eBeverage);
        return beverages == null || beverages.size() == 0;
    }

    private Beverage getBeverage(EBeverage eBeverage) {
        if (isNotExistStock(eBeverage)) {
            throw new BeverageStockIsNotExistException(eBeverage.name());
        }
        Queue<Beverage> beverages = stock.get(eBeverage);
        return beverages.poll();
    }

    public int getBalance() {
        return money;
    }

    public Beverage selectBeverage(EBeverage eBeverage) {
        Beverage beverage = getBeverage(eBeverage);
        money -= beverage.getPrice();
        return beverage;
    }
}
