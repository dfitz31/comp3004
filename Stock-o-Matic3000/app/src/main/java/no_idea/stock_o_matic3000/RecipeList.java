package no_idea.stock_o_matic3000;

import java.util.*;

//This class deals with recipe management

public class RecipeList{
    private ArrayList<Recipe> recipes;
    private int size;
 
 
    //creates an empty recipe list
    public RecipeList(){
        recipes = new ArrayList<Recipe>();
        size = 0;
    }
 
    //adds a recipe
    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
        size = recipes.size();
    }
 
    //returns a recipe
    public Recipe getRecipe(int index){
        return recipes.get(index);
    }

    //removes a specified recipe
    public void removeRecipe(Recipe recipe){
        recipes.remove(recipe);
    }

    //removes a specified recipe by index
    public void removeRecipe(int recipe){
        recipes.remove(recipe);
    }
}