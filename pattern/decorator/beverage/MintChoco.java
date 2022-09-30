package pattern.decorator.beverage;

import pattern.decorator.Beverage;

public class MintChoco extends Beverage {
    @Override
    public Integer cost() {
        return super.cost() + 3500;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "Mint Choco ";
    }
}
