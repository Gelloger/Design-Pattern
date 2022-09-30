package pattern.strategy.skill.sylas;


import pattern.strategy.target.QSkill;

public class SylasQ implements QSkill {

    @Override
    public void perform() {
        System.out.println("sylas q!");
    }
}
