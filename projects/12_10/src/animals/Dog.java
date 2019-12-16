package animals;

public class Dog extends Pupil{

    private Mouthguard mouthguard;

    public Dog(String breed, char sex, int age) {
        super(breed, sex, age, "Woof!");
    }

    public Dog(String breed, char sex, int age, String barkingSound) {
        super(breed, sex, age, barkingSound);
    }

    public void mountMouthguard(Mouthguard mouthguard) {
        this.mouthguard = mouthguard;
    }

    public void unmountMouthguard() {
        this.mouthguard = null;
    }

    public Mouthguard getMouthguard() {
        return mouthguard;
    }

    @Override
    public String toString() {
        return  "Dog \n" +
                super.toString();
    }
}
