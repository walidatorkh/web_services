package threads.drill.sollution.carpool;

public class Main {

	public static void main(String[] args) {

		// משתנה למרחק נסיעה
		int drivingDistance;

		// לולאה שרצה 5 איטרציות
		for (int i = 1; i <= 5; i++) {
			// אתחול אקראי של מרחק נסיעה
			drivingDistance = (int) (Math.random() * 6);
			// יצירת נהג עם שם ספציפי
			Thread d = new Thread(new CarDriver(drivingDistance), "d" + i);
			// התחלת הנהג
			d.start();
		}

	}
}
