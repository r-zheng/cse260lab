import java.util.ArrayList;
public class CookingRecipe
{
	String name;
	ArrayList<RecipeIngredient> recipeIngredients = new ArrayList<RecipeIngredient>();
	
	public CookingRecipe(String name)
	{
		this.name = name;
	}
	
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity)
	{
		boolean inRecipe = false;
		
		for(RecipeIngredient x : recipeIngredients)
		{
			if(x.getName() == ingredient.getName())
			{
				x.setQuantity(quantity);
				inRecipe = true;
				break;
			}
		}
		
		if(!inRecipe)
		{
			RecipeIngredient recipeIngredient = new RecipeIngredient(ingredient, quantity);
			recipeIngredients.add(recipeIngredient);
		}
		System.out.println("success");
	}
	
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient)
	{
		boolean inRecipe = false;
		
		for(RecipeIngredient x : recipeIngredients)
		{
			if(x.getName() == ingredient.getName())
			{
				x.setQuantity(quantity);
				inRecipe = true;
				break;
			}
		}

		return null;
	}
	
	public static void main(String[] args)
	{
		Ingredient chicken = new Ingredient("chicken", "pounds", 50);
		CookingRecipe fried = new CookingRecipe("fried");
		fried.addOrUpdateRecipeIngredient(chicken, 12);
	}
}
