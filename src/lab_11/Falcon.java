package lab_11;

public class Falcon extends Animal {
    int maxSpeed = 150;
    int animalSpeed;
    String name = "Falcon";
    public Falcon() {
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
        return "Falcon{" +
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
