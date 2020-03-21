package testdata;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonObject {

    public static void main(String[] args) {
	String message;
	JSONObject obj = new JSONObject();

	obj.put("test1", "value");

	JSONArray jArray = new JSONArray();
	JSONObject item = new JSONObject();
	item.put("name", "peter");
	jArray.put(item);

	JSONObject item2 = new JSONObject();
	item2.put("age", 32);
	jArray.put(item2);

	JSONObject item3 = new JSONObject();
	item3.put("city", "Newyork");
	jArray.put(item3);

	obj.put("test2", jArray);

	message = obj.toString();
	System.out.println(message);
    }

}
