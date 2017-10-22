package no_idea.stock_o_matic3000;

import java.util.*;

public class RecipeList{
 private ArrayList<Recipe> Recipes;
 private int size;
 
 
 //creates an empty recipe list
 public RecipeList(){
  Recipes = new ArrayList();
  size = 0;
 }
 
 //adds a recipe
 public void addRecipe(Recipe R){
  Recipes.add(R);
  size = Recipes.size();
 }
 
 //returns a recipe
 public Recipe getRecipe(int index){
  return Recipes.get(index);
 }
}