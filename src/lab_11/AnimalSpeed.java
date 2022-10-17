package lab_11;

import java.security.SecureRandom;

public class AnimalSpeed implements SpeedBehavior {
    @Override
    public int animalSpped(int maxSpeed) {
        return 0;
    }

    @Override
    public int animalSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
