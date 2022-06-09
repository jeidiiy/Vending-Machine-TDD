import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class AppTests {

    @Test
    void testGetWater() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(1000);
        Optional<Water> optionalWater = vendingMachine.selectBeverage("water");
        Water water = optionalWater.get();
        assertEquals(water.getName(), "water");
        assertEquals(0, vendingMachine.getBalance());
    }
}
