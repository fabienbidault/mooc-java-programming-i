
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String firstName = "";
        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }

            String[] parts = string.split(",");
            int age = Integer.valueOf(parts[1]);

            if (oldest < age) {
                oldest = age;
                firstName = parts[0];
            }
        }

        System.out.println("Age of the oldest: " + firstName);
    }
}
