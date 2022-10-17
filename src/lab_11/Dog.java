package lab_11;

public class Dog extends Animal {

    int maxSpeed = 60;
    int animalSpeed;
    String name = "Dog";
    public Dog() {
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
        return "Dog{" +
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
