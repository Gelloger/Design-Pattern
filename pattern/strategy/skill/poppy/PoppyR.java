package pattern.strategy.skill.poppy;

import pattern.strategy.target.RSkill;

public class PoppyR implements RSkill {

    @Override
    public void perform() {
        System.out.println("poppy r!");
    }
}
