/*
 * Ashwin R.
 * Per.5
 * 9-23-24
 * DeepDishPizza.java
*/

public class DeepDishPizza3 extends Pizza3 //creates subclass DeepDishPizza from Pizza
{
	public DeepDishPizza3(String ingredientIn) //constructor with ingredient
	{
		super(ingredientIn, "deep dish pizza"); //calls pizza constructor, passes ingredient and name
	}
	public DeepDishPizza3(String ingredientIn, int quantity, double cost) //constructor with ingredient
	{
		super(ingredientIn, "deep dish pizza", quantity, cost); //calls pizza constructor, passes ingredient and name
	}
}
