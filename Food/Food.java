/*Ashwin R.
 * Per 5
 * 10-23-24
  Food.java
  
  Working on: writing programs with inheritance and using super/subclasses.
  
*/


public class Food
{
	protected String str;
	
	public Food ()
	{
		str = new String("");
	}
	
	public Food (String prepMethod, String ingredient, String name)
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
	}

	public void printForSale()
	{
		System.out.println(str);
	}
}


/*
In FoodTester's main method
		
*/
