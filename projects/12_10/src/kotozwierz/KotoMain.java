package kotozwierz;

public class KotoMain {
    public static void main(String[] args) {
        Integer i = 8;
        Float f = 4.4f;
        String sss = "dupa";

        Object[] tab = new Object[3];
        tab[0] = i;
        tab[1] = f;
        tab[2] = sss;

        for (Object obj:tab) {
            obj = 7;
            System.out.println(obj.toString());
        }

        for(int j = 0; j < tab.length; j++) {
            Object obj = tab[i];
            obj = 7;
        }

        Lion lion = new Lion();
        Cat cat = (Cat) lion;
        Animal animal = lion;
        Animal animal2 = (Animal) cat;

        lion.breed = "dupa";
        String s = lion.voice;
        int lionAge = lion.getAge();
        lion.hunt();

        int catAge = cat.getAge();
        String d = cat.breed;
        cat.voice = "miałku";
        Lion lion2 = (Lion)cat;

        Cat cat2 = new Cat();
        //Lion lion3 = (Lion)cat2;
    }
}
