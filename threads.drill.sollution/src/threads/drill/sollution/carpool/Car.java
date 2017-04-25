package threads.drill.sollution.carpool;

/**
 * The car class represents a car with id and distance traveled in km. It has a
 * method for driving the car.
 * 
 * @author Eldar
 */
public class Car {

	// attributes
	private int id;
	private int km;

	// CTOR
	/**
	 * Create a car instance with the specified id.
	 * 
	 * @param id
	 *            The id of this car.
	 */
	public Car(int id) {
		super();
		this.id = id;
	}

	// methods
	/**
	 * Drive this car for the specified distance, which determines the drive
	 * time (distance seconds). Calling this method will generate a message
	 * about the start and the end of this drive.
	 */
	public void drive(int distance) {

		// get a reference to the current thread
		Thread driver = Thread.currentThread();

		synchronized (this) {
			System.out.println(driver.getName() + " started at " + this.km + " for " + distance + " km drive on car "
					+ this.id + ".");
			try {
				Thread.sleep(distance * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			km += distance;
			System.out.println(driver.getName() + " finished at " + this.km + " on car " + this.id + ".");
		}
	}

	/**
	 * Returns the id of this car
	 * 
	 * @return The id of this car.
	 */
	public int getId() {
		return id;
	}

}
