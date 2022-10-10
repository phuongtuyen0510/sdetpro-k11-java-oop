package lab_10;

import java.util.Arrays;

public class AnimalRace {
    public static void main(String[] args) {
       AnimalWinnerRacing animalWinner = new AnimalWinnerRacing();
        animalWinner.calculateWinner(Arrays.asList(new Dog(), new Tiger(), new Horse()));
    }
}
