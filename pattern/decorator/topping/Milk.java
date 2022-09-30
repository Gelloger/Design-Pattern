package pattern.decorator.topping;

import pattern.decorator.Beverage;
import pattern.decorator.Decorator;

public class Milk extends Decorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public Integer cost() {
        return beverage.cost() + 500;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + super.getDescription() + "Milk ";
    }
}
