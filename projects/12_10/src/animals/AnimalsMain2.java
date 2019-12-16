package animals;

public class AnimalsMain2 {
    public static void main(String[] args) {
        Cat garfield = new Cat("pers", 'f', 4);
        Dog ozzy = new Dog("boxer", 'm', 7, "Bum");

        garfield.hiss();
        Pupil[] pupils = new Pupil[] {garfield, ozzy};
        for (Pupil pupil:pupils) {
            System.out.println(pupil.toString());
            pupil.sound();
            //pupil.hiss() //nie ma takiej metody w klasie Pupil
        }
    }
}
