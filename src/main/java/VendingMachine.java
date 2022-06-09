import java.util.Optional;

public class VendingMachine {

    private int money;

    public void inputMoney(int money) {
        this.money = money;
    }

    public int getBalance() {
        return money;
    }
    public Optional<Water> selectBeverage(String beverageName) {
        beverageName = beverageName.toUpperCase();
        if (beverageName.equals("WATER")) {
            money -= 1000;
            return Optional.of(new Water());
        }
        return Optional.empty();
    }
}
