package pattern.strategy.champion;

import pattern.strategy.skill.poppy.PoppyE;
import pattern.strategy.skill.poppy.PoppyQ;
import pattern.strategy.skill.poppy.PoppyR;
import pattern.strategy.skill.poppy.PoppyW;

public class Poppy extends Champion {
    public Poppy() {
        super(new PoppyQ(), new PoppyW(), new PoppyE(), new PoppyR());
    }

}
