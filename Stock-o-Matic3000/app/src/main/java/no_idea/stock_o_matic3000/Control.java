package no_idea.stock_o_matic3000;

public class Control{
    private FoodList foods;
    private RecipeList recipes;
    private FoodItem holder;
 
    public Control(){
        foods = new FoodList();
        recipes = new RecipeList();
        generate();
        holder = foods.getItem(1);
    }
 
    public void generate(){
        FoodItem apple = new FoodItem("Apple", 4, 9, 24, 2017);
        FoodItem orange = new FoodItem("Orange", 4, 9, 29, 2017);
        FoodItem sausage = new FoodItem("Sausage", 3, 9, 25, 2017);
        FoodItem potato = new FoodItem("Potato", 6, 9, 30, 2017);
        FoodItem butter = new FoodItem("Butter", 1, 9, 12, 2017);
        FoodItem steak = new FoodItem("Steak", 1, 9, 14, 2017);
        FoodItem tomato = new FoodItem("Tomato", 2, 9, 15, 2017);
        FoodItem celery = new FoodItem("Celery", 3, 9, 1, 2017);
        FoodItem mustard = new FoodItem("Mustard", 1, 9, 6, 2017);
        FoodItem bread = new FoodItem("Bread", 1, 9, 7, 2017);

        foods.addItem(apple);
        foods.addItem(orange);
        foods.addItem(sausage);
        foods.addItem(potato);
        foods.addItem(butter);
        foods.addItem(steak);
        foods.addItem(tomato);
        foods.addItem(celery);
        foods.addItem(mustard);
        foods.addItem(bread);

        Recipe a = new Recipe();
        a.setName("Butter Steak");
        a.addIngredient(steak);
        a.addIngredient(butter);


        Recipe b = new Recipe();
        b.setName("Slightly Warm Apple");
        b.addIngredient(apple);
        b.addIngredient(butter);
        b.addIngredient(celery);
        b.addIngredient(tomato);
    }
    // will take in a food name and expiry date and place it in the food list specified.
    public void addFood(String name, String numItem, String date){
        int d = 0;
        int m = 0;
        int y = 0;

        String[] parts = date.split("/");
        for(int i = 0; i < parts.length; i++){
            if(i == 0){
                d = Integer.parseInt(parts[i]);
            }
            else if(i == 1){
                m = Integer.parseInt(parts[i]);
            }
            else{
                y = Integer.parseInt(parts[i]);
            }
        }
        foods.addItem(new FoodItem(name, Integer.parseInt(numItem), d, m, y));
    }

    public void editFood(FoodItem edits, String name, String numItem, String date){

        int d = 0;
        int m = 0;
        int y = 0;

        String[] parts = date.split("/");
        for(int i = 0; i < parts.length; i++){
            if(i == 0){
                d = Integer.parseInt(parts[i]);
            }
            else if(i == 1){
                m = Integer.parseInt(parts[i]);
            }
            else{
                y = Integer.parseInt(parts[i]);
            }
        }
        edits.setDay(d);
        edits.setMonth(m);
        edits.setYear(y);
        edits.setName(name);
        edits.setQuantity(Integer.parseInt(numItem));
    }

    // will take in a food name and expiry date and remove it from the food list specified.
    public void removeFood(FoodItem food){
        foods.removeItem(food);
    }

    //adds a recipe to the list
    public void addRecipe(Recipe recipe){
        recipes.addRecipe(recipe);
     }


    public FoodItem getFoodItem(int index){
        return foods.getItem(index);
    }
    //removes recipe by specified recipe
    public void removeRecipe(Recipe recipe){
        recipes.removeRecipe(recipe);
    }

    //removes recipe by specified recipe index
    public void removeRecipe(int recipe){
        recipes.removeRecipe(recipe);
    }
    public String[] listFoodString(){
        return foods.toStringArray();
    }

    public void setHolder(FoodItem newItem) { holder = newItem; }
    public FoodItem getHolder() { return holder; }

 //FoodItem(String name, int quantity, int month, int day, int year)
 //public void 

}