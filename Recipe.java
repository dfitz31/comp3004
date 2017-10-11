public class Recipe{
	private FoodList ingredients;
	private ArrayList<String> instructions;
	
	public Recipe(){
		ingredients = new FoodList;
		instructions = new ArrayList<String>;
	}
	public Recipe(FoodList ingredients){
		this.ingredients = ingredients;
	}
	public Recipe(FoodList ingredients, ArrayList instructions){
		this.ingredients = ingredients;
		this.instructions = instructions;
	}
	public void addIngredient(FoodItem ingredient){
		ingredients.addItem(ingredient);
	}
	public void removeIngredient(FoodItem ingredient){
		ingredients.removeItem(ingredient);
	}
	public void removeIngredient(int itemNum){
		ingredients.removeItem(itemNum);
	}
	public void addInstruction(String instruction){
		instructions.add(instruction);
	}
	public ArrayList getInstructions(){
		return instructions;
	}
	public ArrayList getInstruction(int instrucNum){
		return instructions.get(instrucNum);
	}
}