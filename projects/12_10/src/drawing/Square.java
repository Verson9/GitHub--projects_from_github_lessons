package drawing;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Podaj długość boku kwadratu");
        Scanner scanner = new Scanner(System.in);
        int sideLengthUuuu = scanner.nextInt();
        char bruschLalala = '*';
        drawSquare(sideLengthUuuu, bruschLalala);
    }

    private static void drawSquare(int sideLength, char brusch) {
        for(int i = 0; i < sideLength; i++) {
            for(int j = 0; j < sideLength; j++) {
                System.out.print(brusch);
            }
            System.out.println();
        }
    }
}
