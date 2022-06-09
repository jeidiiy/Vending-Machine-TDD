import beverage.Beverage;
import machine.VendingMachine;
import org.junit.jupiter.api.Test;

import static beverage.EBeverage.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTests {

    @Test
    void testGetWater() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockUp(WATER);
        vendingMachine.inputMoney(1000);
        Beverage water = vendingMachine.selectBeverage(WATER);
        assertEquals(water.getName(), "water");
        assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    void testGetCoke() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockUp(COKE);
        vendingMachine.inputMoney(1200);
        Beverage coke = vendingMachine.selectBeverage(COKE);
        assertEquals(coke.getName(), "coke");
        assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    void testGetSprite() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockUp(SPRITE);
        vendingMachine.inputMoney(1100);
        Beverage sprite = vendingMachine.selectBeverage(SPRITE);
        assertEquals(sprite.getName(), "sprite");
        assertEquals(0, vendingMachine.getBalance());
    }
}
