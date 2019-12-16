package room;

public class Room {
    private double height;
    private double width;
    private double length;

    public Room(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Room(double width, double length) {
//        this.width = width;
//        this.length = length;
//        this.height = 2.4;

        this(2.4, width, length);
    }

    public double countArea() {
        return width*length;
    }
    public double countVolume() {
        return width*length*height;
    }
    public void displayArea() {
        System.out.println(countArea());
    }
    public void displayVolume() {
        System.out.println(countVolume());
    }
    public void setHeight(double height) {
        if(height > 0)
            this.height = height;
        else {
            System.out.println("błąd!");
            System.out.println("podałeś liczbę ujemną");
        }
    }
    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return this.length;
    }
}
