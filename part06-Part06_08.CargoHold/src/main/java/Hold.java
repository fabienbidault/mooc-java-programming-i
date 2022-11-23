
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
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int newMaximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = newMaximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int newTotalWeightOfSuitcase = this.totalWeight() + suitcase.totalWeight();
        
        if (newTotalWeightOfSuitcase <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
        public int totalWeight() {
        int sum = 0;

        if (this.suitcases.isEmpty()) {
            return sum;
        }

        for (Suitcase suitcase : this.suitcases) {
            sum += suitcase.totalWeight();
        }

        return sum;
    }

    @Override
    public String toString() {
        int numberOfSuitcases = 0;
        int totalWeight = 0;

        for (Suitcase suitcase : this.suitcases) {
            int newTotalWeight = totalWeight + suitcase.totalWeight();

            if (newTotalWeight <= this.maximumWeight) {
                totalWeight += suitcase.totalWeight();
                numberOfSuitcases++;
            }
        }

        return numberOfSuitcases + " suitcases (" + totalWeight + "kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
