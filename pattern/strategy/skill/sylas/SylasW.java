package pattern.strategy.skill.sylas;


import pattern.strategy.target.WSkill;

public class SylasW implements WSkill {

    @Override
    public void perform() {
        System.out.println("sylas w!");
    }
}
