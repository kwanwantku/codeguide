package codeguide;

/**
 * The cakes make form the factory by extends the bakery factory by using open/close principle.
 * @author pranger54
 * @version 1.0
 * @since 1.3.2017
 */
public class Cakes extends BakeryFactory{

	/**
	 * the process of the cake that called the methods from the BakeryFactory.
	 */
	public void process() {
		
		System.out.println("Cakes");
		System.out.println();
		addIngredients("White Sugar");
		addIngredients("Flour");
		addIngredients("Eggs");
		addIngredients("Butter");
		addIngredients("cream");
		addIngredients("Food Color");
		setAmount(20);
		showIngredients();
		System.out.println("processing Cakes");
		finish();
		System.out.println();
	}

}
