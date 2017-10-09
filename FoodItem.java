/**
 * Auto Generated Java Class.
 */
public class FoodItem {
  
 //Class variables
 String name; //Item Name
 String units; //Takes string for units used to measure quantity of food item, this is mostly optional and not really required for function
 
 int quantity; //Item Quantity
 int month; //Expiry Date Month
 int day; //Expiry Date Day
 int year; //Expiry Date Year
 int priorityCode; //Code to rate how close an item is getting to its expiry date or to being used up
  
 
 //Default Constructor to initialize variables
  public FoodItem() {
    
    this.name = "";
    this.units = "";
    this.quantity = 0;
    this.month = 0;
    this.day = 0;
    this.year = 0;
    this.priorityCode = 3;
  }
  
  //Constructor to create FoodItem and set all class variables 
  public FoodItem(String name, String units, int quantity, int month, int day, int year, int priorityCode){
  
    this.name = name;
    this.units = units;
    this.quantity = quantity;
    this.month = month;
    this.day = day;
    this.year = year;
    this.priorityCode = priorityCode;
  }
  
  //Name setter
  public void setName(String name){
 
    this.name = name;
  }
  
  //Name getter
  public String getName(String name){
    
   return this.name;
  }
  
  //Units setter
  public void setUnits(String units){
    this.units = units;
  }
  
  //Units getter
  
  public String getUnits(){
    return this.units;
  }
  
  //Quantity setter
  public void setQuantity(int quantity){
   this.quantity = quantity;
  }
  
  //Quantity getter
  public int getQuantity(){
  
    return this.quantity;
  }
  
  //Month setter
  public void setMonth(int month){
    
    this.month = month;
  }
  
  //Month getter
  public int getMonth(){
    
    return this.month;
  }
  
  //Day setter
  public void setDay(int day){
    
    this.day = day;
  }
  
  //Day getter
  public int getDay(){
    
    return this.day;
  }
  
  //Year setter
  public void setYear(int year){
    
    this.year = year;
  }
  
  //Year getter
  public int getYear(){
    
    return this.year;
  }
  
  //Priority Code setter
  
  public void setPriorityCode(int priorityCode){
    this.priorityCode = priorityCode;
  }
  
  //Priority Code getter
  
  public int getPriorityCode(){
    return this.priorityCode;
  }
  
  //Method to print out FoodItem information
  public void printFI(){
    
    System.out.println("Item name: " + this.name);
    System.out.println("Quantity: " + this.quantity + " " + this.units);
    System.out.println("Expiry date [MM/DD/YYYY]: " + this.month + "." + this.day + "." + this.year);
    System.out.println("Priority Code: " + this.priorityCode);
    
  }
  
  //Method to reduce quantity by a specified value, note that currently it is only very basic
  public void reduceQuantity(int amountUsed){
    
    if(amountUsed > this.quantity){
      System.out.println("Amount used cannot be greater than quantity of item (" + this.quantity + " " + this.units + "), please enter a valid number.");
    }
    else{
      this.quantity = this.quantity - amountUsed;
    }
    
  }
  
  public static void main(String args[]){
   
    FoodItem testItem = new FoodItem();
    
    testItem.setName("Milk");
    testItem.setUnits("mL");
    testItem.setQuantity(2000);
    testItem.setYear(2017);
    testItem.setDay(12);
    testItem.setMonth(10);
    testItem.setPriorityCode(3);
    
    testItem.printFI();
    
  }
      
}