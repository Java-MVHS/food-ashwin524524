/*
 * Ashwin R.
 * Per.5
 * 9-23-24
 * FoodTester.java
*/

public class FoodTester3
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n");
		Food3 food1 = new Food3 ("baked", "banana", "muffins");
		food1.printForSale();
		Food3 food2 = new Food3 ("fried", "yam", "fritters");
		food2.printForSale();
		Pizza3 pizza = new Pizza3 ("pepperoni");
		pizza.printForSale();
		Pizza3 pz3 = new Pizza3("anchovies" ,12, 0.56);
		pz3.printForSale();
		DeepDishPizza3 ddpz3 = new DeepDishPizza3("olives", 5, 0.99);
		ddpz3.printForSale();
		System.out.print("\n\n\n");
	}
}
