package pattern.strategy.champion;

import pattern.strategy.skill.sylas.SylasE;
import pattern.strategy.skill.sylas.SylasQ;
import pattern.strategy.skill.sylas.SylasR;
import pattern.strategy.skill.sylas.SylasW;

public class Sylas extends Champion {
    public Sylas() {
        super(new SylasQ(), new SylasW(), new SylasE(), new SylasR());
    }

}
