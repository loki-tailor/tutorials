package com.hashmaps;

import java.util.HashMap;

import com.logics.Timer;

/***
 * 
 * @author lokeshwar.tailor
 * @date 24-04-21
 * 
 * 		Purpose: 
 * 			- Check what happens when HashMap.get() returns null
 * 			- i.e. is it required to do .containsKey() rather than simply doing HashMap.get()?
 * 			- but if that get() returns another map, and we do a get again on that map
 * 			- then we might run into NPE, hence in that case prefer .get() != null, and it's is required
 * 			- since, containsKey() underhood does => getNode(key) != null
 * 
 *       ref:
 *       https://stackoverflow.com/questions/14601016/is-using-java-map-containskey-redundant-when-using-map-get
 * 
 * 		================================================================================
 *
 *       Explaination from one of the answers:

			I think it is fairly standard to write:

			Object value = map.get(key);
			if (value != null) {
				//do something with value
			}
			instead of

			if (map.containsKey(key)) {
				Object value = map.get(key);
				//do something with value
			}	

			It is not less readable and slightly more efficient so I don't see any reasons not to do it. 
			Obviously if your map can contain null, the two options don't have the same semantics.
* 		======================================================================================			
 *
 */
public class NullFrmNestedMap {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, String>> map = new HashMap<>();
		map.put("1", new HashMap<>());
		map.get("1").put("1.k.1", "1.v.1");

		long startTimer = Timer.startTimer();
		HashMap<String, String> hashMap = null;
		for (int i = 0; i <= 10d; i++) {
			hashMap = map.get("2");
			String tmp = hashMap == null ? null : hashMap.get("bla");
			 hashMap.containsKey("2");
			System.out.println(i + " - " + tmp);
		}
		System.out.println(Timer.timeDifference(startTimer, Timer.stopTimer()));

	}

}
