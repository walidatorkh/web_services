package threads.drill.sollution.carpool;

import java.util.LinkedList;
import java.util.List;

/**
 * The CarPool class is a singleton (only one instance per JVM process is
 * available). It represents a collection of car instances with a maximum size
 * of up to 3 cars. It has methods for getting and returning cars.
 * 
 * @author Eldar
 */
public class CarPool {

	/** The maximum number of cars in the pool. */
	public static final int POOL_SIZE = 3;
	private static CarPool instance = new CarPool();
	private List<Car> cars = new LinkedList<>();

	private CarPool() {

		for (int i = 1; i <= POOL_SIZE; i++) {
			cars.add(new Car(100 + i));
		}
	}

	/**
	 * Returns the car pool singleton.
	 * 
	 * @return The car pool instance
	 */
	public static CarPool getInstance() {
		return instance;
	}

	/**
	 * Get a car from pool. If pool is empty the client is put to wait until a
	 * car is available. An appropriate message is printed to console when a car
	 * is given to client or when the client is put to wait.
	 * 
	 * @return A car instance from car pool.
	 */
	public synchronized Car getCar() {
		Thread currThread = Thread.currentThread();

		while (cars.isEmpty()) {
			try {
				System.out.println(
						"== car pool message: Hello " + currThread.getName() + " car pool empty, please wait. ==");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Car car = cars.remove(0);
		System.out.println("== car pool message: " + currThread.getName() + " got car: " + car.getId());
		return car;
	}

	/**
	 * Return a car to pool. An appropriate message is printed to console.
	 * 
	 * @param car
	 *            The car to be returned.
	 */
	public synchronized void returnCar(Car car) {
		cars.add(0, car);
		Thread currThread = Thread.currentThread();
		System.out.println(
				"== car pool message: Hello " + currThread.getName() + " thanks for returning car " + car.getId());
		notify();
	}
}
