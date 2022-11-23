
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        
        // Write here the code for reading from file
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if(line.isEmpty())
                    continue;
                
                String[] person = line.split(",");
                String name = person[0];
                
                if(name.isEmpty())
                    continue;
                
                int age = Integer.valueOf(person[1]);
                
                if(age < 0)
                    continue;
                
                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Reading " + file + " failed.");
        }
        // and printing the read records
        return persons;

    }
}
