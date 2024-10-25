/*
 * Ashwin R.
 * Per.5
 * 9-23-24
 * Pizza.java
*/

public class Pizza3 extends Food3		//creates sublcass Pizza from Food
{
	public Pizza3()	//basic constructor
	{
		super("baked", "cheese", "pizza"); //calls Food constructor
	}
	
	public Pizza3(String ingredientIn) //constructor with ingredient
	{
		super("baked", ingredientIn, "pizza"); //calls Food constructor
	}
	
	public Pizza3(String ingredientIn, String name) //constructor w/ ingredient and name
	{
		super("baked", ingredientIn, name); //calls Food constructor
	}
	public Pizza3(String ingredientIn,int quantity, double cost)
	{
		super("baked", ingredientIn, "pizza", quantity, cost);
	}
	public Pizza3(String ingredientIn, String name, int quantity, double cost)
	{
		super("baked", ingredientIn, name, quantity, cost);
	}
}
