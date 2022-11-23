
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String filename = scanner.nextLine();

        try ( Scanner reader = new Scanner(Paths.get(filename))) {
            System.out.println("");

            ArrayList<Recipe> recipes = new ArrayList<>();
            Recipe recipe = new Recipe();
            ArrayList<String> ingredients = new ArrayList<>();
            int count = 1;

            while (reader.hasNextLine()) {

                String row = reader.nextLine();

                if (row.isEmpty()) {
                    recipes.add(recipe);
                    recipe = new Recipe();
                    ingredients = new ArrayList<>();
                    count = 1;
                    continue;
                }

                if (count == 1) {
                    recipe.setName(row);
                } else if (count == 2) {
                    recipe.setCookingTime(Integer.valueOf(row));
                } else {
                    recipe.getIngredients().add(row);
                }

                count++;
            }

            recipes.add(recipe);

            printMenu();
            while (true) {
                System.out.println("");
                System.out.println("Enter command: ");
                String input = scanner.nextLine();

                if (input.equals("stop")) {
                    break;
                }

                processCommand(input, recipes, scanner);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void printMenu() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    public static void processCommand(String command, ArrayList<Recipe> recipes, Scanner scanner) {
        if (command.equals("list")) {
            list(recipes);
        } else if (command.equals("find name")) {
            searchName(recipes, scanner);
        } else if (command.equals("find cooking time")) {
            findingCookingTime(recipes, scanner);
        } else if (command.equals("find ingredient")) {
            findingIngredient(recipes, scanner);
        }
    }

    public static void list(ArrayList<Recipe> recipes) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public static void searchName(ArrayList<Recipe> recipes, Scanner scanner) {
        System.out.println("Searched word: ");
        String word = scanner.nextLine();

        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }

        System.out.println();
    }

    public static void findingCookingTime(ArrayList<Recipe> recipes, Scanner scanner) {
        System.out.println("Max cooking time: ");
        int cookingTime = Integer.valueOf(scanner.nextLine());

        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCoockingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public static void findingIngredient(ArrayList<Recipe> recipes, Scanner scanner) {
        System.out.println("Ingredient: ");
        String searchingIngredient = scanner.nextLine();
        
        System.out.println();
        
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            for (String ingredient : recipe.getIngredients()) {
                if (ingredient.equals(searchingIngredient)) {
                    System.out.println(recipe);
                }
            }
        }
    }
}
