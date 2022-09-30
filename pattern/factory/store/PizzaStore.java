package pattern.factory.store;

import pattern.factory.pizza.*;

import java.util.Objects;

public abstract class PizzaStore {
    public Pizza createPizza(String type) {
        if ("potato".equalsIgnoreCase(type)) {
            return new PotatoPizza("Potato", 14000);

        } else if ("gimochi".equalsIgnoreCase(type)) {
            return new GimochiPizza("Gimochi", 12000);

        } else if ("cheeze".equalsIgnoreCase(type)) {
            return new CheezePizza("Cheeze", 8000);

        } else if ("special".equalsIgnoreCase(type)) {
            return new SpecialPizza("Special", 30000);

        } else if ("basic".equalsIgnoreCase(type)) {
            return new BasicPizza("Basic", 7000);

        }
        return null;
    }

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        if(Objects.isNull(pizza)) {
            System.out.println("Sorry. There is no Pizza who you want.");
        } else {
            System.out.println("------------------Order---------------");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            pizza.printPrice();
            System.out.println("------------------End---------------");
        }
    }
}
