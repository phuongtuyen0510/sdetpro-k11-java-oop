package lab_08;

import java.security.SecureRandom;

public class Horse extends Animal {
    private int speed = 75;
    private String name = "Horse";

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(speed);
    }

    public String getName() {
        return name;
    }
}
