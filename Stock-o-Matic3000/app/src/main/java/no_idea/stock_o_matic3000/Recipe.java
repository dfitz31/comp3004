import java.util.*;
/*********************************
 *                               *
 *  Class: Recipe                *
 *  Purpose: Holds components of *
 *           a Recipe            *
 *                               *
*********************************/

public class Recipe{
 private FoodList ingredients;
 private ArrayList<String> instructions;
 
 /*********************************
  *                               *
  *       Constructors            *
  *                               *
  *********************************/
 
 //Empty Constructor
 public Recipe(){
  ingredients = new FoodList();
  instructions = new ArrayList();
 }
 
 //Constructor taking a food list
 public Recipe(FoodList ingredients){
  this.ingredients = ingredients;
 }
 
 //Contructor taking food list and instruction list
 public Recipe(FoodList ingredients, ArrayList instructions){
  this.ingredients = ingredients;
  this.instructions = instructions;
 }
 
 /*********************************
  *                               *
  *      Methods                  *
  *                               *
  *********************************/
 
 //adds specified ingredient
 public void addIngredient(FoodItem ingredient){
  ingredients.addItem(ingredient);
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
 public void addInstruction(String instruction){
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
}