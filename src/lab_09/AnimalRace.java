package lab_09;

import java.util.ArrayList;
import java.util.List;

public class AnimalRace {

    public static void main(String[] args) {
        AnimalBuilder.Builder builder1 = new AnimalBuilder.Builder();
        builder1.setName("Snake");
        builder1.setSpeed(60);
        builder1.setFlyable(false);
        AnimalBuilder snake = builder1.build();

        AnimalBuilder.Builder builder2 = new AnimalBuilder.Builder();
        builder2.setName("Tiger");
        builder2.setSpeed(100);
        builder2.setFlyable(false);
        AnimalBuilder tiger = builder2.build();

        AnimalBuilder.Builder builder3 = new AnimalBuilder.Builder();
        builder3.setName("Falcon");
        builder3.setSpeed(85);
        builder3.setFlyable(true);
        AnimalBuilder falcon = builder3.build();

        AnimalBuilder.Builder builder4 = new AnimalBuilder.Builder();
        builder4.setName("Eagle");
        builder4.setSpeed(70);
        builder4.setFlyable(true);
        AnimalBuilder eagle = builder4.build();

        List<AnimalBuilder> AnimalBuilderList = new ArrayList<>();
        AnimalBuilderList.add(snake);
        AnimalBuilderList.add(tiger);
        AnimalBuilderList.add(falcon);
        AnimalBuilderList.add(eagle);

        List<AnimalBuilder> AnimalWithoutWingList = new ArrayList<>();
        for (AnimalBuilder animal : AnimalBuilderList) {
            if (animal.getIsFlyable() == false) {
                AnimalWithoutWingList.add(animal);
            }
        }

        for (AnimalBuilder animal : AnimalWithoutWingList) {
            System.out.println(animal.toString());
        }

        AnimalRace testBuilder = new AnimalRace();
        testBuilder.calculateWinner(AnimalWithoutWingList);

    }

    public void calculateWinner(List<AnimalBuilder> animals) {
        List<Integer> speeds = new ArrayList<>();
        for (AnimalBuilder animal : animals) {
            speeds.add(animal.getSpeed());
        }

        List<String> names = new ArrayList<>();
        for (AnimalBuilder animal : animals) {
            names.add(animal.getName());
        }

        int maximum = 0;
        for (int speed : speeds) {
            System.out.println(speed);
            if (speed > maximum) {
                maximum = speed;
            }
        }

        int index = 0;
        for (int speed : speeds) {
            if (maximum == speed) {
                index = speeds.indexOf(speed);
            }
        }

        System.out.println("The winner is " + names.get(index) + ", with speed: " + maximum);

    }
}
