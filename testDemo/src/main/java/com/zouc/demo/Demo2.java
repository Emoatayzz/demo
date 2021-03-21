package com.zouc.demo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : zoucong
 * @date : 2020-03-23
 **/
public class Demo2 {
	public static void main(String[] args) {
		/*Calendar startTime = Calendar.getInstance();
		startTime.set(Calendar.HOUR, startTime.get(Calendar.HOUR_OF_DAY) - 1);
		String startArg = DateFormatUtils.format(startTime, "yyyyMMddHHmmssSSS");
		System.out.println(startArg);*/
		Map<String, Object> instance1 = new HashMap<>();
		instance1.put("ip", "127.0.0.1");
		instance1.put("instName", "127.0.0.1|mysql-server-1");
		instance1.put("resId", 10001);
		Map<String, Object> instance2 = new HashMap<>();
		instance2.put("ip", "127.0.0.2");
		instance2.put("instName", "127.0.0.2|mysql-server-2");
		instance2.put("resId", 10001);
		Map<String, Object> instance3 = new HashMap<>();
		instance3.put("ip", "127.0.0.3");
		instance3.put("instName", "127.0.0.3|mysql-server-3");
		instance3.put("resId", 10003);
		List<Map<String, Object>> list= new ArrayList<>();
		list.add(instance3);
		list.add(instance2);
		list.add(instance1);
		list.removeIf(e-> !"127.0.0.1".equals(e.get("ip")));
		// System.out.println(list.toString());

		String s = "100";
		Long l = 100L;
		System.out.println(s.equals(l));
	}

}
