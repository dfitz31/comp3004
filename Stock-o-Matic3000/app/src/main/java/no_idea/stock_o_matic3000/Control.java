package no_idea.stock_o_matic3000;

import java.util.ArrayList;

public class Control{
    private FoodList foods;
    private FoodList shopping;
    private RecipeList recipes;
    private FoodItem holder;
    private Recipe holderRec;
 
    public Control(){
        foods = new FoodList();
        recipes = new RecipeList();
        shopping = new FoodList();
        generate();
        holder = foods.getItem(1);
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
        a.addIngredient(steak, 1);
        a.addIngredient(butter, 1);


        Recipe b = new Recipe();
        b.setName("Slightly Warm Apple");
        b.addIngredient(apple, 1);
        b.addIngredient(butter, 1);
        b.addIngredient(celery, 1);
        b.addIngredient(tomato, 1);

        recipes.addRecipe(a);
        recipes.addRecipe(b);
    }
    // will take in a food name and expiry date and place it in the food list specified.
    public void addFood(String name, String numItem, String date){
        int d = 0;
        int m = 0;
        int y = 0;

        String[] parts = date.split("/");
        for(int i = 0; i < parts.length; i++){
            if(i == 0){
                d = Integer.parseInt(parts[i]);
            }
            else if(i == 1){
                m = Integer.parseInt(parts[i]);
            }
            else{
                y = Integer.parseInt(parts[i]);
            }
        }
        foods.addItem(new FoodItem(name, Integer.parseInt(numItem), d, m, y));
    }

    public void editFood(FoodItem edits, String name, String numItem, String date){

        int d = 0;
        int m = 0;
        int y = 0;

        String[] parts = date.split("/");
        for(int i = 0; i < parts.length; i++){
            if(i == 0){
                d = Integer.parseInt(parts[i]);
            }
            else if(i == 1){
                m = Integer.parseInt(parts[i]);
            }
            else{
                y = Integer.parseInt(parts[i]);
            }
        }
        edits.setDay(d);
        edits.setMonth(m);
        edits.setYear(y);
        edits.setName(name);
        edits.setQuantity(Integer.parseInt(numItem));
    }

    // will take in a food name and expiry date and remove it from the food list specified.
    public void removeFood(FoodItem food){
        foods.removeItem(food);
    }

    //adds a recipe to the list
    public void addRecipe(Recipe recipe){
        recipes.addRecipe(recipe);
     }


    public FoodItem getFoodItem(int index){
        return foods.getItem(index);
    }

    public Recipe getRecipe(int index) { return recipes.getRecipe(index); }

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
    public String[] listMealString(){
        return recipes.getRecipeNames();
    }
    public String[] listShoppingString() { return shopping.toStringArray(); }

    public void setHolder(FoodItem newItem) { holder = newItem; }
    public FoodItem getHolder() { return holder; }

    public void setHolderRecipe(Recipe newRec){ holderRec = newRec;}
    public Recipe getHolderRecipe(){return holderRec;}

    public void eat(int numMeals, Recipe recipe){
        ArrayList<FoodItem> ingredients = recipe.getIngredients().getItems();
        int index = 0;
        for(FoodItem food: ingredients){
            food.setQuantity(food.getQuantity() - (numMeals *
                    recipe.getIngredientAmount(index)));
            index++;
        }
    }


    public FoodList getMainList() { return this.foods; }

    public void setMainList(FoodList foods){
        this.foods = foods;
    }

    public RecipeList getRecipeList() { return this.recipes; }

    public void setRecipeList(RecipeList recipes) { this.recipes = recipes; }

    public void generateShoppingList(){

        //remove items that have had their quantity increased
        for(int i=0; i < shopping.getSize(); i++){
            if(shopping.getItem(i).getQuantity() != 0){
                shopping.removeItem(shopping.getItem(i));
            }
        }

        //Remove items from shopping that aren't in Main Food list, trying to fix the error of duplicates
        for(int i=0; i < shopping.getSize(); i++) {
            if (shopping.getItem(i).getQuantity() == 0 && !shopping.contains(foods.getItem(i))) {
                shopping.removeItem(shopping.getItem(i));
            }
        }


    //Add all new items to the shopping list
        for(int i=0; i < foods.getSize(); i++){
            if(foods.getItem(i).getQuantity() == 0 && !shopping.contains(foods.getItem(i))){
                shopping.addItem(foods.getItem(i));
            }
        }
    }


 //FoodItem(String name, int quantity, int month, int day, int year)
 //public void 

}