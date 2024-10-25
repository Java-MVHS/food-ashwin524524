/*
 * Ashwin R.
 * Per.5
 * 9-23-24
 * Pizza.java
*/

public class Pizza extends Food		//creates sublcass Pizza from Food
{
	public Pizza()	//basic constructor
	{
		super("baked", "cheese", "pizza"); //calls Food constructor
	}
	
	public Pizza(String ingredientIn) //constructor with ingredient
	{
		super("baked", ingredientIn, "pizza"); //calls Food constructor
	}
	
	public Pizza(String ingredientIn, String name) //constructor w/ ingredient and name
	{
		super("baked", ingredientIn, name); //calls Food constructor
		
	}
}
