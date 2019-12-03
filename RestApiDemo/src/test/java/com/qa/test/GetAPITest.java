package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

import com.qa.util.TestUtil;

public class GetAPITest extends TestBase {

    TestBase testBase;
    String serviceUrl;
    String apiUrl;
    String url;
    RestClient restClient;
    CloseableHttpResponse closeablehttpResponse;

    @BeforeMethod
    public void setUp() {

	testBase = new TestBase();
	serviceUrl = prop.getProperty("URL");
	apiUrl = prop.getProperty("serviceURL");
	url = serviceUrl + apiUrl;

    }

    @Test
    public void getAPITest() throws ClientProtocolException, IOException, JSONException {
	restClient = new RestClient();
	closeablehttpResponse = restClient.get(url);

	// 2.Status Code
	int statusCode = closeablehttpResponse.getStatusLine().getStatusCode();
	System.out.println("Status Code :" + statusCode);

	Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");

	// 3.Json String
	String responseString = EntityUtils.toString(closeablehttpResponse.getEntity(), "UTF-8");
	JSONObject responseJson = new JSONObject(responseString);
	System.out.println("Response Json from API--->" + responseJson);

	String perPageValue = TestUtil.getValueByJPath(responseJson, "/per_page");
	System.out.println("Per Page Value--->" + perPageValue);

	Assert.assertEquals(perPageValue, "3");

	String total = TestUtil.getValueByJPath(responseJson, "/total");
	System.out.println("Total Page--->" + perPageValue);

	Assert.assertEquals(total, "12");
	/*
	 * 
	 * String lastname =
	 * TestUtil.getValueByJPath(responseJson,"/data[0]/last_name");
	 * 
	 * String id = TestUtil.getValueByJPath(responseJson,"/data[0]/id");
	 * 
	 * String avatar = TestUtil.getValueByJPath(responseJson,"/data[0]/avatar");
	 * 
	 * String firstname =
	 * TestUtil.getValueByJPath(responseJson,"/data[0]/first_name");
	 * System.out.println(lastname); System.out.println(id);
	 * System.out.println(avatar); System.out.println(firstname);
	 */

	// Assert.assertEquals(lastname, "Bluth");

	// 4.All Heaaders
	Header[] headerArray = closeablehttpResponse.getAllHeaders();

	HashMap allHeader = new HashMap<String, String>();

	for (Header header : headerArray) {
	    allHeader.put(header.getName(), header.getValue());
	}

	System.out.println("Headers Array-->" + allHeader);
    }

    @Test
    public void getAPITestWithHeaders() throws ClientProtocolException, IOException, JSONException {
	restClient = new RestClient();

	HashMap<String, String> headerMap = new HashMap<String, String>();
	headerMap.put("Content-Type", "application/json");
	/*
	 * headerMap.put("username", "test@amazon.com"); headerMap.put("password",
	 * "test213");
	 */
	closeablehttpResponse = restClient.get(url, headerMap);

	// 2.Status Code
	int statusCode = closeablehttpResponse.getStatusLine().getStatusCode();
	System.out.println("Status Code :" + statusCode);

	Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");

	// 3.Json String
	String responseString = EntityUtils.toString(closeablehttpResponse.getEntity(), "UTF-8");
	JSONObject responseJson = new JSONObject(responseString);
	System.out.println("Response Json from API--->" + responseJson);

	String perPageValue = TestUtil.getValueByJPath(responseJson, "/per_page");
	System.out.println("Per Page Value--->" + perPageValue);

	Assert.assertEquals(perPageValue, "3");

	String total = TestUtil.getValueByJPath(responseJson, "/total");
	System.out.println("Total Page--->" + perPageValue);

	Assert.assertEquals(total, "12");

	/*
	 * String lastname =
	 * TestUtil.getValueByJPath(responseJson,"/data[0]/last_name");
	 * 
	 * String id = TestUtil.getValueByJPath(responseJson,"/data[0]/id");
	 * 
	 * String avatar = TestUtil.getValueByJPath(responseJson,"/data[0]/avatar");
	 * 
	 * String firstname =
	 * TestUtil.getValueByJPath(responseJson,"/data[0]/first_name");
	 * System.out.println(lastname); System.out.println(id);
	 * System.out.println(avatar); System.out.println(firstname);
	 */
	// Assert.assertEquals(lastname, "Bluth");

	// 4.All Heaaders
	Header[] headerArray = closeablehttpResponse.getAllHeaders();

	HashMap allHeader = new HashMap<String, String>();

	for (Header header : headerArray) {
	    allHeader.put(header.getName(), header.getValue());
	}

	System.out.println("Headers Array-->" + allHeader);
    }
}
