package no_idea.stock_o_matic3000;

public class Control{
    public FoodList foods;
    private RecipeList recipes;
 
    public Control(){
        foods = new FoodList();
        recipes = new RecipeList();

        foods.addItem(new FoodItem("Apple", 4, 9, 24, 2017));
        foods.addItem(new FoodItem("Orange", 4, 9, 29, 2017));
        foods.addItem(new FoodItem("Sausage", 3, 9, 25, 2017));
        foods.addItem(new FoodItem("Potato", 6, 9, 30, 2017));
        foods.addItem(new FoodItem("Butter", 1, 9, 12, 2017));
        foods.addItem(new FoodItem("Steak", 1, 9, 14, 2017));
        foods.addItem(new FoodItem("Tomato", 2, 9, 15, 2017));
        foods.addItem(new FoodItem("Celery", 3, 9, 1, 2017));
        foods.addItem(new FoodItem("Mustard", 1, 9, 6, 2017));
        foods.addItem(new FoodItem("Bread", 1, 9, 7, 2017));
    }
 
    public void generate(){
        foods.addItem(new FoodItem("Apple", 4, 9, 24, 2017));
        foods.addItem(new FoodItem("Orange", 4, 9, 29, 2017));
        foods.addItem(new FoodItem("Sausage", 3, 9, 25, 2017));
        foods.addItem(new FoodItem("Potato", 6, 9, 30, 2017));
        foods.addItem(new FoodItem("Butter", 1, 9, 12, 2017));
        foods.addItem(new FoodItem("Steak", 1, 9, 14, 2017));
        foods.addItem(new FoodItem("Tomato", 2, 9, 15, 2017));
        foods.addItem(new FoodItem("Celery", 3, 9, 1, 2017));
        foods.addItem(new FoodItem("Mustard", 1, 9, 6, 2017));
        foods.addItem(new FoodItem("Bread", 1, 9, 7, 2017));
    }
    // will take in a food name and expiry date and place it in the food list specified.
    public void addFood(String name, String numItem, String date){
        int d;
        int m;
        int y;
        //FoodItem food = new FoodItem(name,)
        //foods.addItem(food);
        //foods.saveList();
    }

    // will take in a food name and expiry date and remove it from the food list specified.
    public void removeFood(FoodItem food){
        foods.removeItem(food);
        //foods.saveList();
    }

    //adds a recipe to the list
    public void addRecipe(Recipe recipe){
        recipes.addRecipe(recipe);
        //recipes.saveList();
     }

    //removes recipe by specified recipe
    public void removeRecipe(Recipe recipe){
        recipes.removeRecipe(recipe);
    }

    //removes recipe by specified recipe index
    public void removeRecipe(int recipe){
        recipes.removeRecipe(recipe);
    }
    public String[] listFoodString(){
        return foods.toStringArray();
    }

 //FoodItem(String name, int quantity, int month, int day, int year)
 //public void 

}