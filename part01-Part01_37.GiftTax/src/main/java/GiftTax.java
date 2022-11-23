
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scan.nextLine());

        double tax = 0.0;

        if (valueOfGift >= 1000000) {
            tax = (142100 + (valueOfGift - 1000000) * 0.17);
        } else if (valueOfGift >= 200000) {
            tax = (22100 + (valueOfGift - 200000) * 0.15);
        } else if (valueOfGift >= 55000) {
            tax = (4700 + (valueOfGift - 55000) * 0.12);
        } else if (valueOfGift >= 25000) {
            tax = (1700 + (valueOfGift - 25000) * 0.10);
        } else if (valueOfGift >= 5000) {
            tax = (100 + (valueOfGift - 5000) * 0.08);
        }

        if (valueOfGift < 5000) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }
    }
}
