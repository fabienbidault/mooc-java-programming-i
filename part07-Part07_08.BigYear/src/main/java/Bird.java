/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xzero
 */
public class Bird {
    private String name;
    private String latin;
    private int observation;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void observation() {
        this.observation += 1;
    }

    @Override
    public String toString() {
        return this.name + "("  + this.latin + "): " + this.observation + " observations";
    }
}
