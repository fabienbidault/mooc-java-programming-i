
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
public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        if (!this.gifts.contains(gift)) {
            this.gifts.add(gift);
        }
    }

    public int totalWeight() {
        int sum = 0;

        if (this.gifts.isEmpty()) {
            return sum;
        }

        for (Gift gift : this.gifts) {
            sum += gift.getWeight();
        }
        
        return sum;
    }
}
