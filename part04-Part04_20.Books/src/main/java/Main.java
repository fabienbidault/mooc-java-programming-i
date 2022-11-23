import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        
        while(true) {
            System.out.print("Title: ");
            String title = reader.nextLine();
            
            if(title.isEmpty())
                break;
            
            System.out.println();
            
            System.out.print("Pages: ");
            int numberOfPages = Integer.valueOf(reader.nextLine());
            
            System.out.println();
            
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(reader.nextLine());
        
            if(publicationYear == 0) {
                break;
            }
            
            books.add(new Book(title, numberOfPages, publicationYear));
        }
        
        System.out.println();
        System.out.print("What information will be printed? ");
        System.out.println();
        String infoPrinted = reader.nextLine();
        
        for (Book book : books) {
            if(infoPrinted.equals("everything"))
                System.out.println(book);
            else if(infoPrinted.equals("name"))
                System.out.println(book.getTitle());
        }
    }
}
