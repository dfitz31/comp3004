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
     private Boolean hasAllItems;   //if the recipe has all the ingredients or not (f is no)

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
     //removes specified ingredient
     public void removeIngredient(FoodItem ingredient){
         ingredients.removeItem(ingredient);
     }

     //removes ingredient specified by index
     public void removeIngredient(int itemNum){
         ingredients.removeItem(itemNum);
     }

     //adds an instruction
     /* public void addInstruction(String instruction){
         instructions.add(instruction);
     }

     //gets all instructions
     public ArrayList getInstructions(){
         return instructions;
     }

     //gets specific instruction
     public String getInstruction(int instrucNum){
         return instructions.get(instrucNum);
     }

     //sets an instruction (for editing instructions)*/
}