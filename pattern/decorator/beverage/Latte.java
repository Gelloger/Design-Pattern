package pattern.decorator.beverage;

import pattern.decorator.Beverage;

public class Latte extends Beverage {
    @Override
    public Integer cost() {
        return super.cost() + 3000;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + "Latte ";
    }
}
