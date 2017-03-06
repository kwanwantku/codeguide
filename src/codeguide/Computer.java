package codeguide;

/**
 * The methods that processing computer by using the DRY principle
 * You see the using in the software and hardware methods.
 * @author pranger54
 * @version 1.0
 * @since 1.3.2017
 */
public class Computer {

	
	/**
	 * Tell the hardware part is working.
	 */
	public void hardware() {
		System.out.println("Hardware");
		processing();
		finishrun();
		
	}
	
	/**
	 * Tell the software part is working.
	 */
	public void software() {
		System.out.println("Software");
		processing();
		finishrun();
	}
	
	/**
	 * The computer is processing.
	 */
	public void processing() {
		System.out.println("processing");
	}

	/**
	 * To tell that the computer finish running.
	 */
	public void finishrun() {
		System.out.println("finish");
	}

}
