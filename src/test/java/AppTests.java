import beverage.Beverage;
import machine.VendingMachine;
import org.junit.jupiter.api.Test;

import static beverage.EBeverage.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTests {

    @Test
    void testGetBeverage() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockUp(WATER);
        vendingMachine.inputMoney(1000);
        Beverage water = vendingMachine.selectBeverage(WATER);
        assertEquals(water.getName(), "water");
        assertEquals(0, vendingMachine.getBalance());
    }
}
