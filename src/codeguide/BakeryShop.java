package codeguide;

/**
 * The BakeryShop with the finish cake and cookies to initialize with amount sell it.
 * @author pranger54
 * @version 1.0
 * @since 1.3.2017
 */
public class BakeryShop {
	
	/**
	 * The main that create the process by using the open/close principle.
	 * @param args that collect the args to work in main.
	 */
	public static void main(String[] args) {
		 
		Cakes cake1 = new Cakes();
		cake1.process();
		Cookies cookie1 = new Cookies();
		cookie1.process();
		
 
	}
	
	
}
