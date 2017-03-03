package codeguide;

public class Computer {
	
	private int count;
	
	public void hardware() {
		System.out.println("Hardware");
		processing();
		finishrun();
		
	}
	
	public void software() {
		System.out.println("Software");
		processing();
		finishrun();
	}
	
	public void processing() {
		System.out.println("processing");
	}

	
	public void finishrun() {
		System.out.println("finish");
	}

}
