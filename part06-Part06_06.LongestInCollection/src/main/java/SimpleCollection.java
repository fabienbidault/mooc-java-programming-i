
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

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        
        String longestString = this.elements.get(0);
        int index = 0;

        while (index < this.elements.size()) {
            if (longestString.length() < this.elements.get(index).length()) {
                longestString = this.elements.get(index);
            }
            index++;
        }
        
        return longestString;
    }
}
