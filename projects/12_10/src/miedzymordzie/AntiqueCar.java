package miedzymordzie;

import java.util.Random;

public class AntiqueCar implements Car, Antique {
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

    @Override
    public void exhibit() {
        System.out.println("łaaaaaaał");
    }
}