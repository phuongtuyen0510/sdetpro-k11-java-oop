package lab_10;

import lab_08.Animal;

import java.security.SecureRandom;

public class Dog extends Animal {
    private int speed = 60;
    private String name = "Dog";

    public int getSpeed() {
        return new SecureRandom().nextInt(speed);
    }

    public String getName() {
        return name;
    }
}
