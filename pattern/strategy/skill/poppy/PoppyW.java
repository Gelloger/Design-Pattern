package pattern.strategy.skill.poppy;

import pattern.strategy.target.WSkill;

public class PoppyW implements WSkill {

    @Override
    public void perform() {
        System.out.println("poppy w!");
    }
}
