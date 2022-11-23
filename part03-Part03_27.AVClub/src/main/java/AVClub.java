
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }

            String[] words = string.split(" ");

            printWordContainCharacters(words, "av");
        }
    }

    public static void printWordContainCharacters(String[] arrayOfStrings, String characters) {
        if (arrayOfStrings.length == 0)
            return;
        for (String string : arrayOfStrings) {
            if(string.contains(characters)) {
                System.out.println(string);
            }
        }
    }
}
