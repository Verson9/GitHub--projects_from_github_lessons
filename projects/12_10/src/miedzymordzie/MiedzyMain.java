package miedzymordzie;

public class MiedzyMain {
    public static void main(String[] args) {
        SportCar sport = new SportCar();
        AntiqueCar antique = new AntiqueCar();

        Car car = antique;
        Antique ant = antique;

        //Car[] cars = new Car[] {antique, sport};
        Car[] cars = new Car[2];
        cars[0] = antique;
        cars[1] = sport;

        //Car sport = new SportCar();
        //Car antique = new AntiqueCar();
        //Antique antique1 = new AntiqueCar();
        //AntiqueCar antique2 = (AntiqueCar)antique1;
    }
}
