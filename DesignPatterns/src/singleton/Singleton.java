package singleton;

public class Singleton {

	private static Singleton singletonObj = null;

	private Singleton() {

		System.out.println("Singleton() is called..");

	}

	public static Singleton getSingletonObj() {

		if (singletonObj == null) {

			singletonObj = new Singleton();
		}

		return singletonObj;

	}

}
