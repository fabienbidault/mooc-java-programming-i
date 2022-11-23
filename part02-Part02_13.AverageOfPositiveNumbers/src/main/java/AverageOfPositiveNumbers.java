
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPositives = 0;
        int sumOfPositivesNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                numberOfPositives++;
                sumOfPositivesNumbers += number;
            }
        }

        if (numberOfPositives != 0 || sumOfPositivesNumbers != 0) {
            System.out.println(1.0 * sumOfPositivesNumbers / numberOfPositives);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
