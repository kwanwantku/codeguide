package codeguide;

public class Cakes extends BakeryFactory{

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
