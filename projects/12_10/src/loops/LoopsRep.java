package loops;

import java.util.Scanner;

public class LoopsRep {
    public static void main(String[] args) {
        int numbersToRead = 5, minimalValue = 10;
        int i = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (i++ < numbersToRead) {
            System.out.println("Podaj liczbę całkowitą");
            int number = scanner.nextInt();
            if(number > minimalValue)
             sum += number;
            //sum += number > minimalValue ? number : 0;
        }
        System.out.println("Suma wynosi: " + sum);
    }
}
