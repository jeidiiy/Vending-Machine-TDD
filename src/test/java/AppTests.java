import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTests {

    @Test
    void testGetWater() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockUp("water");
        vendingMachine.inputMoney(1000);
        Beverage water = vendingMachine.selectBeverage("water");
        assertEquals(water.getName(), "water");
        assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    void testGetCoke() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockUp("coke");
        vendingMachine.inputMoney(1200);
        Beverage coke = vendingMachine.selectBeverage("coke");
        assertEquals(coke.getName(), "coke");
        assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    void testGetSprite() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockUp("sprite");
        vendingMachine.inputMoney(1100);
        Beverage sprite = vendingMachine.selectBeverage("sprite");
        assertEquals(sprite.getName(), "sprite");
        assertEquals(0, vendingMachine.getBalance());
    }
}
