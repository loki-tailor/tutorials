import java.util.HashMap;
import java.util.Iterator;

/*-
	@author lokeshwar @created 11-07-2020
*/

public class Temp {
	public static void main(String[] args) {
		HashMap hashmap = new HashMap();
		hashmap.put("Java", 1);
		hashmap.put("Hungry", 2);
		hashmap.put("Blogspot", 3);

		Iterator iteratorobject = hashmap.keySet().iterator();
		while (iteratorobject.hasNext()) {
			String hashmapkey = (String) iteratorobject.next();
			System.out.print(hashmap.get(hashmapkey));
		}
	}
}