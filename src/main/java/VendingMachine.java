import java.util.Optional;

public class VendingMachine {

    private int money;

    public void inputMoney(int money) {
        this.money = money;
    }

    public int getBalance() {
        return money;
    }
    public Optional<Beverage> selectBeverage(String beverageName) {
        beverageName = beverageName.toUpperCase();
        if (beverageName.equals("WATER")) {
            money -= 1000;
            return Optional.of(new Water());
        } else if (beverageName.equals("COKE")) {
            money -= 1200;
            return Optional.of(new Coke());
        } else if (beverageName.equals("SPRITE")) {
            money -= 1100;
            return Optional.of(new Sprite());
        }
        return Optional.empty();
    }
}
