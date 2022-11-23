
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int participants = 0;
        int passing = 0;
        int sumAll = 0;
        int sumPassing = 0;
        double averageAll = 0;
        double averagePassing = 0;
        double percentage = 0.0;
        int[] grades = {0,0,0,0,0,0};
        
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number > 0 && number < 101) {
                sumAll += number;
                participants++;
                
                if (number > 49) {
                    sumPassing += number;
                    passing++;
                }
                
                if(number < 50) {
                    grades[0] += 1;
                }else if(number < 60) {
                    grades[1] += 1;
                } else if(number < 70) {
                    grades[2] += 1;
                } else if(number < 80) {
                    grades[3] += 1;
                } else if(number < 90) {
                    grades[4] += 1;
                } else if(number >= 90) {
                    grades[5] += 1;
                }
            }

        }

        averageAll = sumAll / participants;

        if (averageAll > 0) {
            System.out.println("Point average (all): " + averageAll);
        } else {
            averageAll = 0;
            System.out.println("Point average (all): -");
        }

        averagePassing = sumPassing / passing;

        if (averagePassing > 0) {
            System.out.println("Point average (passing): " + averagePassing);
        } else {
            averagePassing = 0;
            System.out.println("Point average (passing): -");
        }
        
        percentage = 100.0 * passing / participants;

        System.out.println("Pass percentage: " + percentage);
        
        printGrades(grades);
    }
    
    public static void printGrades(int[] array) {
        System.out.println("Grade distribution:");
        int count = 5;
        
        for (int idIndex = array.length - 1; idIndex >= 0; idIndex--) {
            System.out.print(count + ": ");
            printStars(array[idIndex]);
            System.out.println();
            count--;
        }
    }
    
    public static void printStars(int numberOfStars) {
        for (int star = 0; star < numberOfStars; star++) {
            System.out.print('*');
        }
    }
}
