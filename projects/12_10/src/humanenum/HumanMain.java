package humanenum;

public class HumanMain {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 12, EyeColor.Diamond, HairColor.Pink);
        System.out.println(adam.toString());
        adam = new Human("Filip", 99, EyeColor.Beer, HairColor.Grey);
        System.out.println(adam);
    }
}
