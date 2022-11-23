
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author xzero
 */
public class Suitcase {

    private ArrayList<Item> items;
    private final int maximumWeight;

    public Suitcase(int newMaximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = newMaximumWeight;
    }

    public void addItem(Item item) {
        int newTotalWeight = this.totalWeight() + item.getWeight();
        
        if (newTotalWeight <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + "kg)";
        }

        int numberOfItems = 0;
        int totalWeight = 0;

        for (Item item : this.items) {
            int newTotalWeight = totalWeight + item.getWeight();

            if (newTotalWeight <= this.maximumWeight) {
                totalWeight += item.getWeight();
                numberOfItems++;
            }
        }

        return numberOfItems + " items (" + totalWeight + "kg)";
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sum = 0;

        if (this.items.isEmpty()) {
            return sum;
        }

        for (Item item : this.items) {
            sum += item.getWeight();
        }

        return sum;
    }

    public Item heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item item : this.items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }
}
