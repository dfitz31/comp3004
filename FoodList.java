import java.util.*

public class FoodList{
	private ArrayList<FoodItem> foodItems;
	
	public FoodList(){}
	
	public FoodList(ArrayList foodItems){
		this.foodItems = foodItems;
	}
	
	public FoodItem getItem(int itemNum){
		foodItems.get(itemNum);
	}
	public FoodItem getItem(FoodItem item){
		foodItems.get(item);
	}
	public ArrayList getItems(){
		return foodItems;
	}
	public void addItem(FoodItem item){
		foodItems.add(item)
		Collections.sort(foodItems);
	}
}