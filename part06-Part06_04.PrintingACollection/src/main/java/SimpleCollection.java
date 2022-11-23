
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        String printOutput = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            return printOutput += " is empty.";
        }

        int sizeOfCollection = this.elements.size();

        printOutput += " has " + sizeOfCollection;

        if (sizeOfCollection == 1) {
            printOutput += " element:\n" + this.elements.get(0);
            return printOutput;
        } else {
            printOutput += " elements:\n";
        }

        for (String element : this.elements) {
            printOutput += element + '\n';
        }

        return printOutput;
    }
}
