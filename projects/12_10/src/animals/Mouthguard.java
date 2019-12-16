package animals;

public class Mouthguard {
    private int size;
    private String material;
    private int price;

    public Mouthguard(int size, String material, int price) {
        this.size = size;
        this.material = material;
        this.price = price;
    }

    public int getSize() {return size;}
    public String getMaterial() {return material;}
    public int getPrice() {return price;}
}
