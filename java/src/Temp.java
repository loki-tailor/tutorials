/*-
	@author lokeshwar @created 11-07-2020
*/

import java.util.Map;
public class Temp {
	public static void main(String[] args) {

		// NOTE when next time coming here: DELETE old code :)
	    	Map<String, String> env = System.getenv();
        	for (String envName : env.keySet()) {
        	    System.out.format("%s=%s%n", envName, env.get(envName));        
		}
	}
}
