package animals;

public class Cat extends Pupil {

    public Cat(String breed, char sex, int age) {
        super(breed, sex, age, "Miałk!");
        String s = "sa";
    }

    public Cat(String breed, char sex, int age, String sound) {
        super(breed, sex, age, sound);
    }

    public void hiss() {
        System.out.println("Phiiiiis!");
    }

    @Override
    public String toString() {
        return  "Cat \n" +
                super.toString();
    }
}
