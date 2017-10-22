/**
 * Auto Generated Java Class.
 */
public class FoodItem {
  
 //Class variables
 String name; //Item Name
 int quantity; //Item Quantity
 int month; //Expiry Date Month
 int day; //Expiry Date Day
 int year; //Expiry Date Year
  
 
 //Default Constructor to initialize variables
  public FoodItem() {
    
    this.name = "";
    this.quantity = 0;
    this.month = 0;
    this.day = 0;
    this.year = 0;
  }
  
  //Constructor to create FoodItem and set all class variables 
  public FoodItem(String name, int quantity, int month, int day, int year){
  
    this.name = name;
    this.quantity = quantity;
    this.month = month;
    this.day = day;
    this.year = year;
  }
  
  //Name setter
  public void setName(String name){
    this.name = name;
  }
  
  //Name getter
  public String getName(){
 return this.name;
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
  
  public String getDate(){
      return getDay() + "/" + getMonth() + "/" + getYear();
  }
    
    
  

  
  
}
