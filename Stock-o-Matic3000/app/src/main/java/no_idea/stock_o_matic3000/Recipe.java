package no_idea.stock_o_matic3000;

import java.util.*;
/*********************************
 *                               *
 *  Class: Recipe                *
 *  Purpose: Holds components of *
 *           a Recipe            *
 *                               *
 *********************************/

public class Recipe{

    private String name;
     private FoodList ingredients; //list of required ingredients
     private ArrayList<Integer> numberOfIngredients;    //Contains the required number of each ingredient
     private Boolean hasAllItems;//if the recipe has all the ingredients or not (f is no)
    private long recipeId;

     /*********************************
      *                               *
      *       Constructors            *
      *                               *
      *********************************/

     //Empty Constructor
     public Recipe(){
      ingredients = new FoodList();
      numberOfIngredients = new ArrayList();
     }

     //Constructor with name
     public Recipe(String newName){
        ingredients = new FoodList();
        numberOfIngredients = new ArrayList();
        name = newName;
     }


     /*********************************
      *                               *
      *      Methods                  *
      *                               *
      *********************************/

     //adds specified ingredient
     public void addIngredient(FoodItem ingredient, int num){
         ingredients.addItem(ingredient);
         numberOfIngredients.add(new Integer(num));
     }
     public void setName(String newName){
         name = newName;
     }

     public String getName(){
         return name;
     }

     public FoodItem getItem(int index){
         return ingredients.getItem(index);
     }

     public int getIngredientIndex(FoodItem food){
         return ingredients.getItems().indexOf(food);
     }
     public void setIngredientAmount(int i, int amount){
         numberOfIngredients.set(i, new Integer(amount));
     }

     public int getIngredientAmount(int i){
         return numberOfIngredients.get(i).intValue();
     }
     //removes specified ingredient
     public void removeIngredient(FoodItem ingredient){
         ingredients.removeItem(ingredient);
     }


     //removes ingredient specified by index
     public void removeIngredient(int itemNum){
         ingredients.removeItem(itemNum);
     }

     public String toString(){
         return name;
     }

     public FoodList getIngredients(){
         return ingredients;
     }

     public String[] ingredientsToArray(){
         ArrayList<String> str = new ArrayList();
         int counter = 0;
         str.add("Add Ingredient");
         for(FoodItem item: ingredients.getItems()){
             str.add("#" + numberOfIngredients.get(counter).intValue() + " " + item.getName());
             counter++;
         }
         return str.toArray(new String[ingredients.getSize()]);
     }

     public void setRecipeId(long recipeId) { this.recipeId = recipeId; }

    public long getRecipeId(){ return this.recipeId; }
}