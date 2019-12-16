package miedzymordzie;


import java.util.Random;

public class SportCar implements Car {

    @Override
    public void beep() {
        System.out.println("mig mig");
    }

    @Override
    public boolean launch() {
        Random random = new Random();
        if(random.nextInt(100)%2 == 0) {
            System.out.println("wrum");
            return true;
        }
        System.out.println("napraw mnie");
        return false;
    }

    @Override
    public void drive() {
        System.out.println("wziuuu");
    }

    public void speeding() {
        System.out.println("bye bye");
    }
}
