/*
 * Ashwin R.
 * Per.5
 * 9-23-24
 * FoodTester.java
*/

public class FoodTester
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n");
		Food food1 = new Food ("baked", "banana", "muffins");
		food1.printForSale();
		Food food2 = new Food ("fried", "yam", "fritters");
		food2.printForSale();
		Pizza pizza = new Pizza ("pepperoni");
		pizza.printForSale();
		Food ddp = new DeepDishPizza("olives");
		ddp.printForSale();
		System.out.print("\n\n\n");
	}
}
