import java.util.*

public class RecipeList{
	private ArrayList Recipes;
	private int size;
	
	
	//creates an empty recipe list
	public RecipeList(){
		Recipes = new ArrayList<Recipe>;
		size = 0;
	}
	
	//adds a recipe
	public void addRecipe(Recipe R){
		Recipes.add(R);
		size = Recipes.size();
	}
	
	//returns a recipe
	public Recipe getRecipe(int index){
		return Recipes.get(index)
	}
}