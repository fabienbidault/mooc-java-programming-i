
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author xzero
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        Random random = new Random();
        int index = random.nextInt(jokes.size());
        return jokes.get(index);
    }
    
    public void printJokes() {
        int index = 0;
        while(index < this.jokes.size()) {
            System.out.println(this.jokes.get(index));
            index++;
        }
    }
}
