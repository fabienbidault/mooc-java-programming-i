
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        while (true) {
            String string = scanner.nextLine();
            
            if (string.equals("")) {
                break;
            }
            
            String[] parts = string.split(",");
            int age = Integer.valueOf(parts[1]);
            
            if (oldest < age)
                oldest = age;
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
