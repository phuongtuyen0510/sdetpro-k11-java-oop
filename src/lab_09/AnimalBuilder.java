package lab_09;

import java.security.SecureRandom;

public class AnimalBuilder {
    private int speed;
    private String name;
    private boolean isFlyable;

    protected AnimalBuilder(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.isFlyable = builder.isFlyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return new SecureRandom().nextInt(speed);
    }

    public boolean getIsFlyable() {
        return isFlyable;
    }

    public String toString() {
        return "AnimalBuilder{" + "name='" + name + '\'' + " , speed=" + speed + ", isFlyable= " + isFlyable + '}';
    }

    public static class Builder {
        private int speed;
        private String name;
        private boolean isFlyable;

        public void setSpeed(int speed) {
            this.speed = new SecureRandom().nextInt(speed);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setFlyable(boolean flyable) {
            isFlyable = flyable;
        }

        public AnimalBuilder build() {
            return new AnimalBuilder(this);
        }
    }
}


