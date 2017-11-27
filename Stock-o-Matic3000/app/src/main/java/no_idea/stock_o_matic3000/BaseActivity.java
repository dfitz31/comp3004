package no_idea.stock_o_matic3000;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

public class BaseActivity extends Activity {

    protected static Control control = new Control();
    DatabaseHelper db;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DatabaseHelper(getApplicationContext());


        //Copying Main List data from Database to control class variables.
        ArrayList<FoodItem> mainList = db.getMainList();
        FoodList foods = new FoodList();
        foods.setItems(mainList);
        control.setMainList(foods);

        /*//Copying Recipe List data from Database to control class variables.
        ArrayList<Tag> recipeNames = db.getAllTags();
        RecipeList recipeList = new RecipeList();

        for(int i = 0; i < recipeNames.size(); i++){

            String recipeName = recipeNames.get(i).getTagName();
            Recipe newRecipe = new Recipe(recipeName);
            ArrayList<FoodItem> ingredients = db.getAllFoodItemsByTag(recipeName);
            for(int j = 0; j < ingredients.size(); j++){
                newRecipe.addIngredient(ingredients.get(j), ingredients.get(j).getQuantity());
            }
            recipeList.addRecipe(newRecipe);
        }

        control.setRecipeList(recipeList);*/

    }


    protected void onStart(){
        super.onStart();


    }

    protected void onStop(){
        super.onStop();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        /*db.onUpgrade(db.getDB(),1,2);

        db.onUpgrade(db.getDB(),1,2);


        //Insert MainList values into Database
        ArrayList<FoodItem> mainListInsert = control.getMainList().getItems();

        for(int i = 0; i < mainListInsert.size(); i++){
            db.createMainListEntry(mainListInsert.get(i));
        }
        //Insert Recipe Values into Database
        //Insert Recipe Values into Database

        ArrayList<Recipe> recipeListInsert = control.getRecipeList().getRecipes();

        for(int j = 0; j < recipeListInsert.size(); j++){
            Recipe currentRecipe = recipeListInsert.get(j);
            Tag currentRecipeTag = new Tag(currentRecipe.getName());
            long currentRecipeId = db.createTag(currentRecipeTag);
            ArrayList<FoodItem> currentIngredients = currentRecipe.getIngredients().getItems();
            for(int k = 0; k < recipeListInsert.size(); k++){
                db.createFoodListEntry(currentIngredients.get(k), new long[] { currentRecipeId });
            }
        }*/

        db.closeDB();


    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }
}








