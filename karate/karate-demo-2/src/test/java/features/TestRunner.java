
package features;

import com.intuit.karate.junit5.Karate;

public class TestRunner {

	@Karate.Test
	Karate getAPITest() {
		return Karate.run("GetApiTest").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate postAPITest() {
		return Karate.run("RandomMail").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate putAPITest() {
		return Karate.run("PutApi").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate deleteAPITest() {
		return Karate.run("DeleteE2E").relativeTo(getClass());
	}
}
