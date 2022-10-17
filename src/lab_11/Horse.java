package lab_11;

import java.security.SecureRandom;

public class Horse extends Animal {
    int maxSpeed = 200;
    int animalSpeed;
    String name = "Horse";

    public Horse() {
        flyBehavior = new FlyNoWay();
        speedBehavior = new AnimalSpeed();
        this.animalSpeed = speedBehavior.animalSpeed(maxSpeed);
    }

    @Override
    public int getAnimalSpeed() {
        return animalSpeed;
    }

    @Override
    public String toString() {
        return "Horse{" + "maxSpeed=" + maxSpeed + ", animalSpeed=" + animalSpeed + ", name='" + name + '\'' + '}';
    }

    @Override
    public String getName() {
        return name;
    }
}
