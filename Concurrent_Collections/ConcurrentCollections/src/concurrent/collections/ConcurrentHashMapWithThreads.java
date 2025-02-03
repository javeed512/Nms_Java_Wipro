package concurrent.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapWithThreads extends Thread {

	 static ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<Integer,String>();

	//static HashMap<Integer, String> map = new HashMap<Integer, String>();

	public void run() {

		try {
			Thread.sleep(1000);
			// Child thread trying to add
			// new element in the object
			map.put(103, "D");
		} catch (InterruptedException e) {
			System.out.println("Child Thread going to add element");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		map.put(100, "A");
		map.put(101, "B");
		map.put(102, "C");
		ConcurrentHashMapWithThreads t = new ConcurrentHashMapWithThreads();
		t.start();

		for (Object entry : map.entrySet()) {
		
			System.out.println(entry);
			Thread.sleep(1000);
		}
		System.out.println(map);
	}
}