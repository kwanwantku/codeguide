package codeguide;

import java.util.ArrayList;
import java.util.List;

public class BakeryFactory {
	
	private int amount;
	private List<String> ingredients;
	
	public BakeryFactory() {
		this.amount = amount;
		this.ingredients = new ArrayList<String>();
	}
	
	public void addIngredients(String ingredient) {
		ingredients.add(ingredient);
	}
	
	public void showIngredients() {
		System.out.println("Ingredients");
		for(int i=0;i<ingredients.size();i++) {
			System.out.println(ingredients.get(i));
		}
	}
	
	
	public void process() {
		System.out.println("processing");
	}
	
	public void finish() {
		System.out.println("Finish " + this.getAmount() + " pieces");
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
