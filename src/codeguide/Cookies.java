package codeguide;

public class Cookies extends BakeryFactory {

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
