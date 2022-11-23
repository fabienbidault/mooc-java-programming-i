
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String file = scanner.nextLine();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (line.isEmpty())
                    continue;

                String[] identity = line.split(",");
                String name = identity[0];
                int age = Integer.valueOf(identity[1]);

                if (age == 1)
                    System.out.println(name + ", age: " + age + " year");
                else
                    System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
