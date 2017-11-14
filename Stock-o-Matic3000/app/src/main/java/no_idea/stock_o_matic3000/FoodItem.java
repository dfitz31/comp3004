package no_idea.stock_o_matic3000;

public class FoodItem {
  
 //Class variables
 private String name;   //Item Name
 private static int nextKey = 0;
 private int key;
    private int id = 0;
 private int quantity;  //Item Quantity
 private int month;     //Expiry Date Month
 private int day;       //Expiry Date Day
 private int year; //Expiry Date Year
 private String createdAt;
 
 //Default Constructor to initialize variables
  public FoodItem() {
    this.name = "";
    this.quantity = 0;
    this.month = 0;
    this.day = 0;
    this.year = 0;
    key = nextKey + 1;
    nextKey++;
  }
  
  //Constructor to create FoodItem and set all class variables 
  public FoodItem(String name, int quantity, int day, int month, int year){
  
    this.name = name;
    this.quantity = quantity;
    this.month = month;
    this.day = day;
    this.year = year;
      key = nextKey + 1;
      nextKey++;
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

  //key getter
  public int getKey() { return key;}
  
  //Year setter
  public void setYear(int year){
    this.year = year;
  }

  public void setId(int id) {this.id = id;}

  public int getId() {return this.id;}
  
  //Year getter
  public int getYear(){
    return this.year;
  }

    public void parseDate(String date){
        String[] parts = date.split("/");
        for(int i = 0; i < parts.length; i++){
            if(i == 0){
                day = Integer.getInteger(parts[i]);
            }
            else if(i == 1){
                month = Integer.getInteger(parts[i]);
            }
            else{
                year = Integer.getInteger(parts[i]);
            }
        }
    }

    public String toString(){return name;}
  
  public String getDate(){
      return getDay() + "/" + getMonth() + "/" + getYear();
  }

  public String getCreatedAt(){ return createdAt; }

  public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
  
}
