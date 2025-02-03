package concurrent.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {

		//Map<Integer, String> cMap = new HashMap<Integer, String>();

	ConcurrentHashMap<Integer, String> cMap = new ConcurrentHashMap<Integer, String>();

		cMap.put(1, "Taj Mahal");
		cMap.put(2, "Qutub Minar");
		cMap.put(3, "Char Minar");
		System.out.println(cMap);

		Set<Integer> keys = cMap.keySet();

		Iterator<Integer> it = keys.iterator();

		while (it.hasNext()) {
			Integer k = it.next();

			if (k == 2)
				cMap.put(4, "Gate of India");

			System.out.println(k + "  " + cMap.get(k));

		}

	}

}
