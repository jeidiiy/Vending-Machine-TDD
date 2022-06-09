public class BeverageFactory {

    public static Beverage create(String beverageName) {
        beverageName = beverageName.toLowerCase();
        switch (beverageName) {
            case "coke":
                return new Coke();
            case "sprite":
                return new Sprite();
            case "water":
                return new Water();
            default:
                throw new BeverageNotFoundException(beverageName);
        }
    }
}
