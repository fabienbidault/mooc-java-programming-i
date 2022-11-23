
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number  == 9999) {
                break;
            }
            
            numbers.add(number);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int smallest = numbers.get(0);
        int index = 0;
        while (index < numbers.size()) {
            boolean isSmallest = (smallest > numbers.get(index));
            
            if (isSmallest) {
                smallest = numbers.get(index);
            }
            index++;
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for (int number = 0; number < numbers.size(); number++) {
            if (numbers.get(number) == smallest) {
                System.out.println("Found at index: " + number);
            }
        }
    }
}
