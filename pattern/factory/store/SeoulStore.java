package pattern.factory.store;

import pattern.factory.pizza.Pizza;
import pattern.factory.pizza.SeoulPizza;

public class SeoulStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = super.createPizza(type);
        if ("seoul".equalsIgnoreCase(type)) {
            pizza = new SeoulPizza("Seoul", 20000);
        }
        return pizza;
    }

    @Override
    public void orderPizza(String type) {
        Pizza pizza = this.createPizza(type);
        System.out.println("------------------Order---------------");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.printPrice();
        System.out.println("------------------End---------------");
    }
}
