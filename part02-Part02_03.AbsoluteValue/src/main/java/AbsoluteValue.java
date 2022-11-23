
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int absolutValue = Integer.valueOf(scanner.nextLine());
        
        if (absolutValue < 0) {
            absolutValue = absolutValue * -1;
        }
        
        System.out.println(absolutValue);
    }
}
