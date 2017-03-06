package codeguide;

import java.util.ArrayList;
import java.util.List;

/**
 * The Bakery Factory the produce each bakeries by using open-close principles.
 * @author pranger54
 * @version 1.0
 * @since 1.3.2017
 *
 */
public class BakeryFactory {
	
	private int amount;
	private List<String> ingredients;
	
	/**
	 * The attribute of Bakery Factory with initialize to create the ingredients.
	 * Set amount for factory.
	 */
	public BakeryFactory() {
		this.amount = amount;
		this.ingredients = new ArrayList<String>();
	}
	
	/**
	 * The methods that add ingredients.
	 * @param ingredient - the ingredients that add to bakery.
	 */
	public void addIngredients(String ingredient) {
		ingredients.add(ingredient);
	}
	
	/**
	 * The methods that show ingredients to show all ingredients for bakery.
	 */
	public void showIngredients() {
		System.out.println("Ingredients");
		for(int i=0;i<ingredients.size();i++) {
			System.out.println(ingredients.get(i));
		}
	}
	
	
	/**
	 * To show the processing of each bakery.
	 */
	public void process() {
		System.out.println("processing");
	}
	
	/**
	 * To show the state which finish with the amount that make for bakery.
	 */
	public void finish() {
		System.out.println("Finish " + this.getAmount() + " pieces");
	}
	
	/**
	 * To get the amount of piece.
	 * @return the amount of each bakeries.
	 */
	public int getAmount() {
		return this.amount;
	}
	
	/**
	 * The methods that set the amount of each bakery
	 * @param amount of the each bakery.
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
