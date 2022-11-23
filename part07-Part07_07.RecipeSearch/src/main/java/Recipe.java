
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
public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe() {
        this.name = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<>();
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getCoockingTime() {
        return this.cookingTime;
    }
    
    public void setCookingTime(int newCookingTime) {
        this.cookingTime = newCookingTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public void setIngredient(ArrayList<String> newIngredients) {
        this.ingredients = newIngredients;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
