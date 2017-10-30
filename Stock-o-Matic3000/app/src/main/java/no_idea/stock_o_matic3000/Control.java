package no_idea.stock_o_matic3000;

public class Control{
    private static FoodList foods;
    private RecipeList recipes;
 
    public Control(){
        foods = new FoodList();
        recipes = new RecipeList();
        generate();
    }
 
    public void generate(){
        FoodItem apple = new FoodItem("Apple", 4, 9, 24, 2017);
        FoodItem orange = new FoodItem("Orange", 4, 9, 29, 2017);
        FoodItem sausage = new FoodItem("Sausage", 3, 9, 25, 2017);
        FoodItem potato = new FoodItem("Potato", 6, 9, 30, 2017);
        FoodItem butter = new FoodItem("Butter", 1, 9, 12, 2017);
        FoodItem steak = new FoodItem("Steak", 1, 9, 14, 2017);
        FoodItem tomato = new FoodItem("Tomato", 2, 9, 15, 2017);
        FoodItem celery = new FoodItem("Celery", 3, 9, 1, 2017);
        FoodItem mustard = new FoodItem("Mustard", 1, 9, 6, 2017);
        FoodItem bread = new FoodItem("Bread", 1, 9, 7, 2017);

        foods.addItem(apple);
        foods.addItem(orange);
        foods.addItem(sausage);
        foods.addItem(potato);
        foods.addItem(butter);
        foods.addItem(steak);
        foods.addItem(tomato);
        foods.addItem(celery);
        foods.addItem(mustard);
        foods.addItem(bread);

        Recipe a = new Recipe();
        a.setName("Butter Steak");
        a.addIngredient(steak);
        a.addIngredient(butter);
       /* a.addInstruction("Melt butter in pan");
        a.addInstruction("Fry steak in buttery pan");
        a.addInstruction("Do the fancy steak stuff like letting it rest or whatever");
        a.addInstruction("Eat the steak you carnivore");*/

        Recipe b = new Recipe();
        b.setName("Slightly Warm Apple");
        b.addIngredient(apple);
        b.addIngredient(butter);
        b.addIngredient(celery);
        b.addIngredient(tomato);
        /*b.addInstruction("Throw out everything except the apple");
        b.addInstruction("Microwave the apple for a small amount of time");
        b.addInstruction("Consume your slightly warm apple");*/
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