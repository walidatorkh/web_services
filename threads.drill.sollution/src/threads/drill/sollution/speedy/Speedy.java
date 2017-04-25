package threads.drill.sollution.speedy;

/**
 * The Speedy class represents a runnable that racing another thread counting
 * from 1 to 10.
 * 
 * @author Eldar
 */
public class Speedy implements Runnable {

	// a reference to the other speedy thread
	private Thread otherSpeedy;
	// a reference to a shared object key for synchronization
	private Object sharedKey;

	/**
	 * Creates a speedy instance
	 * 
	 * @param sharedKey
	 *            A shared object key for synchronized blocks
	 */
	public Speedy(Object sharedKey) {
		this.sharedKey = sharedKey;
	}

	/**
	 * Sets the other speedy thread instance to race with.
	 * 
	 * @param otherSpeedy
	 *            The other speedy thread.
	 */
	public void setOtherSpeedy(Thread otherSpeedy) {
		this.otherSpeedy = otherSpeedy;
	}

	/**
	 * Start counting from 1 to 10 for as long as not interrupted. When done
	 * check in a synchronized way if wins or looses to the other speedy thread
	 * and print appropriate message.
	 */
	@Override
	public void run() {

		Thread thisSpeedy = Thread.currentThread();

		int val = 0;
		for (int i = 1; i < 10 && !thisSpeedy.isInterrupted(); i++) {
			val = i;
			System.out.println(i + " - " + thisSpeedy.getName());
		}

		synchronized (sharedKey) {
			if (!thisSpeedy.isInterrupted()) {
				otherSpeedy.interrupt();
				val++;
				System.out.println(val + " - " + thisSpeedy.getName());
				System.out.println("WINNER: " + thisSpeedy.getName());
			} else {
				System.out.println(thisSpeedy.getName() + " lost. reached up to: " + val);
			}

		}
	}

}
