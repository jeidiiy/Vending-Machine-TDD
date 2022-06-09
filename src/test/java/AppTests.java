import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class AppTests {

    @Test
    void testGetWater() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(1000);
        Optional<Beverage> optionalWater = vendingMachine.selectBeverage("water");
        Beverage water = optionalWater.get();
        assertEquals(water.getName(), "water");
        assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    void testGetCoke() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(1200);
        Optional<Beverage> optionalCoke = vendingMachine.selectBeverage("coke");
        Beverage coke = optionalCoke.get();
        assertEquals(coke.getName(), "coke");
        assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    void testGetSprite() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(1100);
        Optional<Beverage> optionalSprite = vendingMachine.selectBeverage("sprite");
        Beverage sprite = optionalSprite.get();
        assertEquals(sprite.getName(), "sprite");
        assertEquals(0, vendingMachine.getBalance());
    }
}
