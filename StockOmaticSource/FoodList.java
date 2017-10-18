import java.util.*;

public class FoodList{
 private int size;//number of items in the list
 private ArrayList<FoodItem> foodItems;
 
 public FoodList(){
  foodItems = new ArrayList<FoodItem>();
  size = 0;
 }
 
 //constructor using previous food list
 public FoodList(ArrayList<FoodItem> foodItems){
  this.foodItems = foodItems;
  size = this.foodItems.size();
 }
 
 //gets item using a number
 public FoodItem getItem(int itemNum){
  return foodItems.get(itemNum);
 }
 
 //gets the whole list of food items
 public ArrayList getItems(){
  return foodItems;
 }
 
 //adds an item
 public void addItem(FoodItem item){
  foodItems.add(item);
  //possibly pass comparator
  //Collections.sort(foodItems, FoodItem.name);
  setSize();
 }
 //removes by item
 public void removeItem(FoodItem item){
  foodItems.remove(item);
  setSize();
 }
 
 //removes by position in the list
 public void removeItem(int index){
  foodItems.remove(index);
  setSize();
 }
 
 private void setSize(){
  size = foodItems.size();
 }
 public String toString(){
  String toStr = "";
  if(size == 0){
   return "No Food";
  }
  else{
      int counter = 1;
      for(FoodItem item : foodItems){
        toStr = toStr + counter + ". " + item.getName() + " " + item.getQuantity() + " " + item.getDate();
        toStr = toStr + '\n';
        counter++;
   }
  }
  return toStr;
 }
}