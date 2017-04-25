package threads.drill.sollution.speedy;

public class Main {

	public static void main(String[] args) {

		Object sharedKey = new Object();

		Speedy s1 = new Speedy(sharedKey);
		Thread t1 = new Thread(s1, "s1");

		Speedy s2 = new Speedy(sharedKey);
		Thread t2 = new Thread(s2, "s2");

		s1.setOtherSpeedy(t2);
		s2.setOtherSpeedy(t1);

		System.out.println("Start!");
		t1.start();
		t2.start();

	}

}
