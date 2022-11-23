
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
// indices:       0  1  2  3   4
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        int index = 1;

        while (index < array.length) {
            if (smallest > array[index]) {
                smallest = array[index];
            }
            index++;
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallest = array[indexOfSmallest];
        int index = 1;

        while (index < array.length) {
            if (array[indexOfSmallest] > array[index]) {
                indexOfSmallest = index;
            }
            index++;
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexSmallest = startIndex;
        int smallest = table[startIndex];

        while (startIndex < table.length) {
            if (table[indexSmallest] > table[startIndex]) {
                indexSmallest = startIndex;
            }
            startIndex++;
        }

        return indexSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static void sort(int[] array) {
        int startIndex = 0;

        while (startIndex < array.length) {
            System.out.println(Arrays.toString(array));
            int indexSmallest = indexOfSmallestFrom(array, startIndex);
            int swap = array[indexSmallest];
            array[indexSmallest] = array[startIndex];
            array[startIndex] = swap;
            startIndex++;
        }

    }
}
