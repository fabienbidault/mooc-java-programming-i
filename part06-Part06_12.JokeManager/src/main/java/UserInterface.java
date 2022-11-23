
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
public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager newJokeManager, Scanner newScanner) {
        this.jokeManager = newJokeManager;
        this.scanner = newScanner;
    }

    public void start() {
        while (true) {
            printMenu();
            String command = this.scanner.nextLine();
            if (command.equals("X")) {
                break;
            }

            processCommand(command);
        }
    }

    public static void printMenu() {
        System.out.println("Commands:\n"
                + "1 - add a joke\n"
                + "2 - draw a joke\n"
                + "3 - list jokes\n"
                + "X - stop");
    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            this.jokeManager.addJoke(joke);
        } else if (command.equals("2")) {
            System.out.println("Drawing a joke.");
            System.out.println(jokeManager.drawJoke());
        } else if (command.equals("3")) {
            System.out.println("Printing the jokes.");
            this.jokeManager.printJokes();
        }
    }
}
