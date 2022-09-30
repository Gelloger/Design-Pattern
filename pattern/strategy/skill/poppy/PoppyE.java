package pattern.strategy.skill.poppy;

import pattern.strategy.target.ESkill;

public class PoppyE implements ESkill {

    @Override
    public void perform() {
        System.out.println("sylas e!");
    }
}
