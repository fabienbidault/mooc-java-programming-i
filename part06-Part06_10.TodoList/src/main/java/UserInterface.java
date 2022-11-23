
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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList newTodoList, Scanner newScanner) {
        this.todoList = newTodoList;
        this.scanner = newScanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            this.processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        }
    }

    public void add() {
        System.out.println("To add: ");
        String word = this.scanner.nextLine();
        this.todoList.add(word);
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.println("Which one is removed? ");
        int index = Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(index);
    }
}
