
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print("*");
            number--;
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int number = 1;

        while (number <= size) {
            printSpaces(size - number);
            printStars(number);
            number++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int number = 1;
        int count = 1;
        
        while (number <= height) {
            printSpaces(height - number);
            printStars(count);
            count += 2;
            number++;
        }

        count = 0;
        
        while (count < 2) {
            printSpaces(number - 3);
            printStars(3);
            count++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
