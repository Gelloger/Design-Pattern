package pattern.strategy;

import pattern.observer.CurrentDisplay;
import pattern.observer.Display;
import pattern.observer.WeatherData;
import pattern.strategy.champion.Poppy;
import pattern.strategy.champion.Sylas;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Poppy poppy = new Poppy();
        Sylas sylas = new Sylas();

        poppy.performRSkill();

        sylas.performRSkill();
        sylas.setRSkill(poppy.getrSkill());
        sylas.performRSkill();
    }
}
