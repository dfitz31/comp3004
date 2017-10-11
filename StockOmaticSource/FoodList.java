import java.util.*

public class FoodList{
	private int size;
	private ArrayList<FoodItem> foodItems;
	
	public FoodList(){
		foodItems = new ArrayList<FoodItem>;
		size = 0;
	}
	
	public FoodList(ArrayList foodItems){
		this.foodItems = foodItems;
		size = this.foodItems.size();
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