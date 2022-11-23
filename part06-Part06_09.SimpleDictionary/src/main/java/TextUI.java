
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author xzero
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner newScanner, SimpleDictionary newDictionary) {
        this.scanner = newScanner;
        this.dictionary = newDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String newCommand = this.scanner.nextLine();

            if (newCommand.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            this.processCommand(newCommand);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("Word: ");
        String newWord = this.scanner.nextLine();

        System.out.println("Translation: ");
        String newTranslation = this.scanner.nextLine();

        this.dictionary.add(newWord, newTranslation);
    }

    public void search() {
        System.out.println("To be translated: ");
        String word = this.scanner.nextLine();

        if (isPresent(word)) {
            System.out.println("Translation: ");
            System.out.println(this.dictionary.translate(word));
        } else {
            System.out.println("Word " + word + " was not found");
        }
    }

    public boolean isPresent(String word) {
        return this.dictionary.translate(word) != null;
    }
}
