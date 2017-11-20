import java.util.Random;

/**
 * TODO: nothing, this should be okay
 */
public class Stocker extends Employee {
	
	int shelves = 15;
	
	public Stocker () {
		
	}
	
	public Stocker (String name, int salary) {
		this.name = name;
		this.salary = salary;
		
	}
	
	/**
	 * a method which randomly determines if the Stocker has finished stocking the selves
	 * @return 
	 */
	public Boolean StockShelf() {
		Random rand = new Random();
		Boolean Finished = rand.nextBoolean();
		if(Finished == true) {
			shelves++;
			return true;
		}
		else {
			return false;
		}
	}

	public int StockShift () {
		Stocker stocker = new Stocker();
		while (stocker.StockShelf()) {
		stocker.StockShelf();
	}
	int sum = stocker.shelves;
	return sum;
}
		
		
		
	}
