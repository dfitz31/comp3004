public class Control{
 public FoodList foods;
 private RecipeList recipes;
 
 public Control(){
  foods = new FoodList();
  recipes = new RecipeList();
 }
 
 public void generate(){
     foods.addItem(new FoodItem("Apple", 4, 9, 24, 2017));
     foods.addItem(new FoodItem("Orange", 4, 9, 29, 2017));
     foods.addItem(new FoodItem("Sausage", 3, 9, 25, 2017));
     foods.addItem(new FoodItem("Potato", 6, 9, 30, 2017));
     foods.addItem(new FoodItem("Butter", 1, 9, 12, 2017));
     foods.addItem(new FoodItem("Steak", 1, 9, 14, 2017));
     foods.addItem(new FoodItem("Tomato", 2, 9, 15, 2017));
     foods.addItem(new FoodItem("Celery", 3, 9, 1, 2017));
     foods.addItem(new FoodItem("Mustard", 1, 9, 6, 2017));
     foods.addItem(new FoodItem("Bread", 1, 9, 7, 2017));
 }
 //FoodItem(String name, int quantity, int month, int day, int year)
 //public void 

}