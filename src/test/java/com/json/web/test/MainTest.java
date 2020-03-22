package com.json.web.test;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class MainTest {

	
	
	
	
	public static void main11(String[] args) {
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		String string = "{\"name\":\"李四\",\"city\":\"广东\"}";
		JSONObject str = (JSONObject) JSONObject.parse(string);
		
		JSONObject ss = JSON.parseObject(string);
		String name = ss.getString("name");
		String city = (String) ss.get("city");
		System.out.println(name);
		System.out.println(city);
		System.out.println("====" + str.getString("name"));
	}
	
	
	
	public static void main21(String[] args) {
		
String string  = "{\"listData\":[{\"name\":\"李四\",\"city\":\"北京\"},{\"name\":\"张三\",\"city\":\"上海\"}]}";
String string2 = "{\"listData\":[{\"name\":\"\",\"city\":\"\"},{\"name\":\"\",\"city\":\"\"}]}";	
String string3 = "{\"listData\":[]}";
      // 转map
      Map<String, Object> map  = JSON.parseObject(string2, Map.class);
      
      JSONArray  listData = (JSONArray) map.get("listData");
//      JSONArray listResult = JSON.parseArray(listData);
      if (listData.size() == 0) {
		System.out.println("---");
	} else {
      for (Object object : listData) {
		JSONObject  user = (JSONObject) object;
		System.out.println(user.get("name") +"," + user.get("city"));
      }
	}
	}	
	
}
