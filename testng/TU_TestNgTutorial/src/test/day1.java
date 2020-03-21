package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

    @Parameters({ "URL" })
    @Test
    public void demo(String urlname) {
	System.out.println("Testing ");
	System.out.println(urlname);
    }

    @Test(dataProvider = "getData")
    public void demo1(String username, String pass) {
	System.out.println("Testing demo1 ");
	System.out.println(username);
	System.out.println(pass);
    }

    @DataProvider
    public Object[][] getData() {
	Object[][] data = new Object[3][2];
	data[0][0] = "firstsetusername";
	data[0][1] = "password";

	data[1][0] = "secondsetusername";
	data[1][1] = "secondpassword";

	data[2][0] = "thirdsetusername";
	data[2][1] = "thirdpassword";

	return data;

    }

}
