package shop;

import java.util.Scanner;

public class ShopMain {

    //pole w ciele klasy
    private static String[] products = {"kombinerki", "nożyczki", "śrubokręt"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Poda swoj imię");
        String name = scanner.nextLine();

        System.out.println("Witaj " + name + "!");
        displayProducts(products);
        System.out.println("Co chciałbyś kupić?");

        sellProduct(scanner.nextLine());

        displayProducts(products);
    }

    private static void sellProduct(String choice) {
        switch (choice) {
            case "kombinerki":
                products = new String[] { "nożyczki", "śrubokręt" };
                System.out.println("Kupiłeś " + choice);
                break;
            case "nożyczki":
                products = new String[] { "kombinerki", "śrubokręt" };
                System.out.println("Kupiłeś " + choice);
                break;
            case "śrubokręt":
                products = new String[] { "nożyczki", "kombinerki" };
                System.out.println("Kupiłeś " + choice);
                break;
            default:
                System.out.println("Takiego produktu nie mamy w ofercie");
                break;
        }
    }

    private static void displayProducts(String[] products) {
        System.out.println("W naszej ofercie mamy:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
