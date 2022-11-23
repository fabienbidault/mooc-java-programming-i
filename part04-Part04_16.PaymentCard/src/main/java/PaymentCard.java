/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xzero
 */
public class PaymentCard {

    private double balance;
    private final double affordable;
    private final double hearty;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.6;
        this.hearty = 4.6;
    }

    public void eatAffordably() {
        if (this.balance >= affordable) {
            this.balance -= affordable;
        }
    }

    public void eatHeartily() {
        if (this.balance >= hearty) {
            this.balance -= hearty;
        }
    }

    public void addMoney(double amount) {
        double newBalance = this.balance + amount;
        if (newBalance > 150.0)
            this.balance = 150;
        else if(amount > 0)
            this.balance += amount;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros"; //To change body of generated methods, choose Tools | Templates.
    }
}
