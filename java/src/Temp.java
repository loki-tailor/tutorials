import java.util.Arrays;
import java.util.List;

/*-
	@author lokeshwar @created 11-07-2020
*/

public class Temp {

	public static void main(String[] args) {
		throw new CustomRunTimeException();
	}
}

class CustomRunTimeException extends RuntimeException {

}

/*- output

Exception in thread "main" CustomRunTimeException
        at Temp.main(Temp.java:11)

*/