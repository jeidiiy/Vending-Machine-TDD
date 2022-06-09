package beverage;

import exception.BeverageNotFoundException;

public class BeverageFactory {

    public static Beverage create(EBeverage eBeverage) {
        switch (eBeverage) {
            case COKE:
                return new Coke();
            case SPRITE:
                return new Sprite();
            case WATER:
                return new Water();
        }
        throw new BeverageNotFoundException();
    }
}
