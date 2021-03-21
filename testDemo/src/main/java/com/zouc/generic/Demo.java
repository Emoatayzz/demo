package com.zouc.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : zoucong@asiainfo.com
 * @desciption :
 * @date : 2020-06-18
 **/
public class Demo {
	public static void main(String[] args) {
		List<Map<String, Object>> list=new ArrayList<>();
		Map<String, Object> m1=new HashMap<>();
		m1.put("role", 1);
		m1.put("compkey", "127.0.0.1|ip1");
		m1.put("res_id", 1);
		Map<String, Object> m2=new HashMap<>();
		m2.put("role", 1);
		m2.put("compkey", "127.0.0.1|ip1");
		m2.put("res_id", 1);
		Map<String, Object> m3=new HashMap<>();
		m3.put("role", 1);
		m3.put("compkey", "137.0.249.50|redis_server_9050");
		m3.put("res_id", 1);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.stream().forEach(map -> {

			String ip = map.get("compkey").toString().split("\\|")[0];
			map.keySet().removeIf(key -> !"compkey".equals(key));
			map.put("ip", ip);
		});
		System.out.println(list.toString());
	}
}
