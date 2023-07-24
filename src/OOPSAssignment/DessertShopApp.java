package OOPSAssignment;

import java.util.Scanner;


abstract class DessertItem {

    public abstract double getCost();
}

class Candy extends DessertItem {
    private double costInDollar;

    public Candy(double costInDollar) {
        this.costInDollar = costInDollar;
    }

    @Override
    public double getCost() {
        return costInDollar * 1.10;
    }
}

class Cookie extends DessertItem {
    private double costInEuro;

    public Cookie(double costInEuro) {
        this.costInEuro = costInEuro;
    }

    @Override
    public double getCost() {
        return costInEuro * 70 * 1.15;
    }
}

class IceCream extends DessertItem {
    private double costInRupees;

    public IceCream(double costInRupees) {
        this.costInRupees = costInRupees;
    }

    @Override
    public double getCost() {
        return costInRupees * 1.05;
    }
}

public class DessertShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your role (owner/customer): ");
        String role = scanner.nextLine().toLowerCase();

        if (role.equals("owner")) {
            Candy candy = new Candy(2.5);
            Cookie cookie = new Cookie(1.5);
            IceCream iceCream = new IceCream(50);

            System.out.println("Dessert items added to the storage.");
        } else if (role.equals("customer")) {
            System.out.println("Select your dessert item: ");
            System.out.println("1. Candy");
            System.out.println("2. Cookie");
            System.out.println("3. IceCream");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();

            DessertItem dessertItem = null;

            switch (choice) {
                case 1:
                    dessertItem = new Candy(2.5);
                    break;
                case 2:
                    dessertItem = new Cookie(1.5);
                    break;
                case 3:
                    dessertItem = new IceCream(50);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            if (dessertItem != null) {

                double totalCost = dessertItem.getCost();
                System.out.println("Total cost for your order: " + totalCost + " rupees");
            }
        } else {
            System.out.println("Invalid role.");
        }

        scanner.close();
    }
}
