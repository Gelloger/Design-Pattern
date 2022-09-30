package pattern.strategy.champion;

import pattern.strategy.target.ESkill;
import pattern.strategy.target.QSkill;
import pattern.strategy.target.RSkill;
import pattern.strategy.target.WSkill;

public class Champion {
    private QSkill qSkill;
    private WSkill wSkill;
    private ESkill eSkill;
    private RSkill rSkill;

    public Champion(QSkill qSkill, WSkill wSkill, ESkill eSkill, RSkill rSkill) {
        this.qSkill = qSkill;
        this.wSkill = wSkill;
        this.eSkill = eSkill;
        this.rSkill = rSkill;
    }

    public void performQSkill(){
        qSkill.perform();
    };

    public void performWSkill(){
        wSkill.perform();
    };

    public void performESkill(){
        eSkill.perform();
    };

    public void performRSkill(){
        rSkill.perform();
    };

    public void setqSkill(QSkill qSkill) {
        this.qSkill = qSkill;
    }
    public void setwSkill(WSkill wSkill) {
        this.wSkill = wSkill;
    }

    public void seteSkill(ESkill eSkill) {
        this.eSkill = eSkill;
    }

    public void setRSkill(RSkill rSkill) {
        this.rSkill = rSkill;
    }
    public QSkill getqSkill() {
        return qSkill;
    }

    public WSkill getwSkill() {
        return wSkill;
    }

    public ESkill geteSkill() {
        return eSkill;
    }

    public RSkill getrSkill() {
        return rSkill;
    }
}
