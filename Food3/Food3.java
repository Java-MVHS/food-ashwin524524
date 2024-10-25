/*Ashwin R.
 * Per 5
 * 10-23-24
  Food.java
  
  Working on: writing programs with inheritance and using super/subclasses.
  
*/


public class Food3
{
	protected String str;
	//protected int quantity;
	//protected double cost;
	
	public Food3 () //basic constructor
	{
		str = new String("");
	}
	
	public Food3 (String prepMethod, String ingredient, String name) //constructor for food without cost
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient; //takes name, prepmethod, ingredient
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int quantity, double cost) //constructor for food to be sold.
		double total = quantity*cost; // calculates total to be made
		str = str.format("At the sale: %s %s with %s will be sold for %.0f cents each. With %d %s(s), $%.2f can be made.",name,prepMethod,ingredient,cost*100,quantity,name,total);
		//takes name, prep, ingredient, cost quantity, and formats.
		//converts price to cents
	}

	public void printForSale() //print method
	{
		System.out.println(str); //prints out full string
	}
}


/*
In FoodTester's main method
		
*/
