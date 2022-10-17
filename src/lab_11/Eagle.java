package lab_11;

public class Eagle extends Animal {
    int maxSpeed = 250;
    int animalSpeed;
    String name = "Eagle";
    public Eagle() {
        flyBehavior = new FlyWithWing();
        speedBehavior = new AnimalSpeed();
        this.animalSpeed = speedBehavior.animalSpeed(maxSpeed);
    }

    @Override
    public int getAnimalSpeed() {
        return animalSpeed;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "maxSpeed=" + maxSpeed +
                ", animalSpeed=" + animalSpeed +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }
}
