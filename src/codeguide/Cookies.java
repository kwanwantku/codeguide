package codeguide;

/**
 * The cookies make form the factory by extends the bakery factory by using open/close principle.
 * @author pranger54
 * @version 1.0
 * @since 1.3.2017
 */
public class Cookies extends BakeryFactory {

	/**
	 * the process of the cookies that called the methods from the BakeryFactory.
	 */
	public void process() {
		
		System.out.println("Cookies");
		System.out.println();
		addIngredients("Icing Sugar");
		addIngredients("Flour");
		addIngredients("Eggs");
		addIngredients("Butter");
		addIngredients("magarine");
		addIngredients("chocship");
		setAmount(10);
		showIngredients();
		System.out.println("processing Cakes");
		finish();
		System.out.println();
	}

}
