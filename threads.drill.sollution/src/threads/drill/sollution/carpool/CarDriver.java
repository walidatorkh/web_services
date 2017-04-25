package threads.drill.sollution.carpool;

/**
 * The CarDriver class is a Runnable representing a car driver that takes a car
 * from a car pool, drive it and returns it to the car pool.
 * 
 * @author Eldar
 */
public class CarDriver implements Runnable {

	// attribute
	private int drivingDistance;

	// CTOR
	/**
	 * Create a CarDriver runnable instance with the specified travel distance
	 * this car driver is about to go.
	 * 
	 * @param drivingDistance
	 *            The travel distance.
	 */
	public CarDriver(int drivingDistance) {
		super();
		this.drivingDistance = drivingDistance;
	}

	// method
	/**
	 * Take a car from the car pool. Drive it. Return the car to the car pool.
	 */
	@Override
	public void run() {

		// get a reference to the car pool
		CarPool carPool = CarPool.getInstance();
		// get a car
		Car car = carPool.getCar();
		// drive
		car.drive(drivingDistance);
		// return the car
		carPool.returnCar(car);

	}

}
