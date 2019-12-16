package animals;

import java.util.zip.DeflaterOutputStream;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog d = new Dog("asda", 's', 12);
        Dog rex = new Dog("husky", 'm', 3);
        Dog lucky = new Dog("boxer", 'f', 2, "Miałk");
        rex.mountMouthguard(new Mouthguard(4, "steel", 100));
        Dog[] dogs = new Dog[] {rex, lucky};
        for (Dog dog:dogs) {
            System.out.println(dog.toString());
            dog.sound();
            if(dog.getMouthguard() != null)
                System.out.println("Mouthguard material: " + dog.getMouthguard().getMaterial());
            else
                System.out.println("Dog does not have a mouthguard");
            System.out.println();
        }

//        System.out.println(rex.toString());
//        rex.setAge(-9);
//        System.out.println(rex.toString());
//        rex.setAge(4);
//        System.out.println(rex.toString());
    }
}
https://github.com/Verson9/Wprowadzenie-do-javy-z-githubem.git