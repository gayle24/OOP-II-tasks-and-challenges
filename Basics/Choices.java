package Basics;

import java.util.*;

public class Choices {
    void makeChoices(int price) {
        if (price < 25) {
            System.out.println("I'll buy!");
        } else {
            System.out.println("Too expensive");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price: ");
        int price = scanner.nextInt();

        Choices choice = new Choices();
        choice.makeChoices(price);

        scanner.close();
    }
}
