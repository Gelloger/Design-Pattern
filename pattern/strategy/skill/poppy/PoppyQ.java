package pattern.strategy.skill.poppy;


import pattern.strategy.target.QSkill;

public class PoppyQ implements QSkill {

    @Override
    public void perform() {
        System.out.println("poppy q!");
    }
}
