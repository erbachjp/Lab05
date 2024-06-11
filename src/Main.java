import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();
        double shippingCost = (price * 0.02);

        if (price < 100) {
             price = price * 1.02;
            System.out.print("Shipping cost is: " + shippingCost);
        }

        System.out.print(" Total cost is: " + price);
        }
    }
