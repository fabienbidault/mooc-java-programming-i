
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int size = array.length;
        for (int index = 0; index < size; index++) {
            System.out.print(array[index]);
            if (index + 1 != size) {
                System.out.print(", ");
            }
        }
    }
}
